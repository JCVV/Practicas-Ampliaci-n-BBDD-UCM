xquery version "3.0";

declare variable $etiqueta as xs:string external;
for $b in doc("bd-agregador.xml")/periodico/noticia
where $b/etiqueta = $etiqueta
    return <resultado-noticia id="{data($b/@id)}" titular="{data($b/titular)}" />