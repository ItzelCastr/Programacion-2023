

package company.vorazmochila;

/**
 *
 * @author Itzel Castro
 */
public class VorazMochila {
   public static void main(String[] args) {
       Elemento[] elementos = {
            new Elemento(1, 1),
            new Elemento(2, 2),
            new Elemento(4, 10),
            new Elemento(1, 2),
            new Elemento(12, 15)
        };
 
        Mochila m_base = new Mochila(15, elementos.length);
        Mochila m_opt = new Mochila(15, elementos.length);
 
       
 
        System.out.println(m_opt);
    }
}
    
   class Elemento {
    
    private int peso;
    private int beneficio;
 
    public Elemento(int peso, int beneficio) {
        this.peso = peso;
        this.beneficio = beneficio;
    }
 
    public int getPeso() {
        return peso;
    }
 
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Elemento other = (Elemento) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.beneficio != other.beneficio) {
            return false;
        }
        return true;
    }
 
    @Override
    public String toString(){
        return "Peso:"+peso+","+" beneficio:"+beneficio;
    }
}
    
    class Mochila {
    private int pesoMaximo;
    private Elemento[] elementos;
 
    private int peso;
    private int beneficio;
 
    public Mochila(int pesoMaximo, int numElementos) {
        this.pesoMaximo = pesoMaximo;
        this.elementos = new Elemento[numElementos];
        this.beneficio = 0;
        this.peso = 0;
    }
 
    public Elemento[] getElementos() {
        return elementos;
    }
 
     public int getPeso() {
       return peso;
    }
     
    public void setPeso(int peso) {
        this.peso = peso;
    }
 
    public int getBeneficio() {
        return beneficio;
    }
 
    public void setBeneficio(int beneficio) {
        this.beneficio = beneficio;
    }
 
    public int getPesoMaximo() {
        return pesoMaximo;
    }
 
    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
 
    
    public void aniadirElemento(Elemento e) {
        for (int i=0 ;i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = e; //lo añade
                this.beneficio+=e.getBeneficio(); // aumenta el beneficio
                this.peso+=e.getPeso(); // Aumenta el piso
                break;
            }
        }
 
    }
 
   
    public void clear() {
        this.peso=0;
        this.beneficio=0;
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = null;
        }
    }
 
   
    public void eliminarElemento(Elemento e) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i].equals(e)) {
                this.elementos[i] = null; //el elemento fuera
                this.peso-=e.getPeso(); //Reduce el peso
                this.beneficio-=e.getBeneficio(); // reduce el beneficio
                break;
            }
        }
    }
     
   
    public boolean existeElemento(Elemento e) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i].equals(e)) {
                return true;
            }
        }
        return false;
    }
 
   
    public String toString() {
        String cadena="";
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] != null) {
                cadena+=elementos[i]+"\n";
            }
        }
        cadena+="Peso: " + getPeso()+"\n";
        cadena+="Beneficio: " + getBeneficio()+"\n";
        return cadena;
    }

    
 
    
   

public void llenarMochila(Mochila m_base, Elemento[] elementos, boolean llena, Mochila m_opt) {
 
      //si esta llena
      if (llena) {
          //compruebo si tiene mas beneficio que otra
          if (m_base.getBeneficio() > m_opt.getBeneficio()) {
 
              Elemento[] elementosMochBase = m_base.getElementos();
              m_opt.clear();
 
              //metemos los elementos
              for (Elemento e : elementosMochBase) {
                  if (e != null) {
                      m_opt.aniadirElemento(e);
                  }
 
              }
 
          }
 
      } else {
          //Recorre los elementos
          for (int i = 0; i < elementos.length; i++) {
              //si existe el elemento
              if (!m_base.existeElemento(elementos[i])) {
                  //Si el peso de la mochila se supera, indicamos que esta llena
                  if (m_base.getPesoMaximo() > m_base.getPeso() + elementos[i].getPeso()) {
                      m_base.aniadirElemento(elementos[i]); //añadimos
                      llenarMochila(m_base, elementos, false, m_opt);
                      m_base.eliminarElemento(elementos[i]); // lo eliminamos
                  } else {
                      llenarMochila(m_base, elementos, true, m_opt);
                  }
              }
          }
      }
}
}


    


