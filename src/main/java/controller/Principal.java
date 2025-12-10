package controller;
import service.Mensajes;
import model.Jugador;
import utils.Utils;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mensajes.mostrarMenu();

        int opciones = Utils.leerEnterEnRango("Seleccione una opción: ", 0, 14);
        Menuselect(opciones);


    }

    public static void Menuselect(int opciones){
        boolean salir = true;
        do{
            switch(opciones){
                case 1:
                    //Registrar nuevo jugador

                    break;
                case 2:
                    //Registrar nueva máquina arcade
                    break;
                case 3:
                    //Recargar créditos a un jugador
                    break;
                case 4:
                    //Listar jugadores
                    break;
                case 5:
                    //Listar máquinas
                    break;
                case 6:
                    //Listar máquinas activas
                    break;
                case 7:
                    //Mantenimiento / Reactivar máquina
                    break;
                case 8:
                    //Jugar una partida
                    break;
                case 9:
                    //Mostrar jugador más activo
                case 10:
                    //Mostrar máquina más usada
                    break;
                case 11:
                    //Mostrar ranking de una máquina
                    break;
                case 12:
                    //Dar de baja una máquina
                    break;
                case 13:
                    //Editar máquina arcade
                    break;
                case 14:
                    //Editar jugador
                    break;
                case 0:
                    System.out.println("█  Has Salido  █");
                    salir = false;
            }

        }while (salir);



    }
}
