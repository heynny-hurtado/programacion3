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

                    break;
                case 2:

                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                default:
                    break;
            }
        } while (opcion != 10);
    }

}