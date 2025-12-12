package service;

public class Mensajes {

    //------------------------------------------- MENUS -------------------------------------------

    public static void mostrarMenu() {
        System.out.println("""
                =============================================================
                              ★  A R C A D E   M A N A G E R  ★
                =============================================================

                   |  x | Registrar nuevo jugador
                   |  2 | Registrar nueva máquina arcade
                   |  x | Recargar créditos a un jugador
                   |  x | Listar jugadores
                   |  5 | Listar máquinas
                   |  6 | Listar máquinas activas
                   |  7 | Mantenimiento / Reactivar máquina
                   |  x | Jugar una partida
                   |  x | Mostrar jugador más activo
                   | 10 | Mostrar máquina más usada
                   | 11 | Ranking de una máquina
                   | 12 | Dar de baja una máquina
                   | 13 | Editar máquina arcade
                   | x | Editar jugador

                -------------------------------------------------------------
                                 0.  █  S  A  L  I  R  █
                =============================================================
                """);
    }


    public static void mostrarMenuPrincipal() {
        System.out.println("""
                =============================================================
                                 A R C A D E   M A N A G E R
                =============================================================
                
                   1. Jugar
                   2. Gestión de jugadores
                   3. Gestión de máquinas
                   4. Estadísticas y Ranking
                
                -------------------------------------------------------------
                                 0.  █  S  A  L  I  R  █
                =============================================================
                """);
    }

    public static void mostrarMenuJugar() {
        System.out.println("""
                ======================  J U G A D O R  ======================
                
                   1. Jugar una partida
                   2. Recargar créditos
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    public static void mostrarMenuGestionJugador() {
        System.out.println("""
                =========  G E S T I Ó N   D E   J U G A D O R E S  =========
                
                   1. Registrar nuevo jugador
                   2. Editar jugador
                   3. Escoger jugador
                   4. Listar jugadores
                   5. Jugador más activo
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    public static void menuEditarJugador() {
        System.out.println("""
                ================  E D I T A R  J U G A D O R  ===============
                
                   1. Cambiar Nombre
                   2. Recargar créditos
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    //------------------------------------- CAJA DE INSERCIÓN -------------------------------------

    public static void encabezadoListaJugadores() {
        System.out.println("\n==================== LISTA DE JUGADORES ====================");
    }

    public static String nuevoNombreJugador() {
        return ("""
                ╔══════════ NUEVO JUGADOR ══════════╗
                   Introduzca nombre del jugador:
                >""");
    }

    public static void nuevoNombreJugadorCierre() {
        System.out.println("╚═══════════════════════════════════╝");
    }

    public static String anadirCredito() {
        return ("""
                ═════════════════════ RECARGAR CRÉDITO ═════════════════════
               \s
                   Introduzca la cantidad de créditos a añadir:
                      >\s""");
    }

    public static void anadirCreditoCierre() {
        System.out.println("""
                ═════════════════════════════════════════════════════════════""");
    }

    //------------------------------------------ ALERTAS ------------------------------------------

    public static void noHayCredito() {
        System.out.println("""
                =============================================================
                             ⚠  NO TIENES CRÉDITOS SUFICIENTES  ⚠
                -------------------------------------------------------------
                      Este jugador no dispone de créditos suficientes.
                                  Por favor, añada créditos.
                =============================================================
                """);
    }

    public static void noHayJugadores() {
        System.out.println("""
                =============================================================
                                 ⚠  NO HAY JUGADORES REGISTRADOS  ⚠
                -------------------------------------------------------------
                            Aún no existe ningún jugador en el sistema.
                                    Por favor, crea uno.
                =============================================================
                """);
    }


}

