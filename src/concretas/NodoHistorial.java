package concretas;

import abstractas.ClaseAbstractaNodo;

/**
 * Clase concreta para crear nodos que contienen un una operación y el resultado.
 * Estos nodos se usan para almacenar el historial de operaciones en una cola.
 * @author Cristobal
 */
public final class NodoHistorial extends ClaseAbstractaNodo{
    private String operacion;
    private String resultado;
    
    /**
     * Constructor utilizado para crear una instancia y asignar los valores de operacion y resultado.
     * @param operacion La operación a almacenar en el nodo.
     * @param resultado El resultado de la operación ingresada.
     */
    public NodoHistorial(String operacion, String resultado) {
        this.operacion = operacion;
        this.resultado = resultado;
    }

    /**
     * Función para imprimir la operación y el resultado.
     * @return La cadena de texto con la operación y el resultado.
     */
    @Override
    public String toString(){
        return "Operacion: "+operacion+". Resultado: "+resultado;
    }

    /**
     * Función para obtener la operación almacenada.
     * @return la operación almacenada en el nodo.
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Procedimiento para guardar una operación en el nodo.
     * @param operacion La operación ingresada por el usuario.
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    /**
     * Función para obtener el resultado de la operación ingresada por el usuario.
     * @return El resultado de la operación recibida.
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Procedimiento para almacenar el resultado de la operación.
     * @param resultado El resultado de la operación a almacenar en el nodo.
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
