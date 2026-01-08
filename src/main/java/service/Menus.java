package service;

import utils.Mensajes;
import utils.Utils;

public class Menus {
    static GestorJugador gestor = new GestorJugador();
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
                    //
                    break;
                case 2:
                    //                    SalaRecreativa.comprobarJugadores();
                    //                    SalaRecreativa.recargaCreditosJugador();
                    //                    gestor.mostrarJugadores();
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
                    gestor.RegisterJugador();
                    break;
                case 2:
                    //Gestión de jugadores
                    Mensajes.menuEditarJugador();
                    break;
                case 3:
                    SalaRecreativa.comprobarJugadores();
                    break;
                case 4:
                    gestor.mostrarJugadores();
                    break;
                case 5:

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
            switch(Utils.opcionesUser(0,5)){
                case 1:
                    //Registrar maquina
                    break;
                case 2:
                    // Editar maquina
                    break;
                case 3:
                    // Escoger maquina
                    break;
                case 4:
                    // Listar máquinas
                    break;
                case 5:
                    // Listar máquinas activas
                    break;
                case 6:
                    // Maquina más usada
                    break;
                case 0:
                    salir = false;
                    break;
            }

        }while (salir);
    }

    public static void MenuEstadisticasRanking(){
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
                    System.out.println("█  Has Salido  █");
                    salir = false;
            }

        }while (salir);
    }

}