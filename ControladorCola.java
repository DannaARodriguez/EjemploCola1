package EjemploCola1;

public class ControladorCola {

    ColaNombres modelo;
    VistaCola vista;

    public ControladorCola(ColaNombres modelo, VistaCola vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        int opcion;

        do {
            vista.mostrarMenu();
            opcion = vista.leerOpcion();

            switch (opcion) {

                case 1:
                    String nombre = vista.leerNombre();
                    vista.mostrarMensaje(modelo.pone(nombre));
                    break;

                case 2:
                    vista.mostrarMensaje(
                        "Elemento eliminado: " + modelo.quita()
                    );
                    break;

                case 3:
                    vista.mostrarMensaje(modelo.mostrar());
                    break;

                case 4:
                    vista.mostrarMensaje("Saliendo del programa...");
                    break;

                default:
                    vista.mostrarMensaje("Opcion no valida");
                    break;
            }

        } while (opcion != 4);
    }
}