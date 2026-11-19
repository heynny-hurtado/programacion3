package projectoFinal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        int opcionEstudiante, opcionMateria, opcionHorario;
        int opcionEdificio, opcionReporte, opcionDeshacer;
        int opcionBatch;

        do {

            System.out.println("\n======================================");
            System.out.println("       PLANIFICACION ACADEMICA");
            System.out.println("          SISTEMA UNIVERSITARIO");
            System.out.println("======================================");

            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Gestion de estudiantes");
            System.out.println("2. Gestion de materias");
            System.out.println("3. Gestion de horarios");
            System.out.println("4. Rutas entre edificios");
            System.out.println("5. Reportes academicos");
            System.out.println("6. Sistema deshacer/rehacer");
            System.out.println("7. Procesamiento por lotes");
            System.out.println("8. Salir");

            System.out.print("\nSeleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                // GESTION DE ESTUDIANTES
                case 1:

                    do {

                        System.out.println("\n=== GESTION DE ESTUDIANTES ===");
                        System.out.println("1. Registrar estudiante");
                        System.out.println("2. Buscar estudiante por ID");
                        System.out.println("3. Listar todos los estudiantes");
                        System.out.println("4. Eliminar estudiante");
                        System.out.println("5. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionEstudiante = entrada.nextInt();

                        switch (opcionEstudiante) {

                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

                            case 5:
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionEstudiante != 5);

                    break;

                // GESTION DE MATERIAS
                case 2:

                    do {

                        System.out.println("\n=== GESTION DE MATERIAS ===");
                        System.out.println("1. Crear materia");
                        System.out.println("2. Agregar pre-requisito");
                        System.out.println("3. Mostrar pre-requisitos");
                        System.out.println("4. Inscribir estudiante");
                        System.out.println("5. Cancelar inscripcion");
                        System.out.println("6. Mostrar cola de espera");
                        System.out.println("7. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionMateria = entrada.nextInt();

                        switch (opcionMateria) {

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
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionMateria != 7);

                    break;

                // GESTION DE HORARIOS
                case 3:

                    do {

                        System.out.println("\n=== GESTION DE HORARIOS ===");
                        System.out.println("1. Reservar horario en aula");
                        System.out.println("2. Liberar horario");
                        System.out.println("3. Consultar disponibilidad");
                        System.out.println("4. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionHorario = entrada.nextInt();

                        switch (opcionHorario) {

                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionHorario != 4);

                    break;

                // RUTAS ENTRE EDIFICIOS
                case 4:

                    do {

                        System.out.println("\n=== RUTAS ENTRE EDIFICIOS ===");
                        System.out.println("1. Agregar conexion entre edificios");
                        System.out.println("2. Calcular ruta mas corta");
                        System.out.println("3. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionEdificio = entrada.nextInt();

                        switch (opcionEdificio) {

                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionEdificio != 3);

                    break;

                // REPORTES ACADEMICOS
                case 5:

                    do {

                        System.out.println("\n=== REPORTES ACADEMICOS ===");
                        System.out.println("1. Registrar nota");
                        System.out.println("2. Ver reporte academico");
                        System.out.println("3. Navegador de reportes (atras/adelante)");
                        System.out.println("4. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionReporte = entrada.nextInt();

                        switch (opcionReporte) {

                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionReporte != 4);

                    break;

                // SISTEMA DESHACER Y REHACER
                case 6:

                    do {

                        System.out.println("\n=== SISTEMA DESHACER/REHACER ===");
                        System.out.println("1. Deshacer ultima operacion");
                        System.out.println("2. Rehacer ultima operacion");
                        System.out.println("3. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionDeshacer = entrada.nextInt();

                        switch (opcionDeshacer) {

                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionDeshacer != 3);

                    break;

                // PROCESAMIENTO POR LOTES
                case 7:

                    do {

                        System.out.println("\n=== PROCESAMIENTO POR LOTES ===");
                        System.out.println("1. Procesar archivo CSV");
                        System.out.println("2. Volver al menu principal");

                        System.out.print("\nSeleccione una opcion: ");
                        opcionBatch = entrada.nextInt();

                        switch (opcionBatch) {

                            case 1:
                                break;

                            case 2:
                                System.out.println("Regresando al menu principal...");
                                break;

                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }

                    } while (opcionBatch != 2);

                    break;

                // SALIR
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 8);

        entrada.close();
    }
}

