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
    private LinkedList<Estudiante> inscritos;
    private Queue<Estudiante> colaEspera;


    //creamos el constructor
    public Materia(String codigo, String nomMateria, int cuposMaximos, int creditos) {
        this.codigo = codigo;
        this.nomMateria = nomMateria;
        this.cuposMaximos = cuposMaximos;
        this.creditos = creditos;

        this.preRequisitos = new LinkedList<>();
        this.inscritos = new LinkedList<>();
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

    public List<Estudiante> getInscritos() {
        return inscritos;
    }

    public Queue<Estudiante> getColaEspera() {
        return colaEspera;
    }
    //sets
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }
    public void setCuposMaximos(int cuposMaximos) {
        this.cuposMaximos = cuposMaximos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }




    //metodo para agregar un pre requisito
    public void agregarPreRequisito(Materia materia) {

        if(materia!= null && materia != this
            && !preRequisitos.contains(materia)){

                preRequisitos.add(materia);
        }

    }
    //metodo para verificar si el estudiante cumple
    public boolean cumplePreRequisitos(Estudiante estudiante) {
        for (Materia materia : preRequisitos) {
            if (!estudiante.tieneMateriaAprobada(materia.preRequisitos())) {
                return false;
            }
        }
        return true;
    }
    //metodo para inscribir un estudiante
    public void inscribirEstudiante(Estudiante estudiante){

        if(estudiante == null){
            return;
        }
        if(!cumplePreRequisitos(estudiante)){
            return;
        }

        if(inscritos.size() < cuposMaximos){
            inscritos.add(estudiante);
    }else{
        colaEspera.add(estudiante);
    }
        }
    //metodo para cancelar
    public void cancelarInscripcion(Estudiante estudiante) {

        if(inscritos.remove(estudiante)){

            while(!colaEspera.isEmpty()){

                Estudiante siguiente = colaEspera.poll();

                if(cumplePreRequisitos(siguiente)){
                    inscritos.add(siguiente);
                    break;
            }
        }
    }

    }
}