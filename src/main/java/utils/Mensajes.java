package utils;

/**
 * Clase de mensajes contantes
 */
public class Mensajes {

    //------------------------------------------- MENUS -------------------------------------------

    public static void mostrarMenuPrincipal() {
        System.out.println("""
                \n=============================================================
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
                \n======================  J U G A D O R  ======================
                
                   1. Jugar una partida
                   2. Recargar créditos
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    public static void mostrarMenuGestionJugador() {
        System.out.println("""
                \n=========  G E S T I Ó N   D E   J U G A D O R E S  =========
                
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

    public static void mostrarMenuGestionMaquina() {
        System.out.println("""
                \n==========  G E S T I Ó N   D E   M A Q U I N A S  ==========
                
                   1. Registrar nueva maquina
                   2. Editar maquina
                   3. Escoger maquina
                   4. Listar maquinas
                   5. Listar máquinas activas
                   6. Maquina más usada
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    public static void mostrarMenuEstadisticasRanking() {
        System.out.println("""
                \n==========  G E S T I Ó N   D E   M A Q U I N A S  ==========
                
                   1. Listar máquinas activas
                   2. Mostrar jugador más activo
                   3. Mostrar máquina más usada
                   4. Ranking de una máquina
                   5. Maquina más usada
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    //------------------------------------------- EDITAR -------------------------------------------

    public static void menuEditarJugador() {
        System.out.println("""
                \n================  E D I T A R  J U G A D O R  ===============
                
                   1. Cambiar Nombre
                   2. Recargar créditos
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    public static void menuEditarMaquina() {
        System.out.println("""
                \n================  E D I T A R  M A Q U I N A  ===============
                
                   1. Cambiar Nombre
                   2. Dar de baja una máquina
                   3. Mantenimiento / Reactivar máquina
                
                -------------------------------------------------------------
                   0. Volver al menú principal
                =============================================================
                """);
    }

    //------------------------------------- CAJA DE INSERCIÓN -------------------------------------

    public static void encabezadoListaJugadores() {
        System.out.println("\n==================== LISTA DE JUGADORES ====================");
    }

    public static void encabezadoListaMaquinas() {
        System.out.println("\n===================== LISTA DE MAQUINAS =====================");
    }

    public static String nuevoNombreJugador() {
        return ("""
                ╔══════════ NUEVO JUGADOR ══════════╗
                    Introduzca nombre del jugador:
                >\s""");
    }

    public static String nuevoNombreMaquina() {
        return ("""
                ╔══════════ NUEVA MAQUINA ══════════╗
                   Introduzca nombre de la maquina:
                >\s""");
    }

    public static void nuevoNombreCierre() {
        System.out.println("╚═══════════════════════════════════╝");
    }

    public static String annadirCredito() {
        return ("""
                \n═════════════════════ RECARGAR CRÉDITO ═════════════════════
                
                   Introduzca la cantidad de créditos a añadir:
                      >\s""");
    }

    public static void annadirCreditoCierre() {
        System.out.println("""
                ═════════════════════════════════════════════════════════════""");
    }

    //------------------------------------------ ALERTAS ------------------------------------------

    public static void noHayCredito() {
        System.out.println("""
                \n=============================================================
                             ⚠  NO TIENES CRÉDITOS SUFICIENTES  ⚠
                -------------------------------------------------------------
                      Este jugador no dispone de créditos suficientes.
                                  Por favor, añada créditos.
                =============================================================
                """);
    }

    public static void noHayJugadores() {
        System.out.println("""
                \n=============================================================
                                 ⚠  NO HAY JUGADORES REGISTRADOS  ⚠
                -------------------------------------------------------------
                            Aún no existe ningún jugador en el sistema.
                                    Por favor, crea uno.
                =============================================================
                """);
    }

    public static void noHayMaquina() {
        System.out.println("""
                \n=============================================================
                              ⚠  NO HAY MAQUINAS REGISTRADOS  ⚠
                -------------------------------------------------------------
                        Aún no existe ningúna maquina en el sistema.
                                    Por favor, crea una.
                =============================================================
                """);
    }

    public static void building() {
        System.out.println("""
                \n=============================================================
                        BUILDING.
                =============================================================
                """);
    }
}

