package service.Games;

import utils.Mensajes;
import utils.Utils;

public class CaraCruz {

    public static int juegoCaraCruz() {
        Mensajes.caraCruz();
        int min = 0, max = 1;
        int eleccion = Utils.opcionesUser(min, max);
        boolean gana = Utils.generarNumeroAleatorio(min, max) == eleccion;

        return gana ? 100 : 0;
    }

}
