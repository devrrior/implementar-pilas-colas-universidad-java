package libreria;

import java.util.Scanner;

public class Cola {
  private int MAX;
  private String[] COLA;
  private Pila[] LIBROS;
  private int FRENTE;
  private int FINAL;

  public Cola() {
    this.MAX = 100;
    this.FRENTE = 0;
    this.FINAL = 0;
    this.COLA = new String[this.MAX + 1];
    this.LIBROS = new Pila[this.MAX + 1];
  }

  public Cola(int MAX) {
    this.MAX = MAX;
    this.FRENTE = 0;
    this.FINAL = 0;
    this.COLA = new String[this.MAX + 1];
    this.LIBROS = new Pila[this.MAX + 1];
  }

  public boolean IsColaLlena() {
    if (this.FINAL == this.MAX) {
      return true;
    }
    return false;
  }

  public boolean InsertarCola() {
    // Pedir nombre
    Scanner entrada3 = new Scanner(System.in);
    if (this.IsColaLlena()) {
      System.out.println("LA COLA ESTÁ LLENA");
      return false;
    } else {
      String dato;
      System.out.println("Ingrese su primer nombre:");
      dato = entrada3.nextLine();
      this.FINAL++;
      this.COLA[FINAL] = dato;
      return true;
    }

  }

  public void EliminarCola() {
    if (this.FRENTE == this.FINAL) {
      System.out.println("La cola esta vacia");
    } else {
      for (int i = FRENTE; i <= FINAL - 1; i++) {
        COLA[i] = COLA[i + 1];
      }
      FINAL--;
    }
  }

  public void MostrarCola() {
    if (this.FRENTE == this.FINAL) {
      System.out.println("La cola esta vacia, no hay datos.");
    } else {
      String MOSTRAR = "";
      for (int i = FRENTE + 1; i <= FINAL; i++) {
        MOSTRAR += i + ". " + COLA[i] + "\n";
      }
      System.out.println("Total es: " + this.FINAL + "\n" + "Los datos de cola son: \n " + MOSTRAR);
    }
  }

  public void VaciarCola() {
    FRENTE = 0;
    FINAL = 0;
  }

  public String[] getCOLA(){
    return this.COLA;
  }

  public Pila[] getLibros(){
    return this.LIBROS;
  }

  public void setLibros(int frente, Pila libros){
    this.LIBROS[frente] = libros;
  }

  public int getFRENTE(){
    return this.FRENTE;
  }
}
