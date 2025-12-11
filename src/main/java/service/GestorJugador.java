package service;

import model.Jugador;
import model.SalaRecreativa;
import utils.Utils;

public class GestorJugador {
    private SalaRecreativa sala;
    private Jugador[] jugadores;
    public static int numJugadores;


    public GestorJugador(SalaRecreativa sala) { // ← nombre bien
        this.sala = sala;
        this.jugadores = new Jugador[50];
        numJugadores = 0;
    }

    /**
     * Comprueba si hay jugadores.
     * @return booleano - devuelve si hay o no jugadores.
     */
    public static boolean hayJugadores() {
        return numJugadores > 0;
    }

    /**
     *
     * @return
     */
    public Jugador RegistJugador(){ //ToDo
        String nameJugador = Utils.nombrar("====  N O M B R E : ", 3,10);
        String idJugador = ""+ Utils.generarNumeroAleatorio(1000,9999);

        Jugador nuevo = new Jugador(nameJugador, idJugador, 0, 0);
        guardarJugador(nuevo);
        return nuevo;
    }

    public void guardarJugador(Jugador nuevo) {
        if (numJugadores >= jugadores.length) System.out.println("Límite de jugadores alcanzado.");
        else jugadores[numJugadores++] = nuevo;
    }

}
