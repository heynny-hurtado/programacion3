import java.util.Scanner;

public class MenuPrincipal{

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("===========CINEMASTAR===============");
            System.out.println("1. Crear peliculas"); 
            System.out.println("2. asignar funcions"); 
            System.out.println("3. Venter entradas"); 
            System.out.println("4. salir");  
            
            opcion= entrada.nextInt();


            switch(opcion){

                case 1:
                System.out.println();
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