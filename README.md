# PROYECTO DEL SEGUNDO CUATRIMESTRE DE FUNDAMENTOS DE PROGRAMACIÓN EN JAVA (Curso 22/23)
Autor: Miguel García Vizcaíno   uvus: FSL4030

El dataset se basa en datos sobre empresas que distribuyen muebles de diferentes tipos. 
El dataset contiene entre otros datos, beneficio, fechas, paises donde se ha vendido 
el mueble y su tipo, entre otros datos.

## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
    * **fp.muebles**: Paquete que contiene los tipos del proyecto.
    * **fp.muebles.test**: Paquete que contiene las clases de test del proyecto.
    * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
    * **fp.utiles**:  Paquete que contiene las clases de utilidad.
* **/data**: Contiene el dataset o datasets del proyecto
    * **Muebles.csv**: Añade una descripción genérica del dataset.

## Estructura del *dataset*

`PONER LA URL DEL DATASET`

El dataset está compuesto por 23 columnas, con la siguiente descripción:

* **columna 1**: de tipo String, representa el _shipmode_, es decir, las diferentes opciones de transporte del producto.
* **columna 2**: de tipo Integer, representa las ventas obtenidas por ese mueble o muebles.
* **columna 3**: de tipo Integer, representa la cantidad de muebles vendidos en la transacción.
* **columna 4**: de tipo Integer, representa el descuento usado en la compra.
* **columna 5**: de tipo Integer, representa el beneficio obtenido de la venta.
* **columna 6**: de tipo String, representa el tipo de uso del mueble.
* **columna 7**: de tipo String, representa la región donde se hizo la compra.
* **columna 8**: de tipo String, representa el estado donde se hizo la compra.
* **columna 9**: de tipo String, representa la subcategoría del mueble.
* **columna 10**: de tipo String, representa la categoría del mueble.
* **columna 11**: de tipo Integer, representa el día en el que fue comprado se hizo la compra.
* **columna 12**: de tipo Integer, representa el mes en el que fue comprado se hizo la compra.
* **columna 13**: de tipo Integer, representa el año en el que fue comprado se hizo la compra.
* **columna 14**: de tipo Integer, representa el día en el que fue comprado se envio el producto.
* **columna 15**: de tipo Integer, representa el mes en el que fue comprado se envio el producto.
* **columna 16**: de tipo Integer, representa el año en el que fue comprado se envio el producto.
* **columna 17**: de tipo Integer, representa el tiempo de preparación antes del envio, es decir, la diferencia de tiempo entre que es pedido y se envía.
* **columna 18-23**: de tipo String, representa los paises por donde pasa el producto, no tienen por qué ser 6 paises.

