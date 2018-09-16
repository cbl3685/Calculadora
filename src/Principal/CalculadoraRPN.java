package Principal;

import java.util.Scanner;
import concretas.ClaseConcretaCola;
import concretas.ClaseConcretaColaHistorial;
import concretas.MetodosGenerales;
import concretas.NodoHistorial;

/**
 * Clase principal para la calculadora de notación polaca inversa.
 * @author Cristobal
 */
public class CalculadoraRPN {

    /**
     * @param args Los argumentos de la línea de comando
     */
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        int opcionMenu = -1;
        /**
         * Cola que se utiliza para almacenar la operación ingresada por el ususario
         */
        ClaseConcretaCola colaOperacion;
        
        /**
         * Cola que se utiliza para almacenar el historial de operaciones y sus resultados.
         */
        ClaseConcretaColaHistorial colaHistorial = new ClaseConcretaColaHistorial();
        
        /**
         * Ciclo que muestra las opciones del menú hasta que el usuario decide salir
         */
        do{
            System.out.println("MENU");
            System.out.println("1. Realizar una nueva operación");
            System.out.println("2. Mostrar Historial");
            System.out.println("3. Ordenar historial por resultados ascendentemente");
            System.out.println("4. Ordenar historial por resultados descendentemente");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            try{
                opcionMenu = Integer.parseInt(teclado.nextLine());
            }catch(NumberFormatException ex){
                opcionMenu = -1;
            }            
            switch(opcionMenu){
                case 1:
                    System.out.print("Ingrese la operación en una línea: ");
                    String operacion = teclado.nextLine();
                    String[] cadenaOperacion = operacion.split(" ");
                    colaOperacion = MetodosGenerales.convertirOperacionACadena(cadenaOperacion);
                    String resultado = null;
                    if(colaOperacion.obtenerLongitud() == 1){
                        resultado = "Error - Es necesario ingresar al menos dos operandos y un operador\n";
                    }else{
                        resultado = MetodosGenerales.realizarOperacionCompleta(colaOperacion);
                    }
                    System.out.println("Resultado: "+resultado+"\n");
                    if(resultado.contains("Error")){
                        break;
                    }      
                    colaHistorial.agregarElemento(new NodoHistorial(operacion, resultado));
                    break;
                case 2:
                    colaHistorial.imprimir();
                    break;
                case 3:
                    colaHistorial.ordenarAscendente();
                    break;
                case 4:
                    colaHistorial.ordenarDescendente();
                    break;
                case 0:
                    colaHistorial.guardarEnArchivo();
                    break;
                default:
                    System.out.println("La opción ingresada no es válida, por favor ingrese el número de una de las opciones en el Menú"+"\n");
            }
        }while(opcionMenu != 0);
    }
    
}
