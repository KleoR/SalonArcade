package controller;
import service.GestorJugador;
import model.Jugador;
import service.Mensajes;
import service.Menus;


public class Principal {
    static GestorJugador gestor = new GestorJugador();
    private static Jugador jugadorActual;

    public static void main(String[] args) {

        Mensajes.mostrarMenu();
        Menus.MenuPrincipal();
    }

    public static void comprobarJugadores(){
        if(gestor.noHayJugadores()) {
            Mensajes.noHayJugadores();
            gestor.RegisterJugador();
        }
    }

    public static boolean hayJugadorActual(){
        return jugadorActual != null;
    }

    public static boolean jugadorListo(){
        if (!hayJugadorActual()) comprobarJugadores();
        jugadorActual = gestor.elegirJugador();
        noHayCreditos();

        return true;
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
