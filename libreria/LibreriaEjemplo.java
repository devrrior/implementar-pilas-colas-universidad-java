package libreria;

import java.util.Scanner;

public class LibreriaEjemplo {

  public static void despacharCliente(Cola colaLibreria) {
    String[] nombresCola = colaLibreria.getCOLA();
    Pila[] libros = colaLibreria.getLibros();
    int frenteCola = colaLibreria.getFRENTE();

    // mostrar nombre del cliente
    System.out.println("\nEl cliente despachado es: " + nombresCola[frenteCola + 1]);
    // mostrar los libros
    System.out.println("\nLos libros se despacharon en el siguiente orden: ");
    libros[frenteCola].mostrar();
    // eliminar cola
    colaLibreria.EliminarCola();
  }

  public static void pedirLibros(Cola colaLibreria) {

    // aqui haces tu magia bro
    // aqui se implementa la pila con los libros
    Scanner entrada = new Scanner(System.in);
    int frenteCola = colaLibreria.getFRENTE();
    String nombreLibro = "";

    System.out.println("\nIntroduce los numero de libros que vas a pagar: ");
    int noLibros = entrada.nextInt();
    Pila libros = new Pila(noLibros);

    entrada = new Scanner(System.in);
    for (int i = 1; i <= noLibros; i++) {
      System.out.println("\nEscribe el nombre de tu libro: ");
      nombreLibro = entrada.nextLine();
      libros.agregar(nombreLibro);
    }

    colaLibreria.setLibros(frenteCola, libros);

  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opt, MAX;

    System.out.println("¿Cual es el tamaño de la cola?");
    MAX = entrada.nextInt();
    Cola colaLibreria = new Cola(MAX);

    do {
      System.out.println("\n--- Bienvenido a libreria Quijote de la Mancha ---");
      System.out.println("1. Anadir persona a la fila");
      System.out.println("2. Remover persona de la fila");
      System.out.println("3. Mostrar fila");
      System.out.println("4. Salir");

      opt = entrada.nextInt();

      switch (opt) {
        case 1:
          colaLibreria.InsertarCola();
          pedirLibros(colaLibreria);
          break;
        case 2:
          despacharCliente(colaLibreria);
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
