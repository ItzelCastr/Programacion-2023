

package company.ejemplopila;

/**
 *
 * @author Itzel Castro
 */
public class EjemploPila {
    

public static void main(String[] args) { 
// construcción del nodo inicial
    Nodo inicial= new Nodo(1,null); //se construye el nodo base de la pila, tiene valor 1 y no apunta a otro nodo
    System.out.println("inicial: "+inicial.getElemento()); // se muestra la base de la pila
    Pila mipila= new Pila(); // Iniciamos la construcción de pila
    System.out.println(mipila.toString()); // Se muestra el contenido de la pila
    Nodo pvalor= new Nodo(3,null); // construcción de nodo nuevo
    Nodo top= mipila.push(inicial,pvalor); // se inserta el nodo en la pila
    System.out.println("valor Top "+top.getElemento());
    top= mipila.push(inicial,new Nodo(78,null));
    System.out.println(" Valor Top "+top.getElemento());
//Se insertan varios nodos
    top= mipila.push(inicial, new Nodo(23,null));
    System.out.println("******");
//Se elimina en la pila
    top= mipila.pop(inicial);
    System.out.println("***Después de borrado***");
    top=mipila.push(inicial,new Nodo(45,null));
    top=mipila.push(inicial,new Nodo(89,null));
    top=mipila.push(inicial,new Nodo(41,null));
    System.out.println(top.toString());
//Se muestran los nodos incluidos en la pila
    System.out.println(" Valor Top "+mipila.top().toString());
    }
}
