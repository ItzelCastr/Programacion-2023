

package company.metodosordenamiento;
import java.util.Scanner;
/**
 *
 * @author Itzel Castro
 */
public class MetodosOrdenamiento {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("1.-Burbuja \n2.-Inserccion Directa \n3.-Selección \n4.-Shell \n5.-QuickSort \nSeleccione un metodo: ");
        int n = leer.nextInt();
       System.out.println("¿Cuantos datos desea en el areglo?");
        int n1 = leer.nextInt();
       

        int arreglo[] = new int[n1];
        Metodos.llenararreglo(arreglo);
        System.out.println("Matriz original");
       Metodos.imprimirarreglo(arreglo);
       

        switch (n) {
            case 1:
                System.out.println(" ");
                Metodos.metodoburbuja(arreglo);
                 System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);
               
                break;
            case 2:
                System.out.println(" ");
                 Metodos.metododirecto(arreglo);
                 System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 Metodos.imprimirarreglo(arreglo);
               
                break;
            case 3:
                System.out.println(" ");
                 Metodos.metodoseleccion(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 Metodos.imprimirarreglo(arreglo);
               
                break; 
                
            case 4:
                System.out.println(" ");
                 Metodos.MetodoShell(arreglo);
                  System.out.println(" ");
                 System.out.println("Matriz ordenada");
                 Metodos.imprimirarreglo(arreglo);
                
               break;
               
             case 5:  
               System.out.println(" ");
                QuickSort.OrdenacionRapida(arreglo);
                System.out.println(" ");
                System.out.println("Matriz ordenada");
                Metodos.imprimirarreglo(arreglo);
                
                break;
                
            default:
                System.out.println("Opcion Inexistente");
        }
    }
}
    

