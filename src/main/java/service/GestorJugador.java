package service;

import model.Jugador;
import utils.Mensajes;
import utils.Utils;

public class GestorJugador {
        private final Jugador[] jugadores;
        private int numJugadores;

        public GestorJugador() {
            this.jugadores = new Jugador[50];
            this.numJugadores = 0;
        }

    /**
     * Comprueba si existen jugadores registrados.
     * La verificación se realiza comprobando el valor de NumJugadores
     * @return boolean - true si no hay jugadores registrados
     */
    public boolean noHayJugadores() {
        return numJugadores <= 0;
    }

    /**
     * Registra un nuevo jugador y se solicita un nombre mediante Utils.nombrar().
     * Se genera un ID único para el jugador mediante generaIDJugador().
     * Se crea la instancia Jugador y se almacena en guardarJugador().
     *  Nota: Este método no devuelve el jugador creado pero podría si se quire.
     */
    public void registerJugador(){
        String nameJugador = Utils.nombrar(Mensajes.nuevoNombreJugador(), 3,10);
        Jugador nuevo = new Jugador(nameJugador, generaIDJugador(), 0, 0);
        guardarJugador(nuevo);

        Mensajes.nuevoNombreCierre();
    }

    public void guardarJugador(Jugador nuevo) {
        if (numJugadores >= jugadores.length) System.out.println("Límite de jugadores alcanzado.");
        else {
            jugadores[numJugadores] = nuevo;
            numJugadores++;
        }
    }

    public void mostrarJugadores() {
        Mensajes.encabezadoListaJugadores();
        Utils.mostrarArray(jugadores, numJugadores);
    }


    public Jugador elegirJugador(){
        mostrarJugadores();
        int index = Utils.leerEnterEnRango("Elige un jugador: ",1, numJugadores);
        return jugadores[index - 1];
    }

    public void jugadorMasActivo() {
        int max = -1, pos = -1;

        for (int i = 0; i < numJugadores; i++) {
            if (jugadores[i] != null) {
                if (jugadores[i].getNumPartidasJugadas() > max) {
                    max = jugadores[i].getNumPartidasJugadas();
                    pos = i;
                }
            }
        }

        if (pos == -1) System.out.println("No hay jugadores registrados.");
        else {
            System.out.println("Jugador más activo:");
            System.out.println(jugadores[pos]);
        }
    }

    //-------------------------------------------- ID ----------------------------------------------

    private boolean existeId(String id) {
        return buscarPorID(id) != null;
    }

    public String generaIDJugador() {
        String id;
        do {
            id = "" + Utils.generarNumeroAleatorio(1000, 9999);
        } while (existeId(id));
        return id;
    }

    public Jugador buscarPorID(String id) {
        Jugador encontrado = null;
        for (int i = 0; i < numJugadores; i++) {
            if (jugadores[i] != null && jugadores[i].getIdJugador().equals(id)) {
                encontrado = jugadores[i];
                break;
            }
        }

        return encontrado;
    }
}
