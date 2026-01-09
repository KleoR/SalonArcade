package controller;

import service.SalaRecreativa;
import utils.Mensajes;
import utils.Utils;

public class Menus {
    static SalaRecreativa salaRecreativa = new SalaRecreativa();

    public static void MenuPrincipal(){
           boolean salir = false;

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
                    salir = true;
            }

        }while (!salir);
    }

    public static void MenuJugar(){
           boolean salir = false;

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
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    public static void MenuGestionDeJugadores(){
           boolean salir = false;

        do{
            Mensajes.mostrarMenuGestionJugador();
            switch(Utils.opcionesUser(0,5)){
                case 1:
                    salaRecreativa.registerJugador();
                    break;
                case 2:
                    menuEditarJugador();
                    break;
                case 3:
                    salaRecreativa.buscarJugador();
                    break;
                case 4:
                    salaRecreativa.mostrarJugadores();
                    break;
                case 5:
                    salaRecreativa.jugadorMasActivo();
                    break;
                case 0:
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    public static void MenuGestionDeMaquinas(){
           boolean salir = false;

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
                    // Listar máquinas
                    salaRecreativa.mostrarMaquinas();
                    break;
                case 4:
                    // Listar máquinas activas
                    salaRecreativa.mostrarMaquinasActivas();
                    break;
                case 5:
                    // Maquina más usada
                    salaRecreativa.maquinaMasUsada();
                    break;
                case 6:
                    salaRecreativa.mostrarRankingPuntuacion();
                    break;
                case 0:
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    public static void MenuEstadisticasRanking(){
           boolean salir = false;

        do{
            Mensajes.mostrarMenuEstadisticasRanking();
            switch(Utils.opcionesUser(0,3)){
                case 1:
                    salaRecreativa.jugadorMasActivo();
                    break;
                case 2:
                    salaRecreativa.maquinaMasUsada();
                    break;
                case 3:
                    salaRecreativa.mostrarRankingPuntuacion();
                    break;
                case 0:
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    public static void menuEditarJugador(){
           boolean salir = false;

        do{
            Mensajes.menuEditarJugador();
            switch(Utils.opcionesUser(0,2)){
                case 1:
                    salaRecreativa.modificarNombreJugador();
                    break;
                case 2:
                    salaRecreativa.recargaCreditosJugador();
                    break;
                case 0:
                    salir = true;
                    break;
            }

        }while (!salir);
    }

    public static void menuEditarMaquina(){
           boolean salir = false;

        do{
            Mensajes.menuEditarMaquina();
            switch(Utils.opcionesUser(0,5)){
                case 1:
                    salaRecreativa.modificarNombreMaquina();
                    break;
                case 2:
                    // Cambiar Género
                    break;
                case 3:
                    // Cambiar Precio
                    break;
                case 4:
                    salaRecreativa.bajaMaquina();
                    break;
                case 5:
                    salaRecreativa.reactivarMaquina();
                    break;
                case 0:
                    salir = true;
                    break;
            }

        }while (!salir);
    }

}