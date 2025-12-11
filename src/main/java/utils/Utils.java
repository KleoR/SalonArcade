package utils;

import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Utils {

    /**
     * Pide un número por consola y comprueba si es un entero y devuelve un int
     * @param mjs  mensaje que se mostrará al pedir el número
     * @return int - numero validado
     */
    public static int leerEnter(String mjs){//ToDo - Uncheck
        Scanner sc = new Scanner(System.in);
        boolean esValido;
        int numero = 0;

        do {
            esValido = true;
            System.out.print(mjs);

            try {
                numero = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: No es un numero entero.");
                esValido = false;
                sc.nextLine();
            }

        } while (!esValido);
        return numero;
    }

    /**
     * Se encarga de decir si un valor se encuentra dentro de un rango y devuelve un booleano
     * @param valor numero a comprobar
     * @param min valor mínimo permitido (incluido)
     * @param max valor maximo permitido (incluido)
     * @return boolean - validacion del rango
     */
    public static boolean comprobarRango(int valor, int min, int max){//ToDo - Uncheck
         return valor >= min && valor <= max;
    }

    /**
     * Solícita un número entero al usuario mediante leerEntero()
     * y comprueba si se encuentra dentro de un rango médiente comprobarRango()
     * Repetira la peticion hasta que se introduzca un número dentro del rango.
     *      Nota: esto se podria meter en comprobar rango si devolviese un int en vez de un boolean
     * @param mjs mensaje que se mostrará al pedir el número
     * @param min valor mínimo permitido (incluido)
     * @param max valor maximo permitido (incluido)
     * @return int - numero entero dentro del rango
     */
    public static int leerEnterEnRango(String mjs, int min, int max) {
        boolean esValido;
        int valor;

        do {
            valor = leerEnter(mjs);
            esValido = comprobarRango(valor, min, max);
            System.out.println("\n");

            if (!esValido) System.out.println("Error: el valor debe estar entre " + min + " y " + max + ".");

        } while (!esValido);

        return valor;
    }

    /**
     * Genera numeros enteros automaticos dentro de un rango dado.
     *  nota: <a href="https://es.stackoverflow.com/questions/5390/como-generar-n%C3%BAmeros-aleatorios-dentro-de-un-rango-de-valores">...</a>
     * @param min valor mínimo permitido (incluido)
     * @param max valor maximo permitido (incluido)
     * @return int - numero aleatorio
     */
    public static int generarNumeroAleatorio(int min, int max){//ToDo - Uncheck
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    /**
     * Pide por pantalla un número al usuario y verifica que este dentro del rango asignado.
     * @param min numero de la primera opcion
     * @param max numero de la ultima opcion
     * @return int - numero dentro del rango
     */
    public static int opcionesUser(int min, int max){
        return Utils.leerEnterEnRango("Seleccione una opción: ", min, max);
    }

    /**
     * Metodo que comprueba que la palabra introducida por el usuario cumpla los requisitos de longitud y no se encuentre vacio.
     * @param mjs mensaje para el usuario
     * @param min minimo de letras
     * @param max maximo de letras
     * @return String - nombre validado
     */
    public static String nombrar(String mjs, int min, int max){
        Scanner sc = new Scanner(System.in);
        boolean esValido;
        String name;

        do {
            esValido = true;
            System.out.print(mjs);
            name = sc.nextLine().trim();

            if (name.isEmpty()) System.out.println("Error: el nombre no puede estar vacío.");
            else if (name.length() < min || name.length() > max) System.out.println("Error: el nombre no puede tener menos de " + min + " ni mas de " + max + " letras.");
            else esValido = false;

        } while (esValido);

        return name;
    }

}

