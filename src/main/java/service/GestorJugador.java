package service;

import model.Jugador;
import utils.Utils;

public class GestorJugador {
    private final Jugador[] jugadores;
    private int numJugadores;


    public GestorJugador() {
        this.jugadores = new Jugador[50];
        this.numJugadores = 0;
    }

    /**
     * Comprueba si hay jugadores.
     * @return booleano - devuelve si hay o no jugadores.
     */
    public boolean noHayJugadores() {
        return numJugadores <= 0;
    }

    /**
     * Solicita un nombre por consola y se le asigna un id, despues lo lleva a guardar.
     */
    public void RegisterJugador(){ //ToDo
        if (noHayJugadores()) Mensajes.noHayJugadores();

        String nameJugador = Utils.nombrar(Mensajes.nuevoNombreJugador(), 3,10);
        System.out.println("╚═══════════════════════════════════╝");
        String idJugador = ""+ Utils.generarNumeroAleatorio(1000,9999);

        Jugador nuevo = new Jugador(nameJugador, idJugador, 0, -1);
        guardarJugador(nuevo);
    }

    public void guardarJugador(Jugador nuevo) {
        if (numJugadores >= jugadores.length) System.out.println("Límite de jugadores alcanzado.");
        else jugadores[numJugadores++] = nuevo;
    }

    public void mostrarJugadores(){
        System.out.println("\n==================== LISTA DE JUGADORES ====================");
        for (int i = 0; i < numJugadores; i++) {
            System.out.println("[ " + (i + 1) + " ] " + jugadores[i]);
        }
    }

    public Jugador elegirJugador(){
        mostrarJugadores();
        int index = Utils.leerEnterEnRango("Elige un jugador: ",1, numJugadores);
        return jugadores[index - 1];
    }

}
