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

    //creamos los atributos
    private Map<String, Estudiante> estudiantesMap;
    private TreeMap<String, Aula> aulaMap;
    private Map<String, Materia> materiaMap;

    private Stack<Object> pilaDeshacer;
    private Stack<Object> pilaRehacer;
    private Stack<Object> pilaReportes;

    private Queue<String[]> colaBatch;

    private Facultad[] facultades;

    private Campus campus;

    //creamos el constructor
    public ContEstructura(){

        this.estudiantesMap = new HashMap<>();
        this.aulaMap = new TreeMap<>();
        this.materiaMap= new HashMap<>();

        this.pilaDeshacer  = new Stack<>();
        this.pilaRehacer = new Stack<>();
        this.pilaReportes =  new Stack<>();

        this.colaBatch = new ArrayDeque<>();
        this.facultades = new Facultad[5];


        //vamos a inicializar las aulas
        aulaMap.put("001", new Aula("001", 35));
        aulaMap.put ("002", new Aula("002", 35));

        //vamos a inicializar las facultades
        facultades[0] = new Facultad("FSAL", "Facultad de la salud");
        facultades[1] = new Facultad("FIN", "Facultad de Ingenieria" );
        facultades[2] = new Facultad("FCE", "Facultad de ciencias Economicas");
        facultades[3] = new Facultad("FD", "Facultad de Derecho");
        facultades[4] = new Facultad("FE" ,"Facultad de Educación");


    }
    // crear el metodo estudiante
    public void registrarEstudiante(Estudiante estudiante){

        if(estudiante != null){

            String ID = String.valueOf(estudiante.getID());

            estudiantesMap.put(ID, estudiante);
        }
    }

    //metodo para buscar
    public Estudiante buscarEstudiante(String ID)

    throws Excepciones.EstudianteNoEncontradoException{

        Estudiante estudiante = estudiantesMap.get(ID);

        if(estudiante == null){
            throw new Excepciones.EstudianteNoEncontradoException("El estudiante no existe");

        }
        return estudiante;
    }
    // metodos para litar un estudiante
    public void listarEstudiante(){

        for(Estudiante estudiante :  estudiantesMap.values()){
            estudiante.mostrarInformacion();
            System.out.println("-----------------------");
        }
    }

    public Map<String, Estudiante> getEstudianteMap(){
        return estudiantesMap;
    }

    //creamos el metodo para registrar una materia
    public void registrarMateria(Materia materia){

        if(materia != null){
            materiaMap.put(materia.getCodigo(), materia);
        }
    }
    //ahora hacemos el metodo para buscar una materia
    public Materia buscMateria(String codigo){
        return materiaMap.get(codigo);
    }

    //ahora crearemos el metodo para listar materia
    public void listarMaterias(){

        for(Materia materia : materiaMap.values()){

            System.out.println("codigo"+ materia.getCodigo());
            System.out.println("Nombre:" + materia.getNomMateria());
            System.out.println("Creditos:"+ materia.getCreditos());
            System.out.println("Cupos:"+ materia.getCuposMaximos());

            System.out.println("-----------------");
        }
    }

    //metodo para eliminar una materia
    public void eliminarMateria(String codigo){
        materiaMap.remove(codigo);
    }

    //metodo para registrar un aula
    public void registrarAula(Aula aula){

        if(aula != null){
            aulaMap.put(aula.getNumAula(), aula);
        }
    }

    //ahora para buscar un aula
    public Aula buscarAula(String numAula){
        return aulaMap.get(numAula);
    }

    //metodo para consultar si hgay disponibilidad
    public boolean consultarDisponibilidad(String numAula, int dia, int hora){

        Aula aula = buscarAula(numAula);

        if(aula == null){
            System.out.println("Esta aula no existe");
            return false;
        }

        return aula.consultarDisponibilidad(dia, hora);
    }

    //ahora hacemos el metodo para reservar un horario
    public void reservarHorario(String numAula, int dia, int hora, int duracion)
    throws Excepciones.HorarioConflictivoException{

        Aula aula = buscarAula(numAula);

        if(aula == null){
            System.out.println("Esta aula no existe");
            return;
        }
        aula.reservar(dia, hora, duracion);
    }

    //ahora hacemos el metodo para liberar un horario
    public void liberarHorario(String numAula, int dia, int hora, int duracion){

        Aula aula =  buscarAula(numAula);

        if(aula == null){
            System.out.println("Esta aula no existe");
            return;
        }
        aula.liberar(dia, hora, duracion);
    }








}
