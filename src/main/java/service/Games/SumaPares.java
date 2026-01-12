package service.Games;

import utils.Mensajes;
import utils.Utils;

public class SumaPares {
    public static int jugarSumaPares() {
        Mensajes.parImpar();
        boolean eligePar = Utils.opcionesUser(1, 2) == 1;

        System.out.println("\nElige un número entre 1 y 5:");
        int numeroUsuario  = Utils.opcionesUser(1, 5);
        int numeroMaquina  = Utils.generarNumeroAleatorio(1, 5);

        System.out.println("Tu número: " + numeroUsuario  + ", Número de la máquina: " + numeroMaquina );
        System.out.println("Suma: " + (numeroMaquina  + numeroUsuario ));

        int suma = numeroUsuario + numeroMaquina;
        boolean esPar = (suma % 2 == 0);
        boolean gana = (eligePar == esPar);

        System.out.println("\nTu número: " + numeroUsuario);
        System.out.println("Número de la máquina: " + numeroMaquina);
        System.out.println("Suma: " + suma + " (" + (esPar ? "PAR" : "IMPAR") + ")");

        if (gana) Mensajes.ganado();
        else Mensajes.perdido();

        return gana ? 300 : 0;
    }
}
