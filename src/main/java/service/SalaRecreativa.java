package service;

import model.Jugador;
import model.MaquinaArcade;
import utils.Mensajes;

/**
 *
 */
public class SalaRecreativa {
    private final GestorJugador gestorJugador = new GestorJugador();
    private final GestorMaquina gestorMaquina = new GestorMaquina();

    private Jugador jugadorActual;
    private MaquinaArcade maquinaActual;

//------------------------------------------ FUNCIONALIDADES --------------------------------------------

    public  boolean JuegoListo(){
        if (jugadorListo() && MaquinaLista()) gestorMaquina.elegirMaquina();

        gestorMaquina.jugarNuevaPartida();
        return true;
    }

    //------------------------------- JUGADOR -------------------------------------------

    public boolean jugadorListo(){
        boolean listo = true;

        comprobarJugadores();

        if (!hayJugadorActual()) jugadorActual = gestorJugador.elegirJugador();
        if (jugadorActual == null) listo = false;
        if (listo) noHayCreditos(jugadorActual);

        return listo;
    }

    public void comprobarJugadores(){
        while (gestorJugador.noHayJugadores()) {
            Mensajes.noHayJugadores();
            gestorJugador.RegisterJugador();
        }
    }

    public boolean hayJugadorActual() {
        return jugadorActual != null;
    }

    //------------------------------- MAQUINA -------------------------------------------

    public boolean MaquinaLista(){
        if (gestorMaquina.noHayMaquinas()) return true;

        return true;
    }

    //------------------------------- CRÉDITOS -------------------------------------------

    public void recargaCreditosJugador(){
        comprobarJugadores();
        Jugador jugador = gestorJugador.elegirJugador();
        jugador.recargaCreditos();
    }

    public void noHayCreditos(Jugador jugador){
        while (jugador.comprobarCredito()){
            Mensajes.noHayCredito();
            jugador.recargaCreditos();
        }
    }
}
