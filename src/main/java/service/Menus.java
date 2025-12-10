package service;

import model.MaquinaArcade;
import model.SalaRecreativa;
import utils.Utils;
import service.GestorJugador;

public class Menus {

    public static void MenuPrincipal(){
        Mensajes.mostrarMenuPrincipal();
        boolean salir = true;

        do{
            switch(Utils.opcionesUser(0,4)){
                case 1:
                    MenuJugar();
                    break;
                case 2:
                    //Gestión de jugadores
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
                    if(GestorJugador.hayJugadores())
                    break;
                case 2:
                    //Recargar créditos
                    break;
                case 0:
                    MenuPrincipal();
                    salir = false;
            }

        }while (salir);

    }


}
