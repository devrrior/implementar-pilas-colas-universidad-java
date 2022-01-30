package libreria;

public class LibreriaEjemplo {

  public static void pedirLibros(){
    
    // aqui haces tu magia bro
    // aqui se implementa la pila con los libros
  }

  public static void main(String[] args) {
    boolean band = true;
    int opt = 1;

    do {
      System.out.println("--- Bienvenido a libreria Quijote de la Mancha ---");
      System.out.println("1. Anadir persona a la fila");
      System.out.println("2. Remover persona de la fila");
      System.out.println("3. Salir");

      switch (opt) {
        case 1:
            Cola colaLibreria = new Cola(20);
            colaLibreria.InsertarCola();
            pedirLibros();        
          break;
        case 2:
          break;
        case 3:
          break;
      }
    } while (band);
  }
}
