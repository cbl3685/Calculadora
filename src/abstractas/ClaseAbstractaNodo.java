package abstractas;

import interfaces.InterfazNodo;

/**
 * Clase abstracta para implementar los métodos de InterfazNodo
 * @author Cristobal
 */
public abstract class ClaseAbstractaNodo implements InterfazNodo{
    ClaseAbstractaNodo siguiente;
    
    /**
     * Método para obtener el siguiente nodo
     * @return El siguiente nodo en la cadena
     */
    @Override
    public ClaseAbstractaNodo getSiguiente() {
        return siguiente;
    }

    /**
     * Método para establecer el siguiente nodo
     * @param siguiente El objeto que se establece como el siguiente elemento en la cadena.
     */
    @Override
    public void setSiguiente(Object siguiente) {
        this.siguiente = (ClaseAbstractaNodo) siguiente;
    }
}