package concretas;

import abstractas.ClaseAbstractaNodo;

/**
 * Clase concreta para crear nodos que contienen un número "Double".
 * @author Cristobal
 */
public final class NodoNumeroDoble extends ClaseAbstractaNodo{
    private double numeroDoble;

    /**
     * Constructor que recibe un número en forma de cadena de texto y lo almacena como "Double".
     * @param numeroDobleEnCadena Numero en forma de cadena de texto que se almacena en el nodo.
     */
    NodoNumeroDoble(String numeroDobleEnCadena) {
        double enteroAuxiliar = Double.parseDouble(numeroDobleEnCadena);
        this.setNumeroDoble(enteroAuxiliar);
    }

    /**
     * Función para obtener el número Double almacenado.
     * @return El número Double almacenado en el nodo.
     */
    public double getNumeroDoble() {
        return numeroDoble;
    }

    /**
     * Procedimiento para guardar el número en el nodo.
     * @param numeroDoble El valor a almacenar en el nodo.
     */
    public void setNumeroDoble(double numeroDoble) {
        this.numeroDoble = numeroDoble;
    }

    /**
     * Constructor del nodo que recibe un número Double para almacenar.
     * @param numeroDoble El valor a almacenar en el nuevo nodo.
     */
    public NodoNumeroDoble(double numeroDoble) {
        this.setNumeroDoble(numeroDoble);
    }
    
    /**
     * Función para convertir el número doble en cadena de texto cuando se imprime el nodo.
     * @return El valor almacenado en el nodo en forma de cadena de texto.
     */
    @Override
    public String toString(){
        return Double.toString(this.numeroDoble);
    }
}
