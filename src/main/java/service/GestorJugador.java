package service;

import model.Jugador;
import model.SalaRecreativa;
import utils.Utils;

public class GestorJugador {
    private SalaRecreativa sala;
    private Jugador[] jugadores;
    public static int numJugadores;


    public GestorJugador(SalaRecreativa sala) { // ← nombre bien
        this.sala = sala;
        this.jugadores = new Jugador[50];
        numJugadores = 0;
    }

    /**
     * Comprueba si hay jugadores.
     * @return booleano - devuelve si hay o no jugadores.
     */
    public boolean noHayJugadores() {
        return numJugadores <= 0;
    }

    /**
     *
     * @return
     */
    public void RegisterJugador(){ //ToDo
        if (noHayJugadores()) Mensajes.noHayJugadores();

        String nameJugador = Utils.nombrar(Mensajes.nuevoNombreJugador(), 3,10);
        System.out.println("╚═══════════════════════════════════╝");
        String idJugador = ""+ Utils.generarNumeroAleatorio(1000,9999);

        Jugador nuevo = new Jugador(nameJugador, idJugador, 0, 0);
        guardarJugador(nuevo);
        return nuevo;
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

    public Jugador buscarPorId(String id) {
        for (int i = 0; i < numJugadores; i++) {
            if (jugadores[i] != null && jugadores[i].getIdJugador().equals(id)) return jugadores[i];
        }
        return null;
    }

    public Jugador elegirJugador(){
        mostrarJugadores();
        int index = Utils.leerEnterEnRango("Elige un jugador: ",1, numJugadores);
        return jugadores[index - 1];
    }

}
