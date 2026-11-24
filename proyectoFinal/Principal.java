
package proyectoFinal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        FuncionesPrincipal funciones = new FuncionesPrincipal(entrada);

        int opcion = 0;

        do {

            System.out.println("\n============================================================");
            System.out.println("       PLANIFICACION ACADEMICA - SISTEMA UNIVERSITARIO");
            System.out.println("============================================================");

            System.out.println("\n=== GESTION DE ESTUDIANTES ===");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante por ID");
            System.out.println("3. Listar todos los estudiantes");
            System.out.println("4. Eliminar estudiante");

            System.out.println("\n=== GESTION DE MATERIAS ===");
            System.out.println("5. Crear materia");
            System.out.println("6. Agregar pre-requisito");
            System.out.println("7. Mostrar pre-requisitos");
            System.out.println("8. Inscribir estudiante");
            System.out.println("9. Cancelar inscripcion");
            System.out.println("10. Mostrar cola de espera");

            System.out.println("\n=== GESTION DE HORARIOS ===");
            System.out.println("11. Reservar horario en aula");
            System.out.println("12. Liberar horario");
            System.out.println("13. Consultar disponibilidad");

            System.out.println("\n=== RUTAS ENTRE EDIFICIOS ===");
            System.out.println("14. Agregar conexion entre edificios");
            System.out.println("15. Calcular ruta mas corta");

            System.out.println("\n=== REPORTES ACADEMICOS ===");
            System.out.println("16. Registrar nota");
            System.out.println("17. Ver reporte academico");
            System.out.println("18. Navegador de reportes (atras/adelante)");

            System.out.println("\n=== SISTEMA DESHACER/REHACER ===");
            System.out.println("19. Deshacer ultima operacion");
            System.out.println("20. Rehacer ultima operacion");

            System.out.println("\n=== PROCESAMIENTO POR LOTES ===");
            System.out.println("21. Procesar archivo CSV");

            System.out.println("\n=== SALIR ===");
            System.out.println("22. Salir");

            System.out.print("\nSeleccione una opcion: ");

            String dato = entrada.nextLine();

            try {

                opcion = Integer.parseInt(dato);

                if (opcion >= 1 && opcion <= 21) {

                    funciones.ejecutarOperacion(opcion);

                } else if (opcion == 22) {

                    System.out.println("Gracias por utilizar el sistema.");

                } else {

                    System.out.println("Opcion no valida. Intente nuevamente.");
                }

            } catch (NumberFormatException e) {

                opcion = 0;
                System.out.println("Debe ingresar un numero valido.");

            }

        } while (opcion != 22);

        entrada.close();
    }
}
