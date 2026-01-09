package model;

import utils.Mensajes;
import utils.Utils;

public class Jugador {
    private String nameJugador;
    private final String idJugador;
    private int creditosJugador;
    private int numPartidasJugadas;

    public Jugador(String nameJugador, String idJugador, int creditosJugador, int numPartidasJugadas) {
        this.nameJugador = nameJugador;
        this.idJugador = idJugador;
        this.creditosJugador = creditosJugador;
        this.numPartidasJugadas = numPartidasJugadas;
    }

    //------------------------------------------ GETTER/SETTER --------------------------------------------

    public String getIdJugador() {
        return idJugador;
    }

    public int getCreditosJugador() { return creditosJugador; }

    public int getNumPartidasJugadas() {
        return numPartidasJugadas;
    }

    public void setNameJugador(String nuevoNombre) {
        this.nameJugador = nuevoNombre;
    }
//------------------------------------------ FUNCIONALIDADES --------------------------------------------

    public void recargaCreditos() {
        int cantidad = Utils.leerEnterEnRango(Mensajes.annadirCredito(),1,9999);
        this.creditosJugador += cantidad;
        Mensajes.creditoCierre();
    }

    /**
     * Gastar créditos (solo si tiene suficientes)
     * @return creditos del jugador
     */
    public boolean gastarCreditos(int credito) {
        boolean ok = true;

        if (credito <= 0) {
            System.out.println("Crédito inválido.");
            ok = false;
        } else if (creditosJugador < credito) {
            System.out.println("No tienes suficientes créditos");
            ok = false;
        } else creditosJugador -= credito;

        return ok;
    }

    public boolean comprobarCredito() {
        return creditosJugador <= 0;
    }

    /**
     * Incrementar el número de partidas jugadas
     * @return int - numero de partidas jugadas
     */
    public int contPartidas() {
        return ++numPartidasJugadas;
    }

    @Override
    public String toString() {
        return """
                %s
                   • Créditos: %d | Partidas: %5d | ID: %-4s
                -------------------------------------------------------------
                """.formatted(this.nameJugador, this.creditosJugador, numPartidasJugadas, this.idJugador);
    }


}


