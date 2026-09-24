package Parcial1;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Crear un objetos Peliculas- pero ahora con arreglos
        Peliculas[] peliculas = new Peliculas[10];
        int opcion;
        int cpeliculas = 0;

        // creamos el do while para que el menu se repita hasta que el usuario decida salir

        do {
            System.out.println("===========CINEMASTAR===============");
            System.out.println("1. crear peliculas");
            System.out.println("2. asignar funcions");
            System.out.println("3. Venter entradas");
            System.out.println("4. salir");
            System.out.println("ingrese una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) { // creamos el switch para que el usuario pueda elegir la opcion que desee

                case 1: // cramos el caso uno para la creacion de las peliculas
                    int opPeliculas;

                    do{
                        System.out.println("===========MENU PELICULAS===============");
                        System.out.println("1. Crear pelicula");
                        System.out.println("2. Eliminar pelicula");
                        System.out.println("3. Editar pelicula");
                        System.out.println("4. Ver peliculas");
                        System.out.println("5. Salir");
                        System.out.println("Ingrese una opcion: ");
                        opPeliculas = entrada.nextInt();

                        switch (opPeliculas) {
                            case 1:
                                entrada.nextLine();

                                System.out.println("Ingrese el nombre de la película: ");
                                String nombre = entrada.nextLine();

                                break;
                            case 2:
                                // Lógica para eliminar película
                                break;
                            case 3:
                                // Lógica para editar película
                                break;
                            case 4:
                                // Lógica para ver películas
                                break;
                            case 5:
                                System.out.println("Saliendo del menú de películas...");
                                break;
                            default:
                                System.out.println("Opción inválida. Intente nuevamente.");
                        }
                    } while (opPeliculas != 5);
                    // menu para crear, eliminar, editar o ver  las peliculas disponibles


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