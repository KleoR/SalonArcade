package service.Games;

import utils.Mensajes;
import utils.Utils;

/**
 *
 */
public class SumaPares {
    public static int jugarSumaPares() {
        Mensajes.parImpar();
        boolean eligePar = Utils.opcionesUser(1, 2) == 1;

        System.out.println("Cuanto quieres sumar escoge entre 1 y 5.");
        int a = Utils.generarNumeroAleatorio(1, 5);
        int b = Utils.opcionesUser(1, 5);

        boolean esPar = (a + b) % 2 == 0;
        boolean gana = eligePar == esPar;

        return gana ? 300 : 0;
    }
}
