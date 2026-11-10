package EjemploCola1;

public class ColaNombres {

    final int MAX = 10;
    String[] cola;
    int frente, finalCola;

    public ColaNombres() {
        cola = new String[MAX];
        frente = -1;
        finalCola = -1;
    }

    private boolean colaVacia() {
        return (frente == -1);
    }

    private boolean colaLlena() {
        return (finalCola == MAX - 1);
    }

    public String pone(String dato) {

        if (colaLlena()) {
            return "Cola llena";
        } else {
            if (colaVacia()) {
                frente = 0;
            }

            finalCola++;
            cola[finalCola] = dato;

            return "Elemento insertado en la cola";
        }
    }

    public String quita() {

        String dato;

        if (colaVacia()) {
            return "Subdesbordamiento - Cola vacia";
        } else {
            dato = cola[frente];

            if (frente == finalCola) {
                frente = -1;
                finalCola = -1;
            } else {
                frente++;
            }

            return dato;
        }
    }

    public String mostrar() {

        if (colaVacia()) {
            return "La cola esta vacia";
        } else {
            String resultado = "Elementos de la cola:\n";

            for (int i = frente; i <= finalCola; i++) {
                resultado += cola[i] + "\n";
            }

            return resultado;
        }
    }
}