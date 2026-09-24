package Parcial1;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Crear un objetos Peliculas
        Peliculas pelicula = new Peliculas();
        int opcion;

        // creamos el do while para que el menu se repita hasta que el usuario decida
        // salir

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
                    entrada.nextLine();
                    // hicimemos los printin g para que el usuario pueda ingresar los datos de la
                    // pelicula

                    System.out.print("Ingrese el nombre de la pelicula: ");
                    String nombre = entrada.nextLine();

                    System.out.print("Ingrese el idioma de la pelicula: ");
                    String idioma = entrada.nextLine();

                    System.out.print("Ingrese el tipo de la pelicula: ");
                    String tipo = entrada.nextLine();

                    System.out.print("Ingrese la duracion de la pelicula (en minutos): ");
                    int duracion = entrada.nextInt();

                    pelicula.setNombre(nombre);
                    pelicula.setIdioma(idioma);
                    pelicula.setTipo(tipo);
                    pelicula.setDuracion(duracion);
                    pelicula.mostrarDatos();

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