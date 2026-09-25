package Parcial1;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Crear un objetos Peliculas- pero ahora con arreglos
        Peliculas[] peliculas = new Peliculas[10];
        Funciones[][] funciones = new Funciones[3][3];
        int opcion;
        int cPeliculas = 0;

        // creamos el do while para que el menu se repita hasta que el usuario decida salir

        do {
            System.out.println("===========CINEMASTAR===============");
            System.out.println("1. Acceso al menu de creacion de  peliculas");
            System.out.println("2. Acesso al menu de funciones");
            System.out.println("3. Acceso al menu de entradas");
            System.out.println("4. salir");
            System.out.println("ingrese una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) { // creamos el switch para que el usuario pueda elegir la opcion que desee

                case 1: //lo hicimos primero de este modo para confirmar que funcionara
                    int opcionPeliculas;

                    do{

                        System.out.println("===========MENU DE PELICULAS===============");
                        System.out.println("1. Mostrar Peliculas");
                        System.out.println("2. Añadir peliculas");
                        System.out.println("3. Regresar");
                        System.out.println("Ingresa una opcion");

                        opcionPeliculas = entrada.nextInt();

                        switch (opcionPeliculas) {
                            case 1:
                                if(cPeliculas == 0){
                                System.out.println("No hay peliculas registradas");
                                }else{
                                    for(int i = 0; i<cPeliculas; i++){
                                        System.out.println("pelicula"+(i + 1));
                                        peliculas[i].mostrarDatos();
                                    }
                                }
                                break;
                            case 2:
                                break;
                            case 3:
                                break;

                            default:
                                break;
                        }

                    }while (opcionPeliculas !=3);
                    break;

                case 2:
                    System.out.println();
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    break;

                default:

            }

        } while (opcion != 4);
    }
}
//comenzamos a trabajar desde visual studio por problemas en github