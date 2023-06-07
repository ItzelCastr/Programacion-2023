

package com.mycompany.ejemploarbol;
import java.util.Scanner;

class ArbolB {
    Nodo padre;
    Nodo raiz;
    
public ArbolB(){ 
      raiz = null; 
}

public void InsertaNodo (int elem){ 
      if(raiz == null)
      raiz = new Nodo (elem);
  else
     raiz.InsertaBinario (elem);
}

public void Preorden (Nodo Nodo){
      if(Nodo == null) return;
  else{
      System.out.print (Nodo.getElemento() + " ");
      Preorden (Nodo.getRamaIz());
      Preorden (Nodo.getRamaDer());
  }
}

public void PostOrden (Nodo Nodo){
      if(Nodo == null) return;
 else{
      PostOrden (Nodo.getRamaIz());
      PostOrden (Nodo.getRamaDer());
      System.out.print (Nodo.getElemento() + " ");
  }
}

public void Inorden (Nodo Nodo){
      if(Nodo == null) return;
else{
      Inorden (Nodo.getRamaIz());
      System.out.print(Nodo.getElemento() + " ");
      Inorden (Nodo.getRamaDer());
  }
}

//Busca un elemento en el árbol
public void Busqueda (int Elem, Nodo A){
      if((A == null) | (A.getElemento() == Elem)){
      System.out.print(A.getElemento() + " ");
  return;
}
else{
     if(Elem>A.getElemento()) Busqueda (Elem, A.getRamaDer());
     else Busqueda ( Elem, A.getRamaIz());
  }
}

public int Altura (Nodo Nodo){ 
     int Altder = (Nodo.getRamaDer() == null? 0:1 + Altura (Nodo.getRamaDer()));
     int Altizq = (Nodo.getRamaIz()== null? 0:1 + Altura (Nodo.getRamaDer()));
     return Math.max(Altder,Altizq);
   }
}
class Nodo {
    
    private int elemento;
    private Nodo ramaIz;
    private Nodo ramaDer; 
    
    
public Nodo(int elemento ) {
       this.elemento = elemento;
       ramaIz=null;
       ramaDer=null;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public Nodo getRamaIz() {
        return ramaIz;
    }

    public void setRamaIz(Nodo ramaIz) {
        this.ramaIz = ramaIz;
    }

    public Nodo getRamaDer() {
        return ramaDer;
    }

    public void setRamaDer(Nodo ramaDer) {
        this.ramaDer = ramaDer;
    }

    @Override
    public String toString() {
        return "Nodo{" + "elemento=" + elemento + ", ramaIz=" + ramaIz + ", ramaDer=" + ramaDer + '}';
    }
    
public void InsertaBinario (int elem){
      if(elem < this.elemento){
      if (ramaIz == null)
      ramaIz = new Nodo(elem);
  else
    ramaIz.InsertaBinario(elem);
      
   }else{
         if (elem > this.elemento){
         if (ramaDer == null)
        ramaDer = new Nodo(elem);
   else
        ramaDer.InsertaBinario(elem);
   }
  }
 }
}


public class EjemploArbol {

    public static void main(String[] args) {
        ArbolB A = new ArbolB();
       int indice;
       int opc=0;
      Scanner leer = new Scanner (System.in);
      
    System.out.println("****BIENVENIDO A ÁRBOL BINARIO ORDENADO****");
    
do{
     System.out.println("MENÚ\n");
     System.out.println("1.Insertar");
     System.out.println("2.Eliminar");
     System.out.println("3.Recorrido en Pre orden");
     System.out.println("4.Recorrido en In orden");
     System.out.println("5.Recorrido en Pos orden");
     System.out.println("6.Salir");
     System.out.println("seleccione opción --->\n");
 opc=leer.nextInt();
 
switch(opc) {
   case 1:
     System.out.println("Dame el número a insertar\n");
     int p=leer.nextInt();
     A.InsertaNodo(p); break;
     
   case 2: break;
   
  case 3:
     System.out.print("El recorrido en Preorden es: ");
     A.Preorden (A.raiz);
     System.out.println(); 
     break;
       
 case 4:
     System.out.print("El recorrido en Inorden es: ");
     A.Inorden (A.raiz);
     System.out.println(); 
     break;
     
 case 5:
     System.out.print("El recorrido en Postorden es: ");
     A.PostOrden (A.raiz);
     System.out.println(); 
     break;
    }

 }while(opc!=6);    
    
    }
}
