package model;

import utils.Utils;

public class MaquinaArcade {
    private String nameMaquina;
    private String generoJuego;
    private int pricePartida;
    private int contadorPartidas;
    private boolean estadoMaquina;

    private final int[] topPuntos = new int[3];
    private final String[] topJugador = new String[3];

    public MaquinaArcade(String nameMaquina, String generoJuego, int pricePartida) {
        this.nameMaquina = nameMaquina;
        this.generoJuego = generoJuego;
        this.pricePartida = pricePartida;
        this.estadoMaquina = true;
        this.contadorPartidas = 0;
    }

//------------------------------------------ GETTER/SETTER --------------------------------------------

    public String getNameMaquina() {
        return nameMaquina;
    }

    public String getGeneroJuego() {
        return generoJuego;
    }

    public int getPricePartida() {
        return pricePartida;
    }

    public int getContadorPartidas() {
        return contadorPartidas;
    }

    public boolean isEstadoMaquina() {
        return estadoMaquina;
    }



//------------------------------------------ FUNCIONALIDADES --------------------------------------------

    /**
     */
    public int jugarNuevaPartida(String idJugador){ //Todo
        int puntuacion = -1;

        if (!isEstadoMaquina()) System.out.println("La máquina está inactiva. No se puede jugar.");
        else if(hasGanado()){
            System.out.println("♛ HAS GANADO ♛");
            puntuacion = genPuntuacion();
            modRanking(idJugador, puntuacion);
            conMaquinaPartida();
            estadoMaquina();
        } else System.out.println("☠ HAS PERDIDO ☠");

        return puntuacion;
    }

    public boolean hasGanado(){
        return Utils.generarNumeroAleatorio(0, 1) == 1;
    }

    /**
     * Sobreescribe el estado de la máquina por el aportado por el atributo
     *
     * @param nuevoEstado nuevo estado de la máquina
     */
    public void modEstadoMaquina(boolean nuevoEstado){// Todo
        this.estadoMaquina = nuevoEstado;
    }

    /**
     * Si el contador llega a un múltiplo de 100 (100, 200, 300, 1000, 1500…), la
     * máquina se desactiva sola para mantenimiento.
     */
    public void estadoMaquina(){//Todo
        if (this.contadorPartidas > 0 && this.contadorPartidas % 100 == 0) {
            modEstadoMaquina(false);
            System.out.println("La máquina se ha desactivado para mantenimiento.");
        } else  modEstadoMaquina(true);
    }

    /**
     * Se debe generar una puntuación aleatoria entre 0 y 9999
     */
    public int genPuntuacion(){
       return Utils.generarNumeroAleatorio(0,9999);
    }

    /**
     * algo e incrementar el contador de partidas.
     * @return int - contador actualizado
     */
    public int conMaquinaPartida(){
        return ++this.contadorPartidas;
    }

    private void modRanking(String idJugador, int puntuacion) {

        for (int i = 0; i < 3; i++) {
            if (puntuacion > topPuntos[i]) {
                for (int j = 2; j > i; j--) {
                    topPuntos[j] = topPuntos[j - 1];
                    topJugador[j] = topJugador[j - 1];
                }

                topPuntos[i] = puntuacion;
                topJugador[i] = idJugador;
                break;
            }
        }
    }


    @Override
    public String toString() {
        return nameMaquina + " | " + generoJuego + " | Precio: " + pricePartida
                + " | Partidas: " + contadorPartidas
                + " | Estado: " + (estadoMaquina ? "Activa" : "Inactiva");
    }
}



