package concretas;

import abstractas.ClaseAbstractaNodo;
import interfaces.InterfazPila;

/**
 * Clase concreta utilizada para crear instancias de Pila
 * @author Cristobal
 */
public class ClaseConcretaPila implements InterfazPila{
    
    /**
     * Nodo inicial por el cual se accede a la pila.
     */
    ClaseAbstractaNodo cima;
    
    /**
     * Variable que guarda la longitud de la pila.
     */
    int longitud;
    
    @Override
    public void push(Object object) {
        ClaseAbstractaNodo auxiliar = (ClaseAbstractaNodo) object;
        if(estaVacia()){
            cima = auxiliar;
            cima.setSiguiente(null);
            longitud++;
        }else{
            auxiliar.setSiguiente(cima);
            cima = auxiliar;
            longitud++;
        }
    }

    @Override
    public Object pop() {
        ClaseAbstractaNodo auxiliar = cima;
        if(longitud == 1){
            cima = null;
            longitud--;
            return auxiliar;
        }else{
            cima = cima.getSiguiente();
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
        return longitud == 0;
    }

    @Override
    public void imprimir() {
        ClaseAbstractaNodo auxiliar = cima;
        for(int i = 0; i < longitud; i++){
            System.out.println(auxiliar);
            auxiliar = auxiliar.getSiguiente();
        }
    }
    
    /**
     * Vacía la pila apuntando la cima a "null" y dándole una longitud cero.
     */
    public void vaciar(){
        cima = null;
        longitud = 0;
    }
}
