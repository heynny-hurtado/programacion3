import java.util.ArrayList;

public class DanceCls{

    private String estilo;
    //nos permite crear una variable que almacene varios objetos de tipo estudiante 
    private ArrayList<Estudiante>estudiantes;
    //creamos el limite de estudiantes de cada clase
    private final int cupoMaximo = 10;


    public DanceCls(String estilo){
        this.estilo = estilo; //para que guardemos los estilos 
        estudiantes = new ArrayList<>(); //este es el que nos permite crear una lista vacia para guardar los estudiantes inscritos
    }
    //creamos el get este devuelve el nombre del estilo de baile
    public String getEstilo(){
        return estilo;
    }
    //este de aquí devuelve la lista de estudiantes inscritos
    public ArrayList<Estudiante>gEstudiantes(){
        return estudiantes;
    }
    //metodo para inscribir
    //este metodo nos permite revisar si hay espacio dispobible
    public boolean inscribirEstudiante(Estudiante estudiante){
        if(estudiantes.size()<cupoMaximo){
            estudiantes.add(estudiante);//si hay menos de 10 e studiantes agrega con este metodo
            return true;
        }else{
            return false;
        }
    }
    //metodo para retirar un estudiante
    public boolean retirarEstudiante(int numero){
        for (int i = 0;i < estudiantes.size(); i++ ) { 
            if(estudiantes.get(i).getNumero()==numero){
                estudiantes.remove(i);
                return true;
            }
        }
        return false;
    }

}