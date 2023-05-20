package company.recursividad_hanoi;
import java.util.Scanner;
/**
 *
 * @author Itzel Castro
 */
public class Recursividad_Hanoi {
    
    static Scanner entrada= new Scanner(System.in);
    
      static void Hanoi (int n,int o, int d, int aux){
          if(n>0){
           Hanoi (n-1,o,aux,d);
           System.out.println("\nSe mueve anillo desde torre " + o + "hasta torre " + d);
           Hanoi (n-1, aux, d, o);
          }
      }
 
    public static void main(String[] args) {
        int n;
        System.out.println("Ingresar la cantidad de anillos: ");
        n= entrada.nextInt();
        Hanoi(n,1,3,2);
    }
}
