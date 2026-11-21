package projectoFinal.herencia;
import java.util.LinkedList;
import java.util.List;
import projectoFinal.clases.Notas;
import projectoFinal.clases.Materia;


public class Estudiante extends Persona {

    //creammos los atributos
    private int semestreActual;
    private Notas notas;
    private List<Materia> listaNotas;

    //creamos el constructor
    public Estudiante(String nombre, String email, int ID, int semestreActual) {
        super(nombre, email, ID);

        this.semestreActual = semestreActual;
        this.notas = new Notas();
        this.listaNotas = new LinkedList<>();
    }

    //creamos los gets y los sets
    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }
    public Notas getNotas() {
        return notas;
    }
}