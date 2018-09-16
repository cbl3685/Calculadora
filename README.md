# Calculadora Con Notación Polaca Inversa

Esta es una calculadora que realiza operaciones ingresadas con notación polaca inversa. La calculadora está programada en Java y se utiliza a través de  consola. Al iniciar la calculadora, se muestra un menú con 5 opciones y el menú se muestra nuevamente al finalizar una acción, hasta que el usuario decida salir.

## Instrucciones
La caculadora cuenta con estas opciones:
1. Realizar una nueva operación
2. Mostrar Historial
3. Ordenar historial por resultados ascendentemente
4. Ordenar historial por resultados descendentemente
0. Salir

### 1. Realizar una nueva operación
Esta opción permite ingresar una nueva operación y obtener su resultado. La operación debe ser ingresada utilizando notación polaca inversa.
Por ejemplo, se pude ingresar la siguiente operación: **2 2 plus** y el resultado (**4**) será mostrado por el programa. Cada operación realizada se almacena en un historial de operaciones, excepto las operaciones que resulten en un error. Por ejemplo, la operación **2 2 plus plus** resultará en un error ya que no hay suficientes operandos para realizar una operación, y no será guardada en el historial. Las operaciones aceptadas son:
* PLUS: Realiza una Suma
* LESS: Realiza una Resta
* TIMES: Realiza una Multiplicación
* DIV: Realiza una División

*Nota: Las operaciones de resta y división en notación polaca inversa se traducen de la siguiente forma: 2 1 less = 2-1 ó 4 2 div = 4/2.*

### 2. Mostrar historial
Muestra las operaciones almacenadas en el historial hasta ese momento. Por defecto, las operaciones se muestran en el orden en que fueron ingresadas hasta que se decida ordenarlas de forma ascendente o descendente.

### 3. Ordernar historial por resultados ascendentemente
Ordena el historial de operaciones basándose en los resultados y las coloca de forma ascendente. Es decir, las operaciones que den un resultado menor, se encontrarán primero en el historial.

### 4. Ordenar historial por resultados descendentemente
Ordena el historial de operaciones basándose en los resultados y las coloca de forma descendente. Es decir, las operaciones que den un resultado mayor, se encontrarán primero en el historial.

### 0. Salir
Termina el programa y almacena el historial de operaciones en un archivo de texto llamado "Archivo-Historial". El historial es almacenado con el ordenamiento que se haya escogido. Si no es escoge un ordenamiento específico, las operaciones se guardarán en el orden en que fueron ingresadas.
