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

    //los get de los mapas
    public Map<String, Estudiante> getEstudiantesMap(){
        return estudiantesMap;
    }

    public Map<String, Aula> getAulaMap(){
        return aulaMap;
    }

    public Facultad[] getFacultades(){
        return facultades;
    }
    public Campus getCampus(){
        return campus;
    }

    public void registrarEstudiante(Estudiante estudiante){

        if(estudiante != null){
            String ID = String.valueOf(estudiante.getID());
            estudiantesMap.put(ID, estudiante);
        }
    }
}

