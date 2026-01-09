package service;

import model.Jugador;
import model.MaquinaArcade;
import utils.Mensajes;
import utils.Utils;


public class SalaRecreativa {
    private final GestorJugador gestorJugador = new GestorJugador();
    private final GestorMaquina gestorMaquina = new GestorMaquina();

    private Jugador jugadorActual;
    private MaquinaArcade maquinaActual;

//------------------------------------------ FUNCIONALIDADES --------------------------------------------
    public void Juego(){
        boolean ok = juegoListo();
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
                if (puntuacion >= 0) {
                    jugadorActual.contPartidas();  // ← Solo si jugó exitosamente
                }
            }

            System.out.println(jugadorActual);
        }
    }


    public boolean juegoListo(){
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
            gestorJugador.registerJugador();
        }
    }

    public void buscarJugador(){
        comprobarJugadores();

        String id = Utils.nombrar("Introduce el ID del jugador: ",4,4);
        Jugador encontrado = gestorJugador.buscarPorID(id);

        if (encontrado == null) System.out.println("No existe ningún jugador con ese ID.");
        else {
            System.out.println("Jugador encontrado:");
            System.out.println(encontrado);
        }
    }

    public void modificarNombreJugador(){
        comprobarJugadores();
        String nuevoNombre = Utils.nombrar("Introduce el nuevo nombre: ", 3, 10);
        jugadorActual.setNameJugador(nuevoNombre);
        System.out.println("Nombre modificado correctamente.");
    }

    //------------------------------- MAQUINA -------------------------------------------

    public boolean MaquinaLista(){
        comprobarMaquinas();
        return  maquinaActual != null ;
    }

    public void comprobarMaquinas(){
        while (gestorMaquina.noHayMaquinas()) {
            Mensajes.noHayMaquina();
            gestorMaquina.registrarMaquina();
        }
        maquinaActual = gestorMaquina.elegirMaquina();
    }

    public void bajaMaquina() {
        if (MaquinaLista()) {
            maquinaActual.modEstadoMaquina(false);
            System.out.println("Máquina dada de baja (inactiva).");
        }
    }

    public void reactivarMaquina() {
        if (MaquinaLista()) {
            maquinaActual.modEstadoMaquina(true);
            System.out.println("Máquina reactivada.");
        }
    }

    public void mostrarRankingPuntuacion() {
        if (MaquinaLista()) maquinaActual.mostrarMaquinasRanking();
        else System.out.println("No hay máquina seleccionada.");
    }

    public void modificarNombreMaquina(){
        comprobarMaquinas();

        String nuevoNombre = Utils.nombrar("Introduce el nuevo nombre: ", 3, 10);
        maquinaActual.setNameMaquina(nuevoNombre);

        System.out.println("Nombre modificado correctamente.");
    }

    public void modificarGeneroMaquina() {
        comprobarMaquinas();
        if (maquinaActual != null) {
            System.out.println("Género actual: " + maquinaActual.getGeneroJuego());
            String nuevoGenero = gestorMaquina.elegirGenero();
            maquinaActual.setGeneroJuego(nuevoGenero);
            System.out.println("Género modificado correctamente a: " + nuevoGenero);
        }
    }

    public void modificarPrecioMaquina() {
        comprobarMaquinas();
        if (maquinaActual != null) {
            System.out.println("Precio actual: " + maquinaActual.getPricePartida() + " créditos");
            int nuevoPrecio = gestorMaquina.elegirPrecio();
            maquinaActual.setPricePartida(nuevoPrecio);
            System.out.println("Precio modificado correctamente a: " + nuevoPrecio + " créditos");
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

    public void registerJugador() {
        gestorJugador.registerJugador();
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
