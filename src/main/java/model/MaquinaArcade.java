package model;

import service.Games.CaraCruz;
import service.Games.SumaPares;
import utils.Mensajes;
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

    public int getPricePartida() {
        return pricePartida;
    }

    public int getContadorPartidas() {
        return contadorPartidas;
    }

    public boolean isEstadoMaquina() {
        return estadoMaquina;
    }

    public void setNameMaquina(String nameMaquina) {
        this.nameMaquina = nameMaquina;
    }
//------------------------------------------ FUNCIONALIDADES --------------------------------------------

    /**
     */
    public int jugarNuevaPartida(String idJugador){
        int puntuacion = -1;

        if (!isEstadoMaquina()) {
            System.out.println("La máquina está inactiva. No se puede jugar.");
            return puntuacion;
        }


        switch (this.nameMaquina) {
            case "CaraCruz":
                puntuacion = CaraCruz.juegoCaraCruz();
                break;
            case "SumaPares":
                puntuacion = SumaPares.jugarSumaPares();
                break;

            default:
                // Lógica actual: aleatoria
                if (!hasGanado()) {
                    Mensajes.perdido();
                    puntuacion = 0; // Si pierde, puntuación 0
                } else {
                    Mensajes.ganado();
                    puntuacion = genPuntuacion();
                }
        }

        if (!isEstadoMaquina()) {
            System.out.println("La máquina está inactiva. No se puede jugar.");
            return puntuacion;
        }

        conMaquinaPartida();
        estadoMaquina();

        return puntuacion;
    }

    public int maquinaActiva(){

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
     * Si el contador llega a un múltiplo de 10 (10, 20, 30, 100, 150…), la
     * máquina se desactiva sola para mantenimiento.
     */
    public void estadoMaquina(){//Todo
        if (this.contadorPartidas > 0 && this.contadorPartidas % 10 == 0) {
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

    public void mostrarMaquinasRanking() {
        boolean hayAlguna = false;

        Mensajes.ranking();
        for (int i = 0; i < 3; i++) {
            if (topJugador[i] == null) System.out.printf("       │   %dº  %-10s ─────────────────  [%6d] │\n", i + 1, "---", 0);
            else {
                System.out.printf("       │   %dº  %-10s ─────────────────  [%6d] │\n", i + 1, topJugador[i], topPuntos[i]);
                hayAlguna = true;
            }
        }
        Mensajes.rankingCierre();

        if (!hayAlguna) System.out.println("No hay puntuaciones registradas.");
    }

    @Override
    public String toString() {
        return """
                %-38s  • %-13s
                                    Precio: %2d | Partidas: %2d | Estado: %b
                -------------------------------------------------------------
                """.formatted(this.nameMaquina, this.generoJuego, this.pricePartida, this.contadorPartidas, (estadoMaquina ? "Activa" : "Inactiva"));
    }
}



