xquery version "3.0";

subsequence(

	for $usuario in doc("bd-agregador.xml")/periodico/usuario
    let $cont := doc("bd-agregador.xml")/periodico/noticia/comentario[@nick=$usuario/@nick]

	order by count($cont) descending
	
	return <resultado-usr nombre=" {data($usuario/nombreCompleto)} " numero_comentarios= "{count($cont)}"/> , 1, 10)