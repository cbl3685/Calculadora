package concretas;

import java.util.Scanner;

/**
 * Clase concreta que contiene procesos estáticos para el manejo de datos ingresados
 * @author Cristobal
 */
public class MetodosGenerales {
    
    /**
     * Pila auxiliar utilizada para guardar valores temporalmente.
     */
    private static ClaseConcretaPila pilaAuxiliar = new ClaseConcretaPila();
    
    /**
     * Función que convierte una cadena de caracteres a una cola. Los nodos contienen los elementos de la cadena separados por un espacio.
     * La función ignora espacios en blanco de más entre los elementos ingresados.
     * @param cadena La cadena de texto que se convertirá en una cola.
     * @return La cola con los elementos de la cadena recibida
     */
    public static ClaseConcretaCola arregloACola(String[] cadena){
        ClaseConcretaCola cola = new ClaseConcretaCola();
        NodoCadena nodo;
        for(int i = 0; i < cadena.length; i++){
            if(!cadena[i].equals("")){
                nodo = new NodoCadena(cadena[i]);
                cola.agregarElemento(nodo);
            }            
        }
        return cola;
    }
    
    /**
     * Función que convierte el arreglo que contiene la operación en una cola
     * @param cadenaOperacion
     * @return Una cola con los valores ingresados por el usuario.
     */
    public static ClaseConcretaCola convertirOperacionACadena(String[] cadenaOperacion){
        Scanner teclado = new Scanner(System.in);
        ClaseConcretaCola colaNumeros = arregloACola(cadenaOperacion);
        return colaNumeros;
    }

    /**
     * Función que realiza la operación ingresada y devuelve el resultado como una cadena de texto
     * La función declara una pila auxiliar para ir agregando los resultados de la operación, y recorre la cola extrayendo elementos hasta que la cola se encuentra vacía
     * @param colaOperacion La cola que contiene los elementos ingresados por el usuario 
     * @return El resultado de la operación como una cadena de texto.
     */
    public static String realizarOperacionCompleta(ClaseConcretaCola colaOperacion) {
        String resultado = null;
        while(!colaOperacion.estaVacia()){
            String elementoActual = colaOperacion.extraerElemento().toString();
            if(esOperando(elementoActual)){
                pilaAuxiliar.push(new NodoNumeroDoble(elementoActual));
            }else{
                resultado = realizarOperacionIndividual(elementoActual);
                if(resultado.contains("Error")){
                    pilaAuxiliar.vaciar();
                    return resultado;
                }else{
                    pilaAuxiliar.push(new NodoNumeroDoble(resultado));
                }
            }
        }
        if(pilaAuxiliar.obtenerLongitud() >= 2){
            resultado = "Error - No hay suficientes operadores en la operación";
        }
        pilaAuxiliar.vaciar();
        return resultado;
    }
    
    /**
     * Función que devuelve el resultado de la operación basada en el operador recibido como parámetro.
     * Al recibir el parámetro, la función intenta obtener los dos primeros operandos en la lista. Si no hay suficientes operadores, el resultado es un error.
     * @param operador El operador recibido como parámetro (PLUS, LESS, TIMES, DIV)
     * @return El resultado de la operación realizada, o un error si es que existe.
     */
    private static String realizarOperacionIndividual(String operador) {
        String resultadoEnCadena;
        double operadorA;
        double operadorB;
        double resultadoNumero;
        try{
            operadorA = Double.parseDouble(pilaAuxiliar.pop().toString());
            operadorB = Double.parseDouble(pilaAuxiliar.pop().toString());
            
            if(operador.equalsIgnoreCase("PLUS")){
                resultadoNumero = operadorA + operadorB;
                resultadoEnCadena = Double.toString(resultadoNumero);
            }else if(operador.equalsIgnoreCase("LESS")){
                resultadoNumero = operadorB - operadorA;
                resultadoEnCadena = Double.toString(resultadoNumero);
            }else if(operador.equalsIgnoreCase("TIMES")){
                resultadoNumero = operadorA * operadorB;
                resultadoEnCadena = Double.toString(resultadoNumero);
            }else if(operador.equalsIgnoreCase("DIV")){
                if(operadorA == 0){
                    resultadoEnCadena = "Error - Esta operación provoca una división con un divisor igual a cero";
                }else{
                    resultadoNumero = operadorB / operadorA;
                    resultadoEnCadena = Double.toString(resultadoNumero);
                }
            }else{
                resultadoEnCadena = "Error - Uno de los operadore ingresados no es válido. Los operadores aceptados son: PLUS, LESS, TIMES, DIV";
            }
        }catch(NullPointerException ex){
            resultadoEnCadena = "Error - No hay suficientes operandos para realizar una operación.";
        }
        return resultadoEnCadena;
    }
    
    /**
     * Función para verificar si un elemento es un operando.
     * @param elemento El elemento a analizar
     * @return Verdadero si el elemento es un operando válido, falso si el elemento no es un operando válido
     */
    private static boolean esOperando(String elemento){
        try{
            Double auxiliar = Double.parseDouble(elemento);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }
    
}
