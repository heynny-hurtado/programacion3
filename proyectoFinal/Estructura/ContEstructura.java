package proyectoFinal.Estructura;

//vamos a hacer las importaciones
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

import proyectoFinal.Excepciones.Excepciones;
//importamos las clases y todo
import proyectoFinal.clases.Aula;
import proyectoFinal.clases.Campus;
import proyectoFinal.clases.Facultad;
import proyectoFinal.clases.Materia;
import proyectoFinal.herencia.Estudiante;

public class ContEstructura {

    // creamos los atributos
    private Map<String, Estudiante> estudiantesMap;
    private TreeMap<String, Aula> aulaMap;
    private Map<String, Materia> materiaMap;

    private Stack<Operacion> pilaDeshacer;
    private Stack<Operacion> pilaRehacer;

    private Stack<Object> pilaReportes;
    private Stack<Object> pilaAdelanteReportes;

    private Queue<String[]> colaBatch;

    private Facultad[] facultades;

    private Campus campus;

    // creamos el constructor
    public ContEstructura() {

        this.estudiantesMap = new HashMap<>();
        this.aulaMap = new TreeMap<>();
        this.materiaMap = new HashMap<>();

        this.pilaDeshacer = new Stack<>();
        this.pilaRehacer = new Stack<>();

        this.pilaReportes = new Stack<>();
        this.pilaAdelanteReportes = new Stack<>();

        this.colaBatch = new ArrayDeque<>();
        this.facultades = new Facultad[5];

        // vamos a inicializar las aulas
        aulaMap.put("001", new Aula("001", 35));
        aulaMap.put("002", new Aula("002", 35));

        // vamos a inicializar las facultades
        facultades[0] = new Facultad("FSAL", "Facultad de la salud");
        facultades[1] = new Facultad("FIN", "Facultad de Ingenieria");
        facultades[2] = new Facultad("FCE", "Facultad de ciencias Economicas");
        facultades[3] = new Facultad("FD", "Facultad de Derecho");
        facultades[4] = new Facultad("FE", "Facultad de Educación");


    // Inicializamos las materias
    inicializarMaterias();
    }


    private void inicializarMaterias() {

        // Creamos las materias
        Materia m1 = new Materia("MAT101", "Matematicas", 30, 3);
        Materia m2 = new Materia("PRO101", "Programacion I", 30, 4);
        Materia m3 = new Materia("PRO102", "Programacion II", 25, 4);
        Materia m4 = new Materia("BD101", "Bases de Datos", 25, 3);

        // Registramos las materias
        registrarMateria(m1);
        registrarMateria(m2);
        registrarMateria(m3);
        registrarMateria(m4);

        // Establecemos los prerrequisitos
        m3.agregarPreRequisito(m2);
        m4.agregarPreRequisito(m2);
    }

    // los get de los mapas
    public Map<String, Estudiante> getEstudiantesMap() {
        return estudiantesMap;
    }

    public Map<String, Aula> getAulaMap() {
        return aulaMap;
    }

    public Facultad[] getFacultades() {
        return facultades;
    }

    public Campus getCampus() {
        return campus;
    }

    public void registrarEstudiante(Estudiante estudiante) {

        if (estudiante != null) {
            String ID = String.valueOf(estudiante.getID());
            estudiantesMap.put(ID, estudiante);
        }
    }

    public Estudiante buscarEstudiante(String ID)
            throws Excepciones.EstudianteNoEncontradoException {

        Estudiante estudiante = estudiantesMap.get(ID);

        if (estudiante == null) {
            throw new Excepciones.EstudianteNoEncontradoException("El estidiante no existe");

        }
        return estudiante;
    }
    // creamos el listar estidoante

    public void listarEstudiantes() {

        for (Estudiante estudiante : estudiantesMap.values()) {
            estudiante.mostrarInformacion();
            System.out.println("-----------------");
        }
    }

    // creamos el eliminar estudiante
    public void eliminarEstudiante(String ID) {
        estudiantesMap.remove(ID);
    }

    // ahora hacemos el metodo para registar materia
    public void registrarMateria(Materia materia) {

        if (materia != null) {
            materiaMap.put(materia.getCodigo(), materia);
        }
    }
    // ahora creamos el metodo para buscar una materia

    public Materia buscarMateria(String codigo) {
        return materiaMap.get(codigo);
    }

    // metodo para listar una amteria
    public void listarMaterias() {

        for (Materia materia : materiaMap.values()) {

            System.out.println("Codigo:" + materia.getCodigo());
            System.out.println("Nombre:" + materia.getNomMateria());
            System.out.println("Creditos:" + materia.getCreditos());
            System.out.println("Cupos:" + materia.getCuposMaximos());

            System.out.println("--------------------");
        }
    }

    // creamos el eliminar materia
    public void eliminarMateria(String codigo) {
        materiaMap.remove(codigo);
    }

    // registrar aulas
    public void registrarAula(Aula aula) {

        if (aula != null) {
            aulaMap.put(aula.getNumAula(), aula);
        }
    }

    // metodo para buscar un aula
    public Aula buscarAula(String numAula) {
        return aulaMap.get(numAula);
    }

    // metodo para listar aula
    public void listarAula() {

        for (Aula aula : aulaMap.values()) {

            System.out.println("Numero de aula:" + aula.getNumAula());
            System.out.println("Capacidad:" + aula.getCapacidad());

            System.out.println("-----------------------");
        }
    }

    // metodo para eliminar el aula
    public void eliminarAula(String numAula) {
        aulaMap.remove(numAula);
    }

    // metodo para consultar
    public boolean consultarDisponibilidad(
            String numAula, int dia, int hora) {

        Aula aula = buscarAula(numAula);

        if (aula == null) {
            System.out.println("Esta aula no se encuentra");
            return false;
        }
        return aula.consultarDisponibilidad(dia, hora);
    }

    // creamos el reservar
    public void reservarHorario(
            String numAula, int dia, int hora, int duracion)
            throws Excepciones.HorarioConflictivoException {

        Aula aula = buscarAula(numAula);

        if (aula == null) {
            System.out.println("Esta aula no se encuentra");
            return;

        }
        aula.reservar(dia, hora, duracion);
    }

    // metodo para liberar un horario
    public void liberarHorario(
            String numAula, int dia, int hora, int duracion) {

        Aula aula = buscarAula(numAula);

        if (aula == null) {
            System.out.println("Esta aula no se encuentra");
            return;
        }

        aula.liberar(dia, hora, duracion);
    }

    // metodo para buscar una facultad
    public Facultad buscarFacultad(String codigo) {
        for (Facultad facultad : facultades) {

            if (facultad != null
                    && facultad.getCodigo().equals(codigo)) {
                return facultad;
            }
        }
        return null;
    }

    // metodo para listar una facultad
    public void listarFacultades() {

        for (Facultad facultad : facultades) {

            if (facultad != null) {

                System.out.println("Codigo:" + facultad.getCodigo());
                System.out.println("Nombre" + facultad.getNombre());
                System.out.println("------------------------");
            }
        }
    }

    // metodo para registrar un campus
    public void registrarCampus(String[] edificios) {

        if (campus != null) {
            throw new IllegalStateException("El campus ya fue registrado");
        }

        campus = new Campus(edificios);
    }

    // metodo para agregar una conexion
    public void agregarConexion(String origen, String destino, int distancia) {

        if (campus == null) {
            throw new IllegalStateException("Primero debe registrar el campus");
        }

        campus.agregarConexion(origen, destino, distancia);
    }

    // metodo para encontrar una ruta
    public void encontrarRuta(String origen, String destino) {
        if (campus == null) {
            System.out.println("Primero debes registrar el campus");
            return;
        }

        campus.encontrarRuta(origen, destino);
    }
    // metodo para Deshacer
    public void agregarOperacionDeshacer(Operacion operacion) {

        if (operacion != null) {
            pilaDeshacer.push(operacion);

        }
    }

    // metodo para obtener la operacion
    public Operacion obtenerOperacionDeshacer()
            throws Excepciones.PilaDeshacerVaciaException {

        if (pilaDeshacer.isEmpty()) {
            throw new Excepciones.PilaDeshacerVaciaException(
                    "no se encuentran operaciones para deshacer");
        }
        return pilaDeshacer.pop();
    }

    public boolean pilaDeshacerVacia() {
        return pilaDeshacer.isEmpty();
    }

    // metodo para pila rehacer
    public void agregarOperacionRehacer(Operacion operacion) {

        if (operacion != null) {
            pilaRehacer.push(operacion);
        }
    }

    public Operacion obtenerOperacionRehacer() {

        if (pilaRehacer.isEmpty()) {
            return null;
        }
        return pilaRehacer.pop();
    }

    public boolean pilaRehacerVacia() {
        return pilaRehacer.isEmpty();

    }

    public void limpiarPilaRehacer() {
        pilaRehacer.clear();

    }

    // creamos metodo reportes
    public void guardarReporte(Object reporte) {

        if (reporte != null) {
            pilaReportes.push(reporte);
            pilaAdelanteReportes.clear();
        }
    }

    public Object obtenerUltimoReporte() {

        if (pilaReportes.isEmpty()) {
            return null;
        }

        Object reporte = pilaReportes.pop();
        pilaAdelanteReportes.push(reporte);

        return reporte;
    }

    public Object obtenerReporteAdelante() {

        if (pilaAdelanteReportes.isEmpty()) {
            return null;
        }

        Object reporte = pilaAdelanteReportes.pop();
        pilaReportes.push(reporte);

        return reporte;
    }

    public void listarReportes() {

        if (pilaReportes.isEmpty()) {
            System.out.println("No hay reportes guardados");
            return;
        }

        for (Object reporte : pilaReportes) {
            System.out.println(reporte);
        }
    }

    public boolean reportesVacios() {
        return pilaReportes.isEmpty();
    }

    // metodo para el Batch
    public void agregarBatch(String[] datos) {

        if (datos != null) {
            colaBatch.offer(datos);
        }
    }

    public String[] procesarBatch() {
        return colaBatch.poll();
    }

    public boolean colaBatchVacia() {
        return colaBatch.isEmpty();
    }

    public int cantidadBatch() {
        return colaBatch.size();
    }

}
