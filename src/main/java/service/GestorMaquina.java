package service;

import model.MaquinaArcade;
import utils.Mensajes;
import utils.Utils;

public class GestorMaquina {

    private static final String[] GENEROS = {
            "Acción", "Aventura","RPG", "Simulación", "Deportes", "Carreras",
            "Puzzles", "Plataformas", "Musicales", "Sandbox", "Arcade", "Supervivencia"
    };

    private static final int[] PRECIOS = {1, 3, 7, 10};

    private final MaquinaArcade[] maquinas;
    private int numMaquinas;

    public GestorMaquina() {
        this.maquinas = new MaquinaArcade[50];
        this.numMaquinas = 0;
    }

    public boolean noHayMaquinas() {
        return numMaquinas <= 0;
    }

    public void guardarMaquina(MaquinaArcade nuevo) {
        if (numMaquinas >= maquinas.length) System.out.println("Límite de máquinas alcanzado.");
        else {
            maquinas[numMaquinas] = nuevo;
            numMaquinas++;
        }
    }

    public void mostrarMaquinas() {
        Mensajes.encabezadoListaMaquinas();
        Utils.mostrarArray(maquinas, numMaquinas);
    }

    public void mostrarMaquinasActivas() {
        boolean hayAlguna = false;

        Mensajes.encabezadoListaMaquinas();
        for (int i = 0; i < numMaquinas; i++) {
            if (maquinas[i] != null && maquinas[i].isEstadoMaquina()) {
                System.out.println("[ " + (i + 1) + " ] " + maquinas[i]);
                hayAlguna = true;
            }
        }

        if (!hayAlguna) System.out.println("No hay máquinas activas.");
    }

    public void maquinaMasUsada() {
        int max = -1, pos = -1;

        for (int i = 0; i < numMaquinas; i++) {
            if (maquinas[i] != null) {
                if (maquinas[i].getContadorPartidas() > max) {
                    max = maquinas[i].getContadorPartidas();
                    pos = i;
                }
            }
        }

        if (pos == -1) System.out.println("No hay máquinas registradas.");
        else {
            System.out.println("Máquina más usada:");
            System.out.println(maquinas[pos]);
        }
    }

    public MaquinaArcade elegirMaquina() {
        mostrarMaquinas();
        int index = Utils.leerEnterEnRango("Elige una máquina: ", 1, numMaquinas);
        return maquinas[index - 1];
    }

    public void registrarMaquina() {
        String nameMaquina = Utils.nombrar(Mensajes.nuevoNombreMaquina(), 3,10);
        MaquinaArcade nuevo = new MaquinaArcade(nameMaquina, elegirGenero(), elegirPrecio());
        guardarMaquina(nuevo);

        Mensajes.nuevoNombreCierre();
    }

    private String elegirGenero() {
        Mensajes.building();
        Utils.mostrarArray(GENEROS, GENEROS.length);
        int opcion = Utils.leerEnterEnRango("Elige género: ", 1, GENEROS.length);
        return GENEROS[opcion - 1];
    }

    private int elegirPrecio() {
        System.out.println("Precios disponibles:");

        for (int i = 0; i < PRECIOS.length; i++) {
            System.out.println("[ " + (i + 1) + " ] " + PRECIOS[i]);
        }

        int opcion = Utils.leerEnterEnRango("Elige precio: ", 1, PRECIOS.length);
        return PRECIOS[opcion - 1];
    }
}