package libreria;

import java.util.Scanner;

public class LibreriaEjemplo {

  public static void pedirLibros() {

    // aqui haces tu magia bro
    // aqui se implementa la pila con los libros
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opt, MAX;

    System.out.println("¿Cual es el tamaño de la cola?");
    MAX = entrada.nextInt();
    Cola colaLibreria = new Cola(MAX);

    do {
      System.out.println("--- Bienvenido a libreria Quijote de la Mancha ---");
      System.out.println("1. Anadir persona a la fila");
      System.out.println("2. Remover persona de la fila");
      System.out.println("3. Mostrar fila");
      System.out.println("4. Salir");

      opt = entrada.nextInt();

      switch (opt) {
        case 1:
          colaLibreria.InsertarCola();
          // pedirLibros();
          break;
        case 2:
          break;
        case 3:
          colaLibreria.MostrarCola();
          break;
        case 4:
          System.exit(0);
          break;
      }
    } while (true);
  }
}
