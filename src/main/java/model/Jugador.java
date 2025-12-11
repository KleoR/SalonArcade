package model;

import utils.Utils;

public class Jugador {
    private String nameJugador;
    private String idJugador;
    private int creditosJugador;
    private int numPartidasJugadas;

    public Jugador(String nameJugador, String idJugador, int creditosJugador, int numPartidasJagadas) {
        this.nameJugador = nameJugador;
        this.idJugador = idJugador;
        this.creditosJugador = creditosJugador;
        this.numPartidasJugadas = numPartidasJagadas;
    }

    //------------------------------------------ GETTER/SETTER --------------------------------------------

    public String getNameJugador() {
        return nameJugador;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public int getCreditosJugador() {
        return creditosJugador;
    }

    public int getNumPartidasJugadas() {
        return numPartidasJugadas;
    }

    public void setNameJugador(String nameJugador) {
        this.nameJugador = nameJugador;
    }

    public void setIdJugador(String idJugador) {
        this.idJugador = idJugador;
    }

    public void setCreditosJugador(int creditosJugador) {
        this.creditosJugador = creditosJugador;
    }

    public void setNumPartidasJugadas(int numPartidasJugadas) {
        this.numPartidasJugadas = numPartidasJugadas;
    }

    //------------------------------------------ FUNCIONALIDADES --------------------------------------------

    /**
     * Recarga el credito
     * @return
     */
    public int recargaCreditos(){//ToDo
        return -1;
    }

    /**
     * Gastar créditos (solo si tiene suficientes)
     * @return
     */
    public int gastarCreditos(int credito){//ToDo
        if (creditosJugador >= 0) System.out.println("No tienes suficientes créditos");
        else creditosJugador += credito;

        return -1;
    }


    /**
     * Incrementar el número de partidas jugadas
     * @return int - numero de partidas jugadas
     */
    public int contPartidas() {//ToDo
        return numPartidasJugadas++;
    }


    @Override
    public String toString() {
        return """
                ==[ %s ]===============================
                      Créditos: %d | Partidas: %d         [ ID: %s ]
                =====================================================
                """.formatted(this.nameJugador, this.creditosJugador, this.contPartidas(), this.idJugador);
    }
}


