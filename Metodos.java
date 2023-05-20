
package company.metodosordenamiento;
import java.util.Random;
/**
 *
 * @author Itzel Castro
 */
public class Metodos {

    public static int[] metodoburbuja(int arreglo[]){
         for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                
                //comparamos el valor de x es mayor a la posicion que esta adelante
                if (arreglo[j] > arreglo[j + 1]) {
                    //guardamos en una variable nuestro valor j
                    int aux = arreglo[j];
                    //cambiamos el valor de j+1 por el mismo que j
                    arreglo[j] = arreglo[j + 1];
                    //cambiamos el valor de j+1 por el que guardamos en aux
                     arreglo[j + 1] = aux;
                }
                System.out.print(" ");
                
                  System.out.print(arreglo[j]+" ");
            }
             System.out.println(" ");
        }
       return arreglo;
        
    }
     public static int[] metodoseleccion(int arreglo[]){
       for (int i = 0; i < arreglo.length - 1; i++) {
           /* tomamos como menor el primero de los elementos que quedan por ordenar 
            y guardamos su posición buscamos en el resto del arreglo algún elemento menor que el actual
            si hay alguno menor se intercambia  */
           
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.print(" ");
                
                 System.out.print(arreglo[j]+" ");
            }
        }
       return arreglo;
    }
      public static int[] metododirecto(int arreglo[]){
       for (int i = 0; i < arreglo.length - 1; i++) {
           /* tomamos como menor el primero de los elementos que quedan por ordenar 
            y guardamos su posición buscamos en el resto del arreglo algún elemento menor que el actual
            si hay alguno menor se intercambia  */
           
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
                System.out.print(" ");
                
                  System.out.print(arreglo[j]+" ");
            }
              
        }
       return arreglo;
    }
      
      public static int[] MetodoShell(int arreglo[]) {

        int salto, aux, i;
        boolean cambios;

        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < arreglo.length; i++) // se da una pasada
                {
                    if (arreglo[i - salto] > arreglo[i]) {       // y si están desordenados
                        aux = arreglo[i];                  // se reordenan
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
        return arreglo;
    }

      
      
    public static int[] llenararreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = new Random().nextInt(100);
        }
        return arreglo;
    }

    public static void imprimirarreglo(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(String.valueOf(arreglo[i]) + " ");
        }
    }
}
    
    

