import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DanceCls {

    private String estilo;
    // nos permite crear una variable que almacene varios objetos de tipo estudiante
    private ArrayList<Estudiante> estudiantes;
    private Queue<Estudiante> espera;
    // creamos el limite de estudiantes de cada clase
    private final int cupoMaximo = 10;

    public DanceCls(String estilo) {
        this.estilo = estilo; // para que guardemos los estilos
        estudiantes = new ArrayList<>(); // este es el que nos permite crear una lista vacia para guardar los
                                         // estudiantes inscritos
        espera = new LinkedList<>();
    }

    // creamos el get este devuelve el nombre del estilo de baile
    public String getEstilo() {
        return estilo;
    }

    // este de aquí devuelve la lista de estudiantes inscritos
    public ArrayList<Estudiante> gEstudiantes() {
        return estudiantes;
    }

    // metodo para inscribir
    // este metodo nos permite revisar si hay espacio dispobible
    public boolean inscribirEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < cupoMaximo) {
            estudiantes.add(estudiante);
            return true;
        } else {
            espera.offer(estudiante);
            return false;
        }
    }

    // metodo para retirar un estudiante
    public boolean retirarEstudiante(int numero) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNumero() == numero) {
                estudiantes.remove(i);

                if (!espera.isEmpty()) {
                    estudiantes.add(espera.poll());
                }
                return true;
            }
        }
        return false;
    }

    // metodo para buscar un estudiante
    public Estudiante buscarEstudiante(int numero) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getNumero() == numero) {
                return estudiantes.get(i);
            }
        }
        return null;
    }

    // metodo para consultar un cupo disponible
    public int cuposDisponibles() {
        return cupoMaximo - estudiantes.size();
    }

    // metodo para mostarr los estudiantes
    public void mostrarEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    // metodo para mostar la cola de espera
    public void mostarEspera() {
        for (Estudiante estudiante : espera) {
            System.out.println(estudiante);
        }
    }

    // metodo para consultar la cantidad de estudiantes que estan en espera
    public int cantidadEnEspera() {
        return espera.size();
    }

}
