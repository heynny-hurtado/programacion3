import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] arggs) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // ahora vamos a crear los objetos de los tipos de danza que tiene la clase
        DanceCls hiphop = new DanceCls("hiphop");
        DanceCls afrodance = new DanceCls("afrodance");
        DanceCls popping = new DanceCls("popping");
        DanceCls locking = new DanceCls("locking");
        DanceCls breaking = new DanceCls("breaking");

        // el de historial
        Historial historial = new Historial();

        int opcion;

        do {
            System.out.println("========DANCE STUDIO==========");
            System.out.println("1. Registrar estduiante");
            System.out.println("2. Inscribir estudiante");
            System.out.println("3. Retirar estudiante");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Mostar estudiante");
            System.out.println("6. Consultar cupos disponibles");
            System.out.println("7. Mostrar cola de espera");
            System.out.println("8. Mostrar historial");
            System.out.println("9. Deshacer ultima accion");
            System.out.println("10. Salir");

            System.out.println("Seleccione una opcion:");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Registrar estudiante");

                    break;
                case 2:
                System.out.println("Inscribir estudiante");
                    break;

                case 3:
                System.out.println("Retirar estudiante");
                    break;

                case 4:
                System.out.println("Buscar estudiante");
                    break;

                case 5:
                System.out.println("Mostrar estudiante");
                    break;

                case 6:
                System.out.println("Consultar cupos disponibles");
                    break;

                case 7:
                System.out.println("Mostrar cola de espera");
                    break;

                case 8:
                System.out.println("Mostrar historial");
                    break;

                case 9:
                System.out.println("Deshacer ultima accion");
                    break;

                case 10:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    break;
            }
        } while (opcion != 10);
    }

}