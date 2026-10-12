package Pilas_colas.punto1;

import java.util.Scanner;

//hacemos un main para probar que la pila funciona correctamente

public class MainPilas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        // creamos un objeto de la clase Pilas para llamar a los metodos de la clase
        Pilas juegos = new Pilas();

        int opcion;
        String juego;

        do{
            System.out.println("========PILA DE VIDEOJUEGOS========");
            System.out.println("1. Agregar un videojuego");
            System.out.println("2. Quitar un videojuego");
            System.out.println("3. consultar el videojuego ");
            System.out.println("4. Buscar un videojuego");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");


            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch(opcion){

                case 1:
                    System.out.print("Ingrese el nombre del videojuego: ");
                    juego = entrada.nextLine();
                    juegos.agregarJuego(juego);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                    default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }while(opcion != 5);

    }
}
