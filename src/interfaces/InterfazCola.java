package interfaces;

/**
 * Interfaz utilizada para declarar los métodos de las colas a utilizar en la calculadora.
 * @author Cristobal
 */
public interface InterfazCola {
    /**
     * Método que se usa para agregar un elemento a la cola.
     * @param object El objeto que se agregará a la cola
     */
    void agregarElemento(Object object);
    
    /**
     * Función que devuelve el primer elemento en la cola.
     * @return El primer elemento en la cola.
     */
    Object extraerElemento();
    
    /**
     * Método que devuelve la longitud de la cola.
     * @return La cantidad de elementos en la cola.
     */
    int obtenerLongitud();
    
    /**
     * Método para saber si la cola está vacía
     * @return Verdadero si la cola está vacía, falso si no está vacía
     */
    boolean estaVacia();
    
    /**
     * Método para imprimir los elementos de la cola, empezando por el primero.
     */
    void imprimir();
}
