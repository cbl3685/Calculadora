package concretas;

import abstractas.ClaseAbstractaNodo;

/**
 * Clase concreta para crear nodos que contienen una cadena de texto.
 * @author Cristobal
 */
public final class NodoCadena extends ClaseAbstractaNodo{
    private String datos;

    /**
     * Función para obtener la cadena de texto.
     * @return La cadena de texto almacenada en el nodo.
     */
    public String getDatos() {
        return datos;
    }

    /**
     * Procedimiento para establecer los datos de nodo.
     * @param cadena La cadena de texto que se almacena en el nodo.
     */
    public void setDatos(String cadena) {
        this.datos = cadena;
    }

    /**
     * Constructor utilizado para crear una nueva instancia y asignar el valor a los datos del nodo.
     * @param cadena La cadena de texto que se almacena en el nodo.
     */
    public NodoCadena(String cadena) {
        this.setDatos(cadena);
    }
    
    /**
     * Función utilizada para mostrar los datos del nodo cuando se imprime su contenido.
     * @return La cadena de texto almacenada en el nodo.
     */
    @Override
    public String toString(){
        return datos;
    }
}
