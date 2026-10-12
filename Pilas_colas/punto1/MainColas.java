package Pilas_colas.punto1;

import java.util.Scanner;


public class MainColas {
    public static void main(String[]args){

        //sirve para crear un objeto de la clase Scanner y poder leer datos desde la consola            Scanner entrada = new Scanner(System.in);
        Colas cola = new Colas();
    
        int opcion;
        String sala;

        do{
            System.out.println("======MENU DE SALAS =======");
            System.out.println("1. Agregar sala");
            System.out.println("2. Quitar sala");
            System.out.println("3. Ver la primera sala");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el buffer de entrada
        
            
        
        } while(opcion != 4);
    }
}
