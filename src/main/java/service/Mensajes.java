package service;

public class Mensajes {

    public static void mostrarMenu(){
        System.out.println("""
            =============================================================
                          ★  A R C A D E   M A N A G E R  ★
            =============================================================
            
               |  1 | Registrar nuevo jugador
               |  2 | Registrar nueva máquina arcade
               |  x | Recargar créditos a un jugador
               |  4 | Listar jugadores
               |  5 | Listar máquinas
               |  6 | Listar máquinas activas
               |  7 | Mantenimiento / Reactivar máquina
               |  x | Jugar una partida
               |  9 | Mostrar jugador más activo
               | 10 | Mostrar máquina más usada
               | 11 | Ranking de una máquina
               | 12 | Dar de baja una máquina
               | 13 | Editar máquina arcade
               | 14 | Editar jugador
          
            -------------------------------------------------------------
                             0.  █  S  A  L  I  R  █
            =============================================================
            """);
    }


    public static void mostrarMenuPrincipal(){
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

    public static void mostrarMenuJugar(){
        System.out.println("""
            ======================  J U G A D O R  ======================

               1. Jugar una partida
               2. Recargar créditos

            -------------------------------------------------------------
               0. Volver al menú principal
            =============================================================
            """);
    }

    public static void mostrarMenuGestionJugador(){
        System.out.println("""
            ====================  J U G A D O R E S  ====================

               1. Registrar nuevo jugador
               2. Recargar créditos
               3. Editar jugador
               4. Listar jugadores
               5. Jugador más activo

            -------------------------------------------------------------
               0. Volver al menú principal
            =============================================================
            """);
    }
//
//        String menuV2 = ("""
//            =================  M Á Q U I N A S   A R C A D E  =================
//
//               1. Registrar nueva máquina arcade
//               2. Listar máquinas
//               3. Listar máquinas activas
//               4. Mantenimiento / Reactivar
//               5. Dar de baja máquina
//               6. Editar máquina
//               7. Máquina más usada
//               8. Ranking de una máquina
//
//            -------------------------------------------------------------------
//               0. Volver al menú principal
//            ===================================================================
//            """);
//
//        String menuV2 = ("""
//            ===================  P A R T I D A S  ===================
//
//               1. Jugar una partida
//               2. Jugador más activo
//               3. Máquina más usada
//               4. Ranking de una máquina
//
//            ----------------------------------------------------------
//               0. Volver al menú principal
//            ==========================================================
//            """);
//

    }

