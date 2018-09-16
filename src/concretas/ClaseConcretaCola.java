package concretas;

import abstractas.ClaseAbstractaNodo;
import interfaces.InterfazCola;

/**
 * Clase concreta utilizada para crear instancias de Cola
 * @author Cristobal
 */
public class ClaseConcretaCola implements InterfazCola{
    
    /**
     * Nodo inicial por el cual se accede a la cola.
     */
    ClaseAbstractaNodo primero;
    
    /**
     * Nodo que se encuentra al final de la cola (Contiene el último elemento ingresado)
     */
    ClaseAbstractaNodo ultimo;
    
    /**
     * Variable que guarda la longitud de la cola.
     */
    int longitud;

    @Override
    public void agregarElemento(Object object) {
        ClaseAbstractaNodo auxiliar = (ClaseAbstractaNodo) object;
        if(estaVacia()){
            primero = auxiliar;
            primero.setSiguiente(null);
            ultimo = primero;
            longitud++;
        }else{
            ultimo.setSiguiente(auxiliar);
            ultimo = auxiliar;
            ultimo.setSiguiente(null);
            longitud++;
        }
    }

    @Override
    public Object extraerElemento() {
        ClaseAbstractaNodo auxiliar = primero;
        if(longitud == 1){
            primero = null;
            ultimo = null;
            longitud--;
            return auxiliar;
        }else{
            primero = primero.getSiguiente();
            longitud--;
            return auxiliar;
        }
    }

    @Override
    public int obtenerLongitud() {
        return longitud;
    }

    @Override
    public boolean estaVacia() {
        return obtenerLongitud() == 0;
    }

    @Override
    public void imprimir() {
        ClaseAbstractaNodo auxiliar = primero;
        for(int i = 0; i < longitud; i++){
            System.out.println((i+1)+".) "+auxiliar);
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("");
    }
}
