package proyectoFinal;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import proyectoFinal.Estructura.ContEstructura;
import proyectoFinal.Estructura.Operacion;
import proyectoFinal.clases.Materia;

import proyectoFinal.herencia.Estudiante;

import proyectoFinal.Excepciones.Excepciones;

public class FuncionesPrincipal {

    private ContEstructura contenedor;
    private Scanner entrada;

    public FuncionesPrincipal(Scanner entrada) {
        this.entrada = entrada;
        this.contenedor = new ContEstructura();
    }

    // metodo para leer texto
    private String leerTexto(String mensaje) {
        System.out.print(mensaje);
        String texto = entrada.nextLine();

        if (texto.isEmpty()) {
            texto = entrada.nextLine();
        }

        return texto;
    }

    // metodo para leer enteros
    private int leerEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(leerTexto(mensaje));
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero entero valido.");
            }
        }
    }

    // metodo para leer decimales
    private double leerDouble(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(
                    leerTexto(mensaje).replace(",", ".")
                );
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un numero valido.");
            }
        }
    }

    // metodo para registrar operaciones
    private void guardarOperacion(Operacion operacion) {
        contenedor.agregarOperacionDeshacer(operacion);
        contenedor.limpiarPilaRehacer();
    }

    // metodo principal para ejecutar las opciones
    public void ejecutarOperacion(int opcion) {

        switch (opcion) {

            case 1:
                registrarEstudiante();
                break;

            case 2:
                buscarEstudiante();
                break;

            case 3:
                contenedor.listarEstudiantes();
                break;

            case 4:
                eliminarEstudiante();
                break;

            case 5:
                crearMateria();
                break;

            case 6:
                agregarPreRequisito();
                break;

            case 7:
                mostrarPreRequisitos();
                break;

            case 8:
                inscribirEstudiante();
                break;

            case 9:
                cancelarInscripcion();
                break;

            case 10:
                mostrarColaEspera();
                break;

            case 11:
                reservarHorario();
                break;

            case 12:
                liberarHorario();
                break;

            case 13:
                consultarDisponibilidad();
                break;

            case 14:
                registrarCampus();
                break;

            case 15:
                calcularRuta();
                break;

            case 16:
                registrarNota();
                break;

            case 17:
                generarReporteAcademico();
                break;

            case 18:
                navegadorReportes();
                break;

            case 19:
                deshacerOperacion();
                break;

            case 20:
                rehacerOperacion();
                break;

            case 21:
                procesarArchivoCSV();
                break;

            default:
                System.out.println("Opcion no valida.");
        }
    }


    // GESTION DE ESTUDIANTES


    // opcion 1
    private void registrarEstudiante() {

        System.out.println("\n===== REGISTRAR ESTUDIANTE =====");

        String nombre = leerTexto("Nombre: ");
        String email = leerTexto("Email: ");
        int ID = leerEntero("ID: ");
        int semestre = leerEntero("Semestre actual: ");

        String clave = String.valueOf(ID);

        try {
            contenedor.buscarEstudiante(clave);
            System.out.println("Ya existe un estudiante con ese ID.");

        } catch (Excepciones.EstudianteNoEncontradoException e) {

            Estudiante estudiante = new Estudiante(
                nombre, email, ID, semestre
            );

            contenedor.registrarEstudiante(estudiante);

            guardarOperacion(new Operacion(
                "REGISTRAR_ESTUDIANTE",
                null,
                estudiante,
                clave
            ));

            System.out.println("Estudiante registrado correctamente.");
        }
    }

    // opcion 2
    private void buscarEstudiante() {

        System.out.println("\n===== BUSCAR ESTUDIANTE =====");

        String ID = leerTexto("Ingrese el ID: ");

        try {
            Estudiante estudiante = contenedor.buscarEstudiante(ID);
            estudiante.mostrarInformacion();

        } catch (Excepciones.EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    // opcion 4
    private void eliminarEstudiante() {

        System.out.println("\n===== ELIMINAR ESTUDIANTE =====");

        String ID = leerTexto("Ingrese el ID: ");

        try {
            Estudiante estudiante = contenedor.buscarEstudiante(ID);

            contenedor.eliminarEstudiante(ID);

            guardarOperacion(new Operacion(
                "ELIMINAR_ESTUDIANTE",
                estudiante,
                null,
                ID
            ));

            System.out.println("Estudiante eliminado correctamente.");

        } catch (Excepciones.EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }


    // GESTION DE MATERIAS


    // opcion 5
    private void crearMateria() {

        System.out.println("\n===== CREAR MATERIA =====");

        String codigo = leerTexto("Codigo: ");

        if (contenedor.buscarMateria(codigo) != null) {
            System.out.println("La materia ya existe.");
            return;
        }

        String nombre = leerTexto("Nombre de la materia: ");
        int cupos = leerEntero("Cupos maximos: ");
        int creditos = leerEntero("Creditos: ");

        if (cupos <= 0 || creditos <= 0) {
            System.out.println("Los cupos y creditos deben ser positivos.");
            return;
        }

        Materia materia = new Materia(
            codigo, nombre, cupos, creditos
        );

        contenedor.registrarMateria(materia);

        guardarOperacion(new Operacion(
            "REGISTRAR_MATERIA",
            null,
            materia,
            codigo
        ));

        System.out.println("Materia creada correctamente.");
    }

    // opcion 6
    private void agregarPreRequisito() {

        System.out.println("\n===== AGREGAR PRE-REQUISITO =====");

        System.out.println("\nMaterias registradas:");
        contenedor.listarMaterias();

        String codigo = leerTexto("Codigo de la materia: ");
        Materia materia = contenedor.buscarMateria(codigo);

        if (materia == null) {
            System.out.println("La materia no existe.");
            return;
        }

        String codigoPre = leerTexto("Codigo del pre-requisito: ");
        Materia pre = contenedor.buscarMateria(codigoPre);

        if (pre == null) {
            System.out.println("El pre-requisito no existe.");
            return;
        }

        if (materia == pre ||
                materia.getPreRequisitos().contains(pre)) {

            System.out.println("El pre-requisito ya existe o no es valido.");
            return;
        }

        materia.agregarPreRequisito(pre);

        System.out.println("Pre-requisito agregado correctamente.");
    }

    // opcion 7
    private void mostrarPreRequisitos() {

        System.out.println("\n===== MOSTRAR PRE-REQUISITOS =====");

        String codigo = leerTexto("Codigo de la materia: ");

        Materia materia = contenedor.buscarMateria(codigo);

        if (materia == null) {
            System.out.println("La materia no existe.");
            return;
        }

        System.out.println("Materia: " + materia.getNomMateria());

        if (materia.getPreRequisitos().isEmpty()) {
            System.out.println("Esta materia no tiene pre-requisitos.");
            return;
        }

        for (Materia pre : materia.getPreRequisitos()) {

            System.out.println(
                pre.getCodigo() + " - " + pre.getNomMateria()
            );
        }
    }

    // opcion 8
    private void inscribirEstudiante() {

        System.out.println("\n===== INSCRIBIR ESTUDIANTE =====");

        String ID = leerTexto("ID del estudiante: ");

        try {
            Estudiante estudiante = contenedor.buscarEstudiante(ID);

            String codigo = leerTexto("Codigo de la materia: ");

            Materia materia = contenedor.buscarMateria(codigo);

            if (materia == null) {
                System.out.println("La materia no existe.");
                return;
            }

            if (!materia.cumplePreRequisitos(estudiante)) {
                System.out.println(
                    "El estudiante no cumple los pre-requisitos."
                );
                return;
            }

            if (materia.getInscritos().contains(estudiante) ||
                materia.getColaEspera().contains(estudiante)) {

                System.out.println(
                    "El estudiante ya esta inscrito o en espera."
                );
                return;
            }

            materia.inscribirEstudiante(estudiante);

            if (materia.getInscritos().contains(estudiante)) {

                System.out.println("Inscripcion realizada correctamente.");

            } else {
                System.out.println(
                    "No hay cupos disponibles. "
                    + "El estudiante fue agregado a la cola de espera."
                );
            }

        } catch (Excepciones.EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    // opcion 9
    private void cancelarInscripcion() {

        System.out.println("\n===== CANCELAR INSCRIPCION =====");

        String ID = leerTexto("ID del estudiante: ");
        String codigo = leerTexto("Codigo de la materia: ");

        try {
            Estudiante estudiante = contenedor.buscarEstudiante(ID);

            Materia materia = contenedor.buscarMateria(codigo);

            if (materia == null) {
                System.out.println("La materia no existe.");
                return;
            }

            if (materia.getColaEspera().contains(estudiante)) {

                materia.getColaEspera().remove(estudiante);

                System.out.println(
                    "Estudiante eliminado de la cola de espera."
                );

            } else if (materia.getInscritos().contains(estudiante)) {

                materia.cancelarInscripcion(estudiante);

                System.out.println(
                    "Inscripcion cancelada correctamente."
                );

            } else {
                System.out.println(
                    "El estudiante no esta inscrito en esta materia."
                );
            }

        } catch (Excepciones.EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    // opcion 10
    private void mostrarColaEspera() {

        System.out.println("\n===== COLA DE ESPERA =====");

        String codigo = leerTexto("Codigo de la materia: ");

        Materia materia = contenedor.buscarMateria(codigo);

        if (materia == null) {
            System.out.println("La materia no existe.");
            return;
        }

        if (materia.getColaEspera().isEmpty()) {
            System.out.println("No hay estudiantes en espera.");
            return;
        }

        for (Estudiante estudiante : materia.getColaEspera()) {

            System.out.println(
                "ID: " + estudiante.getID()
                + " - Nombre: " + estudiante.getNombre()
            );
        }
    }

    // ==========================================
    // GESTION DE HORARIOS
    // ==========================================

    // opcion 11
    private void reservarHorario() {

        System.out.println("\n===== RESERVAR HORARIO =====");

        contenedor.listarAula();

        String numAula = leerTexto("Numero de aula: ");

        int dia = leerEntero(
            "Dia (0=Lunes, 1=Martes, 2=Miercoles, "
            + "3=Jueves, 4=Viernes, 5=Sabado, 6=Domingo): "
        );

        int hora = leerEntero("Hora inicial (0-23): ");
        int duracion = leerEntero("Duracion en horas: ");

        try {
            contenedor.reservarHorario(
                numAula, dia, hora, duracion
            );

            System.out.println("Horario reservado correctamente.");

        } catch (Excepciones.HorarioConflictivoException e) {
            System.out.println(e.getMessage());
        }
    }

    // opcion 12
    private void liberarHorario() {

        System.out.println("\n===== LIBERAR HORARIO =====");

        String numAula = leerTexto("Numero de aula: ");

        int dia = leerEntero("Dia (0-6): ");
        int hora = leerEntero("Hora inicial (0-23): ");
        int duracion = leerEntero("Duracion en horas: ");

        if (contenedor.buscarAula(numAula) == null) {
            System.out.println("El aula no existe.");
            return;
        }

        contenedor.liberarHorario(
            numAula, dia, hora, duracion
        );

        System.out.println("Horario liberado.");
    }

    // opcion 13
    private void consultarDisponibilidad() {

        System.out.println("\n===== CONSULTAR DISPONIBILIDAD =====");

        String numAula = leerTexto("Numero de aula: ");

        int dia = leerEntero("Dia (0-6): ");
        int hora = leerEntero("Hora (0-23): ");

        boolean disponible = contenedor.consultarDisponibilidad(
            numAula, dia, hora
        );

        if (contenedor.buscarAula(numAula) != null) {

            if (disponible) {
                System.out.println("El aula esta disponible.");
            } else {
                System.out.println("El aula esta ocupada.");
            }
        }
    }

    // ==========================================
    // RUTAS ENTRE EDIFICIOS
    // ==========================================

    
    // opcion 14
    private void registrarCampus() {

        System.out.println("\n===== REGISTRAR CONEXIONES DEL CAMPUS =====");

        // Si el campus todavía no existe, registramos los edificios
        if (contenedor.getCampus() == null) {

            System.out.println("Primero debemos registrar los edificios.");

            String[] edificios = new String[5];

            for (int i = 0; i < edificios.length; i++) {
                edificios[i] = leerTexto(
                        "Nombre del edificio " + (i + 1) + ": "
                );
            }

            try {
                contenedor.registrarCampus(edificios);
                System.out.println("Campus registrado correctamente.");

            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        // Agregamos una conexion
        String origen = leerTexto("Edificio de origen: ");
        String destino = leerTexto("Edificio de destino: ");
        int distancia = leerEntero("Distancia en metros: ");

        try {
            contenedor.agregarConexion(origen, destino, distancia);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    // opcion 15
    private void calcularRuta() {

        System.out.println("\n===== CALCULAR RUTA MAS CORTA =====");

        String origen = leerTexto("Edificio de origen: ");
        String destino = leerTexto("Edificio de destino: ");

        contenedor.encontrarRuta(origen, destino);
    }
    // REPORTES ACADEMICOS

    // opcion 16

    private void registrarNota() {

        System.out.println("\n===== REGISTRAR NOTA =====");

        String ID = leerTexto("ID del estudiante: ");

        try {
            Estudiante estudiante = contenedor.buscarEstudiante(ID);

            int semestre = leerEntero("Numero de semestre (1-10): ");

            int indice = leerEntero(
                "Indice de la materia (0-19): "
            );

            double nota = leerDouble("Nota (0.0 - 5.0): ");

            estudiante.registrarNota(semestre, indice, nota);

            System.out.println("Nota registrada correctamente.");

        } catch (Excepciones.EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }



    // opcion 17
    private void generarReporteAcademico() {

        System.out.println("\n===== REPORTE ACADEMICO =====");

        String ID = leerTexto("ID del estudiante: ");

        try {
            Estudiante estudiante = contenedor.buscarEstudiante(ID);

            StringBuilder reporte = new StringBuilder();

            reporte.append("\n===== REPORTE ACADEMICO =====\n");
            reporte.append("Nombre: ").append(estudiante.getNombre()).append("\n");
            reporte.append("ID: ").append(estudiante.getID()).append("\n");
            reporte.append("Email: ").append(estudiante.getEmail()).append("\n");
            reporte.append("Semestre actual: ")
                .append(estudiante.getSemestreActual()).append("\n");

            reporte.append("\nPromedio acumulado: ")
                .append(String.format(
                    "%.2f", estudiante.calcularPromedioAcumulado()
                )).append("\n");

            Double[][] notas = estudiante.getNotas().getNotas();

            reporte.append("\n===== NOTAS POR SEMESTRE =====\n");

            for (int i = 0; i < notas.length; i++) {

                boolean hayNotas = false;

                for (int j = 0; j < notas[i].length; j++) {

                    if (notas[i][j] != null) {

                        if (!hayNotas) {
                            reporte.append("\nSemestre ").append(i + 1).append(":\n");
                            hayNotas = true;
                        }

                        reporte.append("Materia ")
                            .append(j + 1)
                            .append(": ")
                            .append(notas[i][j])
                            .append("\n");
                    }
                }

                if (hayNotas) {
                    reporte.append("Promedio: ")
                        .append(String.format(
                            "%.2f",
                            estudiante.calcularPromedioSemestre(i + 1)
                        )).append("\n");
                }
            }

            System.out.println(reporte);

            System.out.println("\n===== MATERIAS REPROBADAS =====");
            estudiante.getNotas().generarReporteReprobadas();

            contenedor.guardarReporte(reporte.toString());

        } catch (Excepciones.EstudianteNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }


    // opcion 18
    private void navegadorReportes() {

        int opcion;

        do {

            System.out.println("\n===== NAVEGADOR DE REPORTES =====");
            System.out.println("1. Ver reporte anterior");
            System.out.println("2. Ver reporte siguiente");
            System.out.println("3. Listar reportes");
            System.out.println("4. Regresar");

            opcion = leerEntero("Seleccione una opcion: ");

            switch (opcion) {

                case 1:

                    Object anterior = contenedor.obtenerUltimoReporte();

                    if (anterior == null) {
                        System.out.println("No hay reportes anteriores.");
                    } else {
                        System.out.println(anterior);
                    }

                    break;

                case 2:

                    Object siguiente = contenedor.obtenerReporteAdelante();

                    if (siguiente == null) {
                        System.out.println("No hay reportes siguientes.");
                    } else {
                        System.out.println(siguiente);
                    }

                    break;

                case 3:
                    contenedor.listarReportes();
                    break;

                case 4:
                    System.out.println("Regresando al menu principal.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);
    }

    // ==========================================
    // DESHACER Y REHACER
    // ==========================================

    // opcion 19
    private void deshacerOperacion() {

        System.out.println("\n===== DESHACER OPERACION =====");

        try {

            Operacion operacion = contenedor.obtenerOperacionDeshacer();

            operacion.deshacer(contenedor);

            contenedor.agregarOperacionRehacer(operacion);

            System.out.println("Operacion deshecha correctamente.");

        } catch (Excepciones.PilaDeshacerVaciaException e) {

            System.out.println(e.getMessage());
        }
    }

    // opcion 20
    private void rehacerOperacion() {

        System.out.println("\n===== REHACER OPERACION =====");

        Operacion operacion = contenedor.obtenerOperacionRehacer();

        if (operacion == null) {
            System.out.println("No hay operaciones para rehacer.");
            return;
        }

        operacion.rehacer(contenedor);

        contenedor.agregarOperacionDeshacer(operacion);

        System.out.println("Operacion rehecha correctamente.");
    }

    // ==========================================
    // PROCESAMIENTO POR LOTES CSV
    // ==========================================

    // opcion 21
    private void procesarArchivoCSV() {

        System.out.println("\n===== PROCESAR ARCHIVO CSV =====");

        String ruta = leerTexto("Ingrese la ruta del archivo CSV: ");

        try {

            BufferedReader lector = new BufferedReader(
                new FileReader(ruta)
            );

            String linea;
            int contador = 0;

            while ((linea = lector.readLine()) != null) {

                if (linea.trim().isEmpty()) {
                    continue;
                }

                String[] datos = linea.split(",", -1);

                // Se omite una posible cabecera
                if (contador == 0 &&
                    datos[0].trim().equalsIgnoreCase("nombre")) {
                    continue;
                }

                if (datos.length != 4) {
                    lector.close();

                    throw new Excepciones.ArchivoInvalidoException(
                        "El archivo debe tener 4 columnas: "
                        + "nombre,email,ID,semestre."
                    );
                }

                contenedor.agregarBatch(datos);
                contador++;
            }

            lector.close();

            if (contador == 0) {
                throw new Excepciones.ArchivoInvalidoException(
                    "El archivo no contiene registros."
                );
            }

            int procesados = 0;

            while (!contenedor.colaBatchVacia()) {

                String[] datos = contenedor.procesarBatch();

                try {

                    String nombre = datos[0].trim();
                    String email = datos[1].trim();
                    int ID = Integer.parseInt(datos[2].trim());
                    int semestre = Integer.parseInt(datos[3].trim());

                    if (nombre.isEmpty() || email.isEmpty() ||
                        semestre < 1 || semestre > 10) {

                        System.out.println(
                            "Registro invalido: " + datos[0]
                        );
                        continue;
                    }

                    String clave = String.valueOf(ID);

                    try {
                        contenedor.buscarEstudiante(clave);

                        System.out.println(
                            "El estudiante con ID " + ID + " ya existe."
                        );

                    } catch (
                        Excepciones.EstudianteNoEncontradoException e
                    ) {

                        Estudiante estudiante = new Estudiante(
                            nombre, email, ID, semestre
                        );

                        contenedor.registrarEstudiante(estudiante);

                        guardarOperacion(new Operacion(
                            "REGISTRAR_ESTUDIANTE",
                            null,
                            estudiante,
                            clave
                        ));

                        procesados++;
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                        "Registro con datos numericos incorrectos."
                    );
                }
            }

            System.out.println(
                "\nRegistros procesados correctamente: " + procesados
            );

        } catch (IOException e) {

            System.out.println(
                "No se pudo leer el archivo: " + e.getMessage()
            );

        } catch (Excepciones.ArchivoInvalidoException e) {

            System.out.println(e.getMessage());
        }
    }
}

