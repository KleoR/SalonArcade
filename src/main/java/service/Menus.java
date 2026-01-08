package service;

import utils.Mensajes;
import utils.Utils;

public class Menus {
    static SalaRecreativa salaRecreativa = new SalaRecreativa();

    public static void MenuPrincipal(){
        boolean salir = true;

        do{
            Mensajes.mostrarMenuPrincipal();
            switch(Utils.opcionesUser(0,4)){
                case 1:
                    MenuJugar();
                    break;
                case 2:
                    MenuGestionDeJugadores();
                    break;
                case 3:
                    MenuGestionDeMaquinas();
                    break;
                case 4:
                    MenuEstadisticasRanking();
                    break;
                case 0:
                    System.out.println("█  Has Salido  █");
                    salir = false;
            }

        }while (salir);
    }

    public static void MenuJugar(){
        boolean salir = true;

        do{
            Mensajes.mostrarMenuJugar();
            switch(Utils.opcionesUser(0,2)){
                case 1:
                    salaRecreativa.Juego();
                    break;
                case 2:
                    salaRecreativa.recargaCreditosJugador();
                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

    public static void MenuGestionDeJugadores(){
        boolean salir = true;

        do{
            Mensajes.mostrarMenuGestionJugador();
            switch(Utils.opcionesUser(0,5)){
                case 1:
                    salaRecreativa.RegisterJugador();
                    break;
                case 2:
                    menuEditarJugador();
                    break;
                case 3:
                    salaRecreativa.comprobarJugadores();
                    break;
                case 4:
                    salaRecreativa.mostrarJugadores();
                    break;
                case 5:
                    // TODO - Jugador más activo
                    salaRecreativa.jugadorMasActivo();
                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

    public static void MenuGestionDeMaquinas(){
        boolean salir = true;

        do{
            Mensajes.mostrarMenuGestionMaquina();
            switch(Utils.opcionesUser(0,6)){
                case 1:
                    salaRecreativa.registrarMaquina();
                    break;
                case 2:
                    menuEditarMaquina();
                    break;
                case 3:
                    // Escoger maquina
                    salaRecreativa.elegirMaquina();
                    break;
                case 4:
                    // Listar máquinas
                    salaRecreativa.mostrarMaquinas();
                    break;
                case 5:
                    // Listar máquinas activas
                    salaRecreativa.mostrarMaquinasActivas();
                    break;
                case 6:
                    // Maquina más usada
                    salaRecreativa.maquinaMasUsada();
                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

    public static void MenuEstadisticasRanking(){  // TODO
        boolean salir = true;

        do{
            Mensajes.mostrarMenuEstadisticasRanking();
            switch(Utils.opcionesUser(0,4)){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

    public static void menuEditarJugador(){
        boolean salir = true;

        do{
            Mensajes.menuEditarJugador();
            switch(Utils.opcionesUser(0,2)){
                case 1:
                    // TODO -  Cambiar nombre
                    break;
                case 2:
                    salaRecreativa.recargaCreditosJugador();
                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

    public static void menuEditarMaquina(){
        boolean salir = true;

        do{
            Mensajes.menuEditarMaquina();
            switch(Utils.opcionesUser(0,3)){
                case 1:
                    // TODO - Cambiar nombre
                    break;
                case 2:
                    //  TODO - Dar de baja una máquina
                    salaRecreativa.bajaMaquina();
                    break;
                case 3:
                    //  TODO - Mantenimiento / Reactivar máquina
                    salaRecreativa.reactivarMaquina();
                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

}