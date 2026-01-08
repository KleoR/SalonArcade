package service;

import model.Jugador;
import model.MaquinaArcade;
import utils.Mensajes;


public class SalaRecreativa {
    private final GestorJugador gestorJugador = new GestorJugador();
    private final GestorMaquina gestorMaquina = new GestorMaquina();

    private Jugador jugadorActual;
    private MaquinaArcade maquinaActual;

//------------------------------------------ FUNCIONALIDADES --------------------------------------------
    public void Juego(){
        boolean ok = JuegoListo();
        int puntuacion;

        if (ok) {

            while (jugadorActual.getCreditosJugador() < maquinaActual.getPricePartida()) {
                Mensajes.noHayCredito();
                jugadorActual.recargaCreditos();
            }

            ok = jugadorActual.gastarCreditos(maquinaActual.getPricePartida());

            if (!ok) System.out.println("No tienes créditos suficiente para esta maquina.");
            else {
                puntuacion = maquinaActual.jugarNuevaPartida(jugadorActual.getIdJugador());
                if (puntuacion >= 0) jugadorActual.contPartidas();
            }

            System.out.println(jugadorActual);
        }
    }

    public boolean JuegoListo(){
        return (jugadorListo() && MaquinaLista());
    }

    //------------------------------- JUGADOR -------------------------------------------

    public boolean jugadorListo(){
        boolean listo = true;

        comprobarJugadores();

        jugadorActual = gestorJugador.elegirJugador();
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

    //------------------------------- MAQUINA -------------------------------------------

    public boolean MaquinaLista(){
        boolean listo = true;

        comprobarMaquinas();

        maquinaActual = gestorMaquina.elegirMaquina();
        if (maquinaActual == null) listo = false;

        return listo;
    }

    public void comprobarMaquinas(){
        while (gestorMaquina.noHayMaquinas()) {
            Mensajes.noHayMaquina();
            gestorMaquina.registrarMaquina();
        }
    }

    public void bajaMaquina() {
        boolean ok = true;

        comprobarMaquinas();
        maquinaActual = gestorMaquina.elegirMaquina();
        if (maquinaActual == null) ok = false;

        if (ok) {
            maquinaActual.modEstadoMaquina(false);
            System.out.println("Máquina dada de baja (inactiva).");
        }
    }

    public void reactivarMaquina() {
        boolean ok = true;

        comprobarMaquinas();
        maquinaActual = gestorMaquina.elegirMaquina();
        if (maquinaActual == null) ok = false;

        if (ok) {
            maquinaActual.modEstadoMaquina(true);
            System.out.println("Máquina reactivada.");
        }
    }

    //------------------------------- CRÉDITOS -------------------------------------------

    public void recargaCreditosJugador(){
        comprobarJugadores();
        Jugador jugador = gestorJugador.elegirJugador();
        if (jugador != null) jugador.recargaCreditos();
    }

    public void noHayCreditos(Jugador jugador){
        while (jugador.comprobarCredito()){
            Mensajes.noHayCredito();
            jugador.recargaCreditos();
        }
    }

    //------------------------------- GESTOR -------------------------------------------

    public void RegisterJugador() {
        gestorJugador.RegisterJugador();
    }

    public void mostrarJugadores() {
        gestorJugador.mostrarJugadores();
    }

    public void registrarMaquina() {
        gestorMaquina.registrarMaquina();
    }

    public void mostrarMaquinas() {
        gestorMaquina.mostrarMaquinas();
    }

    public void elegirMaquina() {
        maquinaActual = gestorMaquina.elegirMaquina();
    }

    public void mostrarMaquinasActivas() {
        gestorMaquina.mostrarMaquinasActivas();
    }

    public void maquinaMasUsada() {
        gestorMaquina.maquinaMasUsada();
    }

    public void jugadorMasActivo() {
        gestorJugador.jugadorMasActivo();
    }
}
