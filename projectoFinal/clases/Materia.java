package projectoFinal.clases;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import projectoFinal.herencia.Estudiante;

public class Materia {

    //creamos los atributos
    private String codigo;
    private String nomMateria;
    private int cuposMaximos;
    private int creditos;

    private LinkedList<Materia>preRequisitos;
    private LinkedList<Estudiante> estudiantesInscritos;
    private Queue<Estudiante> colaEspera;


    //creamos el constructor
    public Materia(String codigo, String nomMateria, int cuposMaximos, int creditos) {
        this.codigo = codigo;
        this.nomMateria = nomMateria;
        this.cuposMaximos = cuposMaximos;
        this.creditos = creditos;

        this.preRequisitos = new LinkedList<>();
        this.estudiantesInscritos = new LinkedList<>();
        this.colaEspera = new LinkedList<>();
    }

    //creamos los gets
    public String getCodigo() {
        return codigo;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public int getCuposMaximos() {
        return cuposMaximos;
    }
    public int getCreditos() {
        return creditos;
    }

    public LinkedList<Materia> getPreRequisitos() {
        return preRequisitos;
    }

    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public Queue<Estudiante> getColaEspera() {
        return colaEspera;
    }

    //metodo para agregar un pre requisito
    public void agregarPreRequisito(Materia materia) {
        
        if(materia!= null && materia != this
            && !preRequisitos.contains(materia)){

                preRequisitos.add(materia);
        }
    
    }
}
