package service;

import model.Jugador;
import model.MaquinaArcade;
import utils.Mensajes;

/**
 * Gestiona la logica que compartan GestorMaquinaArcade y GestorJugador
 */
public class SalaRecreativa {
    private final GestorJugador gestorJugador;
    private final MaquinaArcade gestorMaquina;
    static GestorJugador gestor = new GestorJugador();
    private static Jugador jugadorActual;

    public SalaRecreativa(GestorJugador gestorJugador, MaquinaArcade gestorMaquina) {
        this.gestorJugador = gestorJugador;
        this.gestorMaquina = gestorMaquina;
    }

//------------------------------------------ FUNCIONALIDADES --------------------------------------------
    public static boolean hayJugadorActual(){
    return jugadorActual != null;
}

    public static boolean jugadorListo(){
        if (!hayJugadorActual()) comprobarJugadores();
        jugadorActual = gestor.elegirJugador();
        noHayCreditos();

        return true;
    }

    public static boolean MaquinaLista(){

    }

    public static boolean JuegoListo(){
        if (jugadorListo()) MaquinaArcade.elegirMaquina();

    }

    public static void comprobarJugadores(){
        if(gestor.noHayJugadores()) {
            Mensajes.noHayJugadores();
            gestor.RegisterJugador();
        }
    }

    public static void noHayCreditos(){
        if (jugadorActual.comprobarCredito()){
            Mensajes.noHayCredito();
            jugadorActual.recargaCreditos(jugadorActual);
        }
    }

    public static void recargaCreditosJugador(){
        Jugador jugador = gestor.elegirJugador();
        jugador.recargaCreditos(jugador);
    }

}
