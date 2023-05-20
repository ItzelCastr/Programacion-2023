

package company.busqueda_binaria;
import java.util.Scanner;
/**
 *
 * @author Itzel Castro
 */
public class Busqueda_Binaria {
    
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
}
