package EjemploCola1;

public class EjemploCola1 {

    public static void main(String[] args) {

        ColaNombres objCola = new ColaNombres();

        VistaCola objVista = new VistaCola();

        ControladorCola objControlador =
                new ControladorCola(objCola, objVista);

        objControlador.iniciar();
    }
}