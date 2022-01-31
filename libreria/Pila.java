package libreria;

import java.util.Scanner;

public class Pila {
    String arreglo[];
    int tamanomax;
    int cima;

    public Pila(int n){
        tamanomax = n;
        arreglo = new String[tamanomax];
        cima = 0;
    }

    public boolean vacio(){
        if(cima==0){
            return true;
        }
        else{
            return false;
        }
    }

    public void agregar(String str){
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

    public void mostrar(){
        int contador=1;

        if(!vacio()){
            for(int i=(cima-1);i>=0;i--){
                System.out.println(contador++ + ". " + arreglo[i]);
            }
        }
        else{
            System.out.println("Pila vacia");
        }
    }


        
    public static void main(String[] args) {
        Pila hoal = new Pila(5);
        hoal.agregar("libro 1");
        hoal.agregar("libro 2");
        hoal.agregar("libro 3");
        hoal.agregar("libro 4");
        hoal.agregar("libro 5");

        System.out.println(hoal.mostrarCima());
        hoal.mostrar();
        
    }
}
