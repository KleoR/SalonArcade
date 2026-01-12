package service.Games;

import utils.Mensajes;
import utils.Utils;

public class CaraCruz {

    public static int juegoCaraCruz() {
        Mensajes.caraCruz();
        int eleccion = Utils.opcionesUser(1, 2);
        int resultado = Utils.generarNumeroAleatorio(1, 2);

        boolean gana = (eleccion == resultado);
        System.out.println("Resultado: " + (resultado == 1 ? "CARA" : "CRUZ"));

        if (gana) Mensajes.ganado();
        else Mensajes.perdido();

        return gana ? 100 : 0;
    }

}
