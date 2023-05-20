

package company.recursividad_ackerman;
import java.util.Scanner;
/**
 *
 * @author Itzel Castro
 */
public class Recursividad_Ackerman {
  
    static Scanner entrada = new Scanner(System.in);
    
       static int Ackerman (int m, int n){
           
           if ( m ==0)
               return n+1;
           
           else if (n==0)
               return Ackerman(m-1,1);
             else
               return Ackerman (m-1,Ackerman(m,n-1));
           
       }
       
       
    public static void main(String[] args) {
        
        int m,n;
        
        System.out.println("ingresar el primer valor: ");
        m= entrada.nextInt();
        System.out.println("Ingresar el segundo valor: ");
        n= entrada.nextInt();
        System.out.println("El valor Ackerman es: "+ Ackerman (m,n));
    }
}
