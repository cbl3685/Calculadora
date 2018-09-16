package interfaces;

/**
 * Interfaz utilizada para declarar los métodos de las pilas a utilizar en la calculadora.
 * @author Cristobal
 */
public interface InterfazPila {
    /**
     * Metodo que se usa para agregar un elemento a la pila.
     * @param object El objeto que se agregará a la pila
     */
    void push(Object object);
    
    /**
     * Función que devuelve el último elemento agregado a la pila.
     * @return El último elemento agregado a la pila (Cima).
     */
    Object pop();
    
    /**
     * Método que devuelve la longitud de la pila.
     * @return La cantidad de elementos en la pila.
     */
    int obtenerLongitud();
    
    /**
     * Método para saber si la pila está vacía
     * @return Verdadero si la pila está vacía, falso si no está vacía
     */
    boolean estaVacia();
    
    /**
     * Método para imprimir los elementos de la pila, empezando por la cima.
     */
    void imprimir();
}
