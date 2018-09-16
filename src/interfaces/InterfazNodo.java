package interfaces;

/**
 * Interfaz utilizada para definir los métodos utilizados por los nodos de las pilas y colas
 * @author Cristobal
 */
public interface InterfazNodo {
    /**
     * Procedimiento para almacenar el siguiente objeto.
     * @param object El objeto a almacenar como siguiente.
     */
    void setSiguiente(Object object);
    
    /**
     * Función para obtener el siguiente objeto.
     * @return El siguiente objeto.
     */
    Object getSiguiente();
}
