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

    public void setNameMaquina(String nameMaquina) {
        this.nameMaquina = nameMaquina;
    }

    public void setGeneroJuego(String generoJuego) {
        this.generoJuego = generoJuego;
    }

    public void setPricePartida(int pricePartida) {
        this.pricePartida = pricePartida;
    }



    //------------------------------------------ JUEGO --------------------------------------------

    /**
     * Jugar una nueva partida en la máquina.
     * @param idJugador Identificador del jugador.
     * @return Puntuación obtenida, o -1 si la máquina está inactiva.
     */
    public int jugarNuevaPartida(String idJugador) {
        if (!isEstadoMaquina()) {
            return manejarMaquinaInactiva();
        }

        int puntuacion = ejecutarJuego();
        actualizarEstadoPartida();
        actualizarRanking(idJugador, puntuacion);

        return puntuacion;
    }

    private int manejarMaquinaInactiva() {
        System.out.println("La máquina está inactiva. No se puede jugar.");
        return -1;
    }

    private int ejecutarJuego() {
        return switch (this.nameMaquina) {
            case "CaraCruz" -> CaraCruz.juegoCaraCruz();
            case "SumaPares" -> SumaPares.jugarSumaPares();
            default -> ejecutarJuegoAleatorio();
        };
    }

    private int ejecutarJuegoAleatorio() {
        if (!hasGanado()) {
            Mensajes.perdido();
            return 0;
        } else {
            Mensajes.ganado();
            return genPuntuacion();
        }
    }

    /**
     * Actualiza el estado de la máquina después de una partida.
     * Incrementa el contador de partidas y verifica si la máquina debe desactivarse.
     */
    private void actualizarEstadoPartida() {
        conMaquinaPartida();
        estadoMaquina();
    }

    /**
     * Determina si el jugador ha ganado (para juegos aleatorios).
     * @return true si ha ganado, false en caso contrario.
     */
    public boolean hasGanado(){
        return Utils.generarNumeroAleatorio(0, 1) == 1;
    }

    /**
     * Se debe generar una puntuación aleatoria entre 0 y 9999
     */
    public int genPuntuacion(){
        return Utils.generarNumeroAleatorio(0,9999);
    }

    /**
     * Incrementar el contador de partidas.
     */
    private void conMaquinaPartida(){
        this.contadorPartidas++;
    }

    //------------------------------------------ ESTADO DE LA MÁQUINA --------------------------------------------

    /**
     * Sobreescribe el estado de la máquina por el aportado por el atributo
     *
     * @param nuevoEstado nuevo estado de la máquina
     */
    public void modEstadoMaquina(boolean nuevoEstado) {
        this.estadoMaquina = nuevoEstado;
    }

    /**
     * Verifica si la máquina debe desactivarse por mantenimiento.
     * Si el contador de partidas es múltiplo de 10, la máquina se desactiva.
     */
    public void estadoMaquina() {
        if (this.contadorPartidas > 0 && this.contadorPartidas % 10 == 0) {
            modEstadoMaquina(false);
            System.out.println("La máquina se ha desactivado para mantenimiento.");
        }
    }

    // ------------------------------------------ RANKING --------------------------------------------

    /**
     * Actualiza el ranking con la nueva puntuación del jugador.
     * @param idJugador Identificador del jugador.
     * @param puntuacion Puntuación obtenida.
     */
    private void actualizarRanking(String idJugador, int puntuacion) {
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

    /**
     * Muestra el ranking de la máquina.
     */
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



