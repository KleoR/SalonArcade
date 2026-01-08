package model;

import utils.Utils;

public class MaquinaArcade {
    private final MaquinaArcade[] maquinas = new MaquinaArcade[50];
    private String nameMaquina;
    private int pricePartida;
    private int contadorPartidas;
    private boolean estadoMaquina;
    private String[][] rankingJugadores;

    public MaquinaArcade(String nameMaquina, String generoJuego, int pricePartida, boolean estadoMaquina, int contadorPartidas) {
        this.nameMaquina = nameMaquina;
        this.pricePartida = pricePartida;
        this.estadoMaquina = true;
        this.contadorPartidas = 0;
    }

//------------------------------------------ GETTER/SETTER --------------------------------------------

    public MaquinaArcade[] getMaquinas() {
        return maquinas;
    }

    public String getNameMaquina() {
        return nameMaquina;
    }

    public void setNameMaquina(String nameMaquina) {
        this.nameMaquina = nameMaquina;
    }

    public int getPricePartida() {
        return pricePartida;
    }

    public void setPricePartida(int pricePartida) {
        this.pricePartida = pricePartida;
    }

    public int getContadorPartidas() {
        return contadorPartidas;
    }

    public void setContadorPartidas(int contadorPartidas) {
        this.contadorPartidas = contadorPartidas;
    }

    public boolean isEstadoMaquina() {
        return estadoMaquina;
    }

    public void setEstadoMaquina(boolean estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public String[][] getRankingJugadores() {
        return rankingJugadores;
    }

    public void setRankingJugadores(String[][] rankingJugadores) {
        this.rankingJugadores = rankingJugadores;
    }

//------------------------------------------ FUNCIONALIDADES --------------------------------------------
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
        } else if (this.contadorPartidas % 100 != 0)  modEstadoMaquina(true);
    }

    /**
     * Se debe generar una puntuación aleatoria entre 0 y 9999, e incrementar el
     * contador de partidas.

     * ○
     * ○ Si la puntuación ha superado el top 3, registarla y actualizar correctamente el
     * ranking (insertando en el lugar correspondiente y desplazando valores).
     * ○ El método debe devolver la puntuación de la partida.
     */
    public int jugarNuevaPartida(){ //Todo
        int puntuacion = 0;

        if (!estadoMaquina){
            System.out.println("La máquina está inactiva. No se puede jugar.");
            // Devolver al menu de elección de maquina
        } else{
            puntuacion = genPuntuacion();
            conMaquinaPartida();
            estadoMaquina();
        }
        return puntuacion;
    }

    /**
     * Se debe generar una puntuación aleatoria entre 0 y 9999
     */
    public int genPuntuacion(){
       return Utils.generarNumeroAleatorio(0,9999);
    }

    /**
     * e incrementar el contador de partidas.
     * @return int - contador actualizado
     */
    public int conMaquinaPartida(){
        return ++this.contadorPartidas;
    }
}



