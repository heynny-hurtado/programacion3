
package Pilas_colas.punto1;

import java.util.Scanner;

public class MainColas {
    public static void main(String[] args) {

        // sirve para crear un objeto de la clase Scanner y poder leer datos desde la
        // consola Scanner entrada = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        Colas cola = new Colas();

        int opcion;
        String sala;

        do {
            System.out.println("======MENU DE SALAS =======");
            System.out.println("1. Agregar sala");
            System.out.println("2. Quitar sala");
            System.out.println("3. Ver la primera sala");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre de la sala: ");
                    sala = entrada.nextLine();

                    cola.agregarSala(sala);
                    System.out.println("Sala agregada correctamente.");
                    break;

                case 2:
                    sala = cola.quitarSala();

                    if (sala != null) {
                        System.out.println("Sala quitada: " + sala);
                    } else {
                        System.out.println("No hay salas en la cola.");
                    }
                    break;

                case 3:
                    if (!cola.estaVacia()) {
                        System.out.println("La primera sala en la cola es: " + cola.verSala());
                    } else {
                        System.out.println("No hay salas en la cola.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida. Por favor ingrese una opcion.");
            }

        } while (opcion != 4);

        entrada.close(); // Cerrar el objeto Scanner al finalizar el programa
    }
}
