package model;

public class MaquinaArcade {
    private String nameMaquina;
    private int generoJuego;
    private int pricePartida;
    private boolean estadoMaquina;
    private int contadorPartidas;
    private String[][] rankingJugadores;

    public MaquinaArcade(String nameMaquina, int generoJuego, int pricePartida, boolean estadoMaquina, int contadorPartidas) {
        this.nameMaquina = nameMaquina;
        this.generoJuego = generoJuego;
        this.pricePartida = pricePartida;
        this.estadoMaquina = estadoMaquina;
        this.contadorPartidas = contadorPartidas;
    }

    //------------------------------------------ GETTER/SETTER --------------------------------------------

    public String getNameMaquina() {
        return nameMaquina;
    }

    public int getGeneroJuego() {
        return generoJuego;
    }

    public int getPricePartida() {
        return pricePartida;
    }

    public boolean isEstadoMaquina() {
        return estadoMaquina;
    }

    public int getContadorPartidas() {
        return contadorPartidas;
    }

    public String[][] getRankingJugadores() {
        return rankingJugadores;
    }

    public void setNameMaquina(String nameMaquina) {
        this.nameMaquina = nameMaquina;
    }

    public void setGeneroJuego(int generoJuego) {
        this.generoJuego = generoJuego;
    }

    public void setPricePartida(int pricePartida) {
        this.pricePartida = pricePartida;
    }

    public void setEstadoMaquina(boolean estadoMaquina) {
        this.estadoMaquina = estadoMaquina;
    }

    public void setContadorPartidas(int contadorPartidas) {
        this.contadorPartidas = contadorPartidas;
    }

    public void setRankingJugadores(String[][] rankingJugadores) {
        this.rankingJugadores = rankingJugadores;
    }

//------------------------------------------ FUNCIONALIDADES --------------------------------------------

    /**
     * Cambia el estaado de la maquina
     * @return
     */
    public static boolean modEstadoMaquina(){// Todo
        return true;
    }

    /**
     * Consulta si una maquina esta activa
     */
    public static void consultEstadoMaquina(){//Todo

    }

    /**
     * Se debe generar una puntuación aleatoria entre 0 y 9999, e incrementar el
     * contador de partidas.
     * ○ Si el contador llega a un múltiplo de 100 (100, 200, 300, 1000, 1500…), la
     * máquina se desactiva sola para mantenimiento.
     * ○ Si la puntuación ha superado el top 3, registarla y actualizar correctamente el
     * ranking (insertando en el lugar correspondiente y desplazando valores).
     * ○ El método debe devolver la puntuación de la partida.
     */
    public static void jugarNuevaPartida(){ //Todo

    }

    /**
     * Muestra informacion de la maquina
     */
    public static void infoMaquina(String nameMaquina, int generoJuego, int pricePartida, boolean estadoMaquina, int contadorPartidas, String[][] rankingJugadores){ //Todo

    }
}



