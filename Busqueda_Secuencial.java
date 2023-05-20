

package company.busqueda_secuencial;
import java.util.Scanner;
/**
 *
 * @author Itzel Castro
 */
public class Busqueda_Secuencial {
    
    static Scanner entrada = new Scanner (System.in);
    
    static boolean BusquedaSecuencial(int []vec,int tan,int dato  ){
       
      int i= 0;
      boolean encontro = false;
      
      while (encontro && i< tan){
          if (dato == vec [i] )
              encontro = true;
          i = i+1;
      }
        return encontro;
    }

    public static void main(String[] args) {
        
        int n, numero;
             
       System.out.println("Ingresar un numero: ");
       n = entrada.nextInt();
       
       System.out.println("Ingresar el numero a buscar: ");
       numero = 1+ (int)(Math.random ()*1000);
       
        int [] vec = new int [n];
        
        for(int x=0; x < n;x++)
            vec [x] = 1+ (int)(Math.random()*1000);
        
        for(int x=0;x<n;x++)
            System.out.println(vec [x]+ "\t");
               
       if(BusquedaSecuencial (vec,n,numero))
            System.out.println("\nEl dato se encuentra en el vector\n ");
       
       else
           System.out.println("\nEl dato no se encuentra en el vector\n ");
           
    }
}



static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
    
         int numero, puntero = 0, finall = 9,mitad = -999;
         int [] vec = {3,8,11,22,38,49,50,56,62,70};
         boolean encontro = false;
         System.out.println("Ingresar un numero: ");
         numero = entrada.nextInt();
         
         
         while (encontro && puntero <= finall){
             mitad = (int)((puntero+finall)/ 2);
             
             if(numero== vec [mitad])
                 encontro = true;
             else if ( numero < vec [mitad])
                 finall= mitad -1;
             else 
                 puntero = mitad + 1;
         }
        if(encontro)
            System.out.println("El dato se encuentra y esta en la posicion: "+(mitad+1));
         else
   
        System.out.println("El dato no se encuentra: ");
    }