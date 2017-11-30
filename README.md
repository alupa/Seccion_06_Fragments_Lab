# Seccion_06_Fragments_Lab
Laboratorio 6 Android - MyMail App.

Objetivo
--------
Crear una mini app de correos electrónicos. La llamaremos MyMail, y vamos a implementarla con fragments, consiguiendo tener el mismo patrón
de diseño que en la documentación Android vista en los vídeos anteriores (para handset o móvil 2 activities, para tablet 1 sólo, con una
distribución de 40-60 respectivamente).

Nuestro modelo POJO será MAIL y tendrá los siguientes atributos: Subject, Message, SenderName(ó emailAddress) y Color. El Color será
generado: 1) de forma aleatoria con un método estático en nuestra clase Útil y aplicado en el adapter ó 2) puede ser asignado en la creación de
cada Mail ficticio que crearemos (éste es obligatorio) en nuestra clase Útil, en un método llamado getDummyData por ejemplo( junto con el
subject, mensaje y sendername).
Los datos no tienen que ser reales o muy labrados, recuerda que el objetivo de esta lección es practicar los fragments y entender su
funcionamientos. El sender name sería una dirección de correo electrónico.

Tendremos un listView con los mails. El layout estará compuesto por: 1) La primera letra del remitente (según su senderName) 2) El título o
subject 3) El mensaje. Teniendo una distribución parecida a GMAIL de Google (écha un ojo a la app en la play store para entender mejor el diseño).
El color de la letra del remitente, tendrá un color de background diferente de forma aleatoria, no pasa nada si se repiten, éste color será tomado
de su propio atributo Color. Observa que es un círculo totalmente redondo, intenta investigar como hacerlo a través de Drawable, y si no lo
encuentras, no pasa nada, lo explicaré en el vídeo, mantenlo con una forma rectangular como por defecto viene.
No te preocupes en si se visualiza perfectamente los tamaños de letras, no es el objetivo, aunque puedes tratar de hacer que las letras para el
tablet sean un poco más grandes. De todas formas, esto será explicado en las secciones posteriores relacionadas al Responsive Design en
Android, céntrate en que los fragments tengan una distribución adecuada.

Cuando tengas montada la app, notarás que al abrir la app sin haber seleccionado ningún mail, la parte de detalles (En tablets) está con los
valores por defecto del layout, piensa alguna forma para que se presente en blanca, hasta que hagamos click a un correo.

Limita el tamaño máximo de los textos de la siguiente forma: Subject 40 , Message 80.

Cuando rotemos la pantalla, podemos experimentar efectos extraños, como que los círculos de los colores del correo, cambian de color, o la
pantalla de detalles se quede en blanca… NO PASA NADA, SE VERÁ EN LA SECCIÓN DE RESPONSIVE DESIGN :)
