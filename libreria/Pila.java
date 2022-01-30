package libreria;

public class Pila {
    String arreglo[];
    int tamanomax;
    int cima;

    public Pila(int n){
        tamanomax=n;
        arreglo= new String[tamanomax];
        cima=0;
    }

    public boolean vacio(){
        if(cima==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void cobrar(String str){
        if(cima<tamanomax){
            arreglo[cima]=str;
            cima++;
        }
    }

    public String mostrarCima(){
        if(cima>0){
            return arreglo[cima-1];
        }
        else{
            return null;
        }
    }

    public String cobrado(){
        String temp=null;
        if(cima>0){
            temp=arreglo[cima-1];
            arreglo[cima-1]=null;
            cima--;
        }
        return temp;
    }
}
