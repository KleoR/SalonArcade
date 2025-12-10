package service;

import utils.Utils;

public class Menus {

    public static void MenuPrincipal(){
        Mensajes.mostrarMenuPrincipal();
        boolean salir = true;

        do{
            switch(Utils.OpcionesUser(0,4)){
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
            switch(Utils.OpcionesUser(0,2)){
                case 1:
                    //Jugar una partida
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
