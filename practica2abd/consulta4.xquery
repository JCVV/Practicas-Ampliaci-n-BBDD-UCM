xquery version "3.0";
declare variable $id_noticia as xs:string external;
for $b in doc("bd-agregador.xml")/periodico/noticia
let $dia := data($b/fechaPublicacion/dia)
let $mes := data($b/fechaPublicacion/mes)
let $anyo := data($b/fechaPublicacion/anyo)
let $hora := data($b/fechaPublicacion/hora)
let $minuto := data($b/fechaPublicacion/minuto)
let $segundo := data($b/fechaPublicacion/segundo)
where $b/@id = $id_noticia
return <body>
    <div class="noticia">
        <div class="cabecera"><a href ="{$b/url}"> {data($b/titular)} </a></div>
        <div class="fecha">Publicado:  {concat($dia, "-",$mes,"-",$anyo, " a las ", $hora,"h ",$minuto,"m ",$segundo,"s")}.</div>
        <div class="etiquetas">Etiquetas: {string-join(($b/etiqueta),',')}. </div>
        <div class="entradilla">{data($b/entradilla)}</div>
        </div>
        {for $a in $b//comentario
                let $diaComent := data($a/fechaPublicacion/dia)
                let $mesComent := data($a/fechaPublicacion/mes)
                let $anyoComent := data($a/fechaPublicacion/anyo)
                let $horaComent := data($a/fechaPublicacion/hora)
                let $minutoComent := data($a/fechaPublicacion/minuto)
                let $segundoComent := data($a/fechaPublicacion/segundo)
                
                order by $a/fechaPublicacion
                    return 
        <div class="comentario">
            {for $c in doc("bd-agregador.xml")/periodico/usuario
                where $c/@nick = $a/@nick 
                return <div class="autor">{data($c/nombreCompleto)}</div>
            }
            
            <div class="fecha_com">{concat($diaComent, "-",$mesComent,"-",$anyoComent, " a las ", $horaComent,"h ",$minutoComent,"m ",$segundoComent,"s")}</div>
            <div class="texto">{data($a/texto)}</div>
         </div>   
            
        }
    
    
    </body>
