xquery version "3.0";


for $b in doc("bd-agregador.xml")/periodico
return <resultado-etiquetas etiqueta="{string-join(distinct-values($b/noticia/etiqueta), ",")}" />