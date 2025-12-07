package utils;

import model.Jugador;
import model.MaquinaArcade;
import model.SalaRecreativa;

public class Utils {

    /**
     * pide un número por consola y compueba si es un enetero
     * @param mjs
     * @return
     */
    public static int leerEnter(String mjs){//ToDo
        return -1;
    }

    /**
     * retorna booleano indicando si está dentro del rango
     * @param valor
     * @param min
     * @param max
     * @return
     */
    public boolean comprobarRango(int valor, int min, int max){//ToDo
        boolean esValido = true;

        do {
            if (valor < min || valor > max) {
                System.out.println("Error: No esta dentro del rango.");
                esValido = false;
            }

        }while (!esValido);
        return esValido;
    }

    /**
     * generar puntuaciones o créditos automáticos
     * @param min
     * @param max
     * @return
     */
    public static int generarNumeroAleatorio(int min, int max){//ToDo
        return -1;
    }

    /**
     * Generar una puntuación aleatoria entre 0 y 9999, e incrementar el
     * contador de partidas.
     */
    public static void genPuntacion(){// ToDo

    }
}

