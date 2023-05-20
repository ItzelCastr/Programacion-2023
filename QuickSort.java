
package company.metodosordenamiento;
import java.util.Random;
/**
 *
 * @author Itzel Castro
 */
public class QuickSort {
    
    public static void  OrdenacionRapida(int arreglo[]){
        final int N=arreglo.length;
        quicksort(arreglo,0,N-1);
            
        
    }
    public static void quicksort(int arreglo[], int inicio, int fin) {
 if(inicio >=fin){
     return;
 }
 int pivote = arreglo [inicio];
 int izq= inicio + 1;
 int der= fin;
 
  while(izq <= der){                                                             
     while(izq<=fin && arreglo [izq] < pivote){
         izq++;
     }
     while(der > inicio&& arreglo [der] >= pivote){
         der--;  
     }
     
 
     if (izq < der) {                                             
     int temp= arreglo[izq];                      
     arreglo[izq]=arreglo[der];
     arreglo[der]=temp;
   }
 }
     if(der > inicio){
         int temp = arreglo[izq];
         arreglo[izq] = arreglo [der];
         arreglo [der]=temp;
        
     }
     quicksort(arreglo,inicio, der -1);          // ordenamos subarray izquierdo
    
     quicksort(arreglo,der+1,fin);          // ordenamos subarray derecho
   
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
