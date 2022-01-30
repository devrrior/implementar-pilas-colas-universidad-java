package libreria;

public class Colas {
    private int MAX;
    private String[] COLA;
    private int FRENTE;
    private int FINAL;

    public Cola() {
        this.MAX = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new String[this.MAX + 1];
    }

    public Cola(int MAX) {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new String[this.MAX + 1];
    }

    public boolean IsColaLlena() {
        if (this.FINAL == this.MAX) {
            return true;
        }
        return false;
    }

    public void InsertarCola() {
        Scanner entrada3 = new Scanner(System.in);
        if (this.IsColaLlena()) {
            System.out.println("LA COLA ESTÁ LLENA");
        } else {
            String dato;
            System.out.println("Ingrese su primer nombre:");
            dato = entrada3.next();
            this.FINAL++;
            this.COLA[FINAL] = dato;
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
            String MOSTRAR = " ";
            for (int i = FRENTE + 1; i <= FINAL; i++) {
                MOSTRAR = MOSTRAR + COLA[i] + "\n";
            }
            System.out.println("Total es: " + this.FINAL + "\n" + "Los datos de cola son: \n " + MOSTRAR);
        }
    }

    public void VaciarCola() {
        FRENTE = 0;
        FINAL = 0;
    }


}
