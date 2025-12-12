package service;

import utils.Utils;
import static controller.Principal.*;

public class Menus {
    static GestorJugador gestor = new GestorJugador();
    public static void MenuPrincipal(){
        Mensajes.mostrarMenuPrincipal();
        boolean salir = true;

        do{
            switch(Utils.opcionesUser(0,4)){
                case 1:
                    MenuJugar();
                    break;
                case 2:
                    MenuGestionDeJugadores();
                    break;
                case 3:
                    //Gestión de máquinas
                    break;
                case 4:
                    //Estadísticas y Ranking
                    break;
                case 0:
                    System.out.println("█  Has Salido  █");
                    salir = false;
            }

        }while (salir);
    }

    public static void MenuJugar(){
        Mensajes.mostrarMenuJugar();
        boolean salir = true;

        do{
            switch(Utils.opcionesUser(0,2)){
                case 1:
                    if (jugadorListo()) elegirMaquina();
                    MenuJugar();
                    break;
                case 2:
                    comprobarJugadores();
                    recargaCreditosJugador();
                    gestor.mostrarJugadores();
                    break;
                case 0:
                    MenuPrincipal();
                    salir = false;
            }

        }while (salir);

    }

    public static void MenuGestionDeJugadores(){
        Mensajes.mostrarMenuGestionJugador();
        boolean salir = true;

        do{
            switch(Utils.opcionesUser(0,5)){
                case 1:
                    gestor.RegisterJugador();
                    MenuGestionDeJugadores();
                    break;
                case 2:
                    //Gestión de jugadores
                    Mensajes.menuEditarJugador();
                    break;
                case 3:
                    comprobarJugadores();
                    MenuGestionDeJugadores();
                    break;
                case 4:
                    gestor.mostrarJugadores();
                    MenuGestionDeJugadores();
                    break;
                case 5:

                    break;
                case 0:
                    MenuPrincipal();
                    salir = false;
            }

        }while (salir);
    }

    public static void elegirMaquina(){
        Mensajes.mostrarMenuGestionJugador();
        boolean salir = true;

        do{
            switch(Utils.opcionesUser(0,5)){
                case 1:
                    //
                    elegirMaquina();
                    break;
                case 2:
                    //Gestión de jugadores
                    break;
                case 3:


                    break;
                case 4:


                    break;
                case 5:
                    break;
                case 0:
                    MenuPrincipal();
                    salir = false;
            }

        }while (salir);
    }


}