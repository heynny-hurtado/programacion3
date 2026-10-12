
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

        do {
            System.out.println("========MENU DE VIDEOJUEGOS========");
            System.out.println("1. Agregar un videojuego");
            System.out.println("2. Quitar un videojuego");
            System.out.println("3. Consultar el videojuego");
            System.out.println("4. Buscar un videojuego");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del videojuego: ");
                    juego = entrada.nextLine();
                    juegos.agregarJuego(juego);
                    break;

                case 2:
                    System.out.println(juegos.quitarJuego());
                    break;

                case 3:
                    System.out.println("El videojuego en la cima es: " + juegos.verJuegoCima());
                    juegos.mostrarJuegos();
                    System.out.println("Cantidad de videojuegos en la pila: " + juegos.cantidadVideoJuegos());
                    break;

                case 4:
                    System.out.print("Ingrese el videojuego que quieres buscar: ");
                    juego = entrada.nextLine();

                    if (juegos.buscarVideoJuego(juego)) {
                        System.out.println("El videojuego '" + juego + "' se encuentra en la pila.");
                    } else {
                        System.out.println("El videojuego '" + juego + "' no se encuentra en la pila.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

        } while (opcion != 5);

        entrada.close();
    }
}
