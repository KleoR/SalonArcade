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

    public static void mostrarMenu( String titulo, String l1) {
        System.out.printf("""
                \n%-61s
                
                %-61s
                
                -------------------------------------------------------------
                   0. Volver
                =============================================================
                
                """, titulo, l1);
    }

    public static void mostrarMenuJugar() {
        mostrarMenu("======================  J U G A D O R  ======================",
                """   
                        1. Jugar una partida
                        2. Recargar créditos
                """);
    }

    public static void mostrarMenuGestionJugador() {
        mostrarMenu("=========  G E S T I Ó N   D E   J U G A D O R E S  =========",
                """
                           1. Registrar nuevo jugador
                           2. Editar jugador
                           3. Buscar un jugador
                           4. Listar jugadores
                           5. Jugador más activo
                        """);
    }

    public static void mostrarMenuGestionMaquina() {
        mostrarMenu("==========  G E S T I Ó N   D E   M A Q U I N A S  ==========",
                """
                           1. Registrar nueva maquina
                           2. Editar maquina
                           3. Listar maquinas
                           4. Listar máquinas activas
                           5. Maquina más usada
                           6. Top 3 puntuaciones
                        """);
    }

    public static void mostrarMenuEstadisticasRanking() {
        mostrarMenu("======================  R A N K I N G  ======================",
                """
                           1. Jugador más activo
                           2. Maquina más usada
                           3. Top 3 puntuaciones
                        """);
    }

    //------------------------------------------- EDITAR -------------------------------------------

    public static void menuEditarJugador() {
        mostrarMenu("================  E D I T A R  J U G A D O R  ===============",
                """
                           1. Cambiar Nombre
                           2. Recargar créditos
                        """);
    }

    public static void menuEditarMaquina() {
        mostrarMenu("================  E D I T A R  M A Q U I N A  ===============",
                """
                           1. Cambiar Nombre
                           2. Cambiar Genero
                           3. Cambiar Precio
                           4. Dar de baja una máquina
                           5. Mantenimiento / Reactivar máquina
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

    public static void elegirCredito() {
        System.out.println("""
                \n══════════════════════ ELEGIR CRÉDITO ══════════════════════""");
    }

    public static void elegirGenero() {
        System.out.println("""
                \n═══════════════════════ ELEGIR GENERO ═══════════════════════""");
    }

    public static void creditoCierre() {
        System.out.println("""
                ═════════════════════════════════════════════════════════════""");
    }

    public static void ranking(){
        System.out.print("""
                       \n┌─────────────────────────────────────────────┐
                       │          R A N K I N G   T O P  3           │
                       ├─────────────────────────────────────────────┤
                """);
    }

    public static void rankingCierre(){
        System.out.print("""
                       └─────────────────────────────────────────────┘
                """);
    }

    //------------------------------------------ ALERTAS ------------------------------------------
    public static void alerta(String t1, String  l1, String  l2) {
        System.out.printf("""
            \n=============================================================
            %-61s
            -------------------------------------------------------------
            %-61s
            %-61s
            =============================================================
            
            """, t1, l1, l2);
    }

    public static void noHayCredito() {
        alerta("             ⚠  NO TIENES CRÉDITOS SUFICIENTES  ⚠", "       Este jugador no dispone de créditos suficientes.", "                  Por favor, añade créditos.");
    }

    public static void noHayJugadores() {
        alerta("              ⚠  NO HAY JUGADORES REGISTRADOS  ⚠", "         Aún no existe ningún jugador en el sistema.", "                     Por favor, crea uno.");
    }

    public static void noHayMaquina() {
        alerta("              ⚠  NO HAY MAQUINAS REGISTRADOS  ⚠", "         Aún no existe ningúna maquina en el sistema.", "                     Por favor, crea uno.");
    }

    public static void building() {
        System.out.println("""
                \n=============================================================
                        BUILDING.
                =============================================================
                """);
    }

    //------------------------------------------ GAMEBOY ------------------------------------------

    public static void gameboy(String l1, String l2, String l3, String l4, String l5) {
        System.out.printf("""
        \n
                   ╔═════════════════════════════════════╗
                   ║   ▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁▁   ║
                   ║  │   ┌───────────────────────┐   │  ║
                   ║  │   │%-23.23s│   │  ║
                   ║  │   │%-23.23s│   │  ║
                   ║  │   │%-23.23s│   │  ║
                   ║  │   │%-23.23s│   │  ║
                   ║  │   │%-23.23s│   /  ║
                   ║  │   └───────────────────────┘  /   ║
                   ║  │▁▁▁ MAQUINA ARCADE ▁▁▁▁▁▁▁▁▁▁/    ║
                   ║                    ▁        ▁       ║
                   ║                  ( 1 )    ( 2 )     ║
                   ║                    ▔        ▔       ║
                   ╚═════════════════════════════════════╝
        """, l1, l2, l3, l4, l5);
    }

    public static void caraCruz() {
        gameboy("       CARA CRUZ", "", "   ► 1. CARA", "   ► 2. CRUZ", "");
    }

    public static void parImpar() {
        gameboy("       PAR o IMPAR", "", "   ► 1. PAR", "   ► 2. IMPAR", "");
    }

    public static void ganado() {
        gameboy("    *      ×      *", "       ×        *", "  ×  ! HAS GANADO ¡ *", "       *        ×", "    ×      *      ×");
    }

    public static void perdido() {
        gameboy("    ↓      ℓ      ↓", "       ℓ        ↓", "  ℓ  ! HAS PERDIDO ¡ ↓", "       ↓        ℓ", "    ℓ      ↓      ℓ");
        }

}

