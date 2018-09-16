package concretas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase concreta utilizada para crear instancias de Cola para almacenar el historial.
 * Esta clase extiende a la Clase ClaseConcretaCola para hacer uso de los métodos y agrega métodos para ordenar la cola basada en resultados
 * @author Cristobal
 */
public class ClaseConcretaColaHistorial extends ClaseConcretaCola{
    
    String ordenamiento = "ordenadas como fueron ingresadas";
    
    /**
     * Método que ordena los elementos de la cola por resultado ascendentemente
     */
    public void ordenarAscendente(){
        if(estaVacia()){
            System.out.println("Aún no existen resultados para ordenar\n");
            return;
        }
        NodoHistorial auxiliar = (NodoHistorial) primero;
        NodoHistorial temporal = new NodoHistorial(null, null);
        for(int i = 1; i <= longitud - 1; i++){
            NodoHistorial auxiliar2 = (NodoHistorial) auxiliar.getSiguiente();
            for(int j = i; j <= longitud - 1; j++){
                Double resultadoActual = Double.parseDouble(auxiliar.getResultado());
                Double resultadoAComparar = Double.parseDouble(auxiliar2.getResultado());
                if(resultadoActual > resultadoAComparar){
                    temporal.setOperacion(auxiliar.getOperacion());
                    temporal.setResultado(auxiliar.getResultado());
                    auxiliar.setOperacion(auxiliar2.getOperacion());
                    auxiliar.setResultado(auxiliar2.getResultado());
                    auxiliar2.setOperacion(temporal.getOperacion());
                    auxiliar2.setResultado(temporal.getResultado());
                }
                auxiliar2 = (NodoHistorial) auxiliar2.getSiguiente();
            }
            auxiliar = (NodoHistorial) auxiliar.getSiguiente();
        }
        ordenamiento = "ordenadas de forma ascendente";
        System.out.println("Los resultados se ordenaron de forma ascendente\n");
    }
    
        /**
     * Método que ordena los elementos de la cola por resultado ascendentemente
     */
    public void ordenarDescendente(){
        if(estaVacia()){
            System.out.println("Aún no existen resultados para ordenar\n");
            return;
        }
        NodoHistorial auxiliar = (NodoHistorial) primero;
        NodoHistorial temporal = new NodoHistorial(null, null);
        for(int i = 1; i <= longitud - 1; i++){
            NodoHistorial auxiliar2 = (NodoHistorial) auxiliar.getSiguiente();
            for(int j = i; j <= longitud - 1; j++){
                Double resultadoActual = Double.parseDouble(auxiliar.getResultado());
                Double resultadoAComparar = Double.parseDouble(auxiliar2.getResultado());
                if(resultadoActual < resultadoAComparar){
                    temporal.setOperacion(auxiliar.getOperacion());
                    temporal.setResultado(auxiliar.getResultado());
                    auxiliar.setOperacion(auxiliar2.getOperacion());
                    auxiliar.setResultado(auxiliar2.getResultado());
                    auxiliar2.setOperacion(temporal.getOperacion());
                    auxiliar2.setResultado(temporal.getResultado());
                }
                auxiliar2 = (NodoHistorial) auxiliar2.getSiguiente();
            }
            auxiliar = (NodoHistorial) auxiliar.getSiguiente();
        }
        ordenamiento = "ordenadas de forma descendente";
        System.out.println("Los resultados se ordenaron de forma descendente\n");
    }
    
    /**
     * Procedimiento que guarda el historial de operaciones en un archivo de texto "Archivo-Historial.txt".
     */
    public void guardarEnArchivo(){
        if(this.estaVacia()){
            System.out.println("No hubo historial para guardar en el archivo. Adiós");
            return;
        }
        try{
            FileWriter fileWriter = new FileWriter("Archivo-Historial.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Historial de Operaciones "+ordenamiento);
            NodoHistorial auxiliar = (NodoHistorial) primero;
            
            for(int i = 0; i < longitud; i++){
                printWriter.println((i+1)+".) "+auxiliar);
                auxiliar = (NodoHistorial) auxiliar.getSiguiente();
            }
            
            printWriter.close();
        }catch(IOException ex){
            System.out.println("Ocurrió un error al escribir al archivo");
        }
    }
}
