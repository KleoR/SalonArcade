package model;

public class Jugador {
    private String nameJugador;
    private String idJugador;
    private int creditosJugador;
    private int numPartidasJagadas;

    //------------------------------------------ GETTER/SETTER --------------------------------------------

    public Jugador(String nameJugador, String idJugador, int creditosJugador, int numPartidasJagadas) {
        this.nameJugador = nameJugador;
        this.idJugador = idJugador;
        this.creditosJugador = creditosJugador;
        this.numPartidasJagadas = numPartidasJagadas;
    }

    public String getNameJugador() {
        return nameJugador;
    }

    public String getIdJugador() {
        return idJugador;
    }

    public int getCreditosJugador() {
        return creditosJugador;
    }

    public int getNumPartidasJagadas() {
        return numPartidasJagadas;
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

    public void setNumPartidasJagadas(int numPartidasJagadas) {
        this.numPartidasJagadas = numPartidasJagadas;
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
    public int gastarCreditos(){//ToDo
        return -1;
    }

    /**
     * Incrementar el número de partidas jugadas
     * @return
     */
    public int contPartidas() {//ToDo
        return -1;
    }


    @Override
    public String toString() {
        return "Jugador{" +
                "nameJugador='" + nameJugador + '\'' +
                ", idJugador='" + idJugador + '\'' +
                ", creditosJugador=" + creditosJugador +
                ", numPartidasJagadas=" + numPartidasJagadas +
                '}';
    }
}


