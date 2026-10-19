import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String []arggs){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();


        //ahora  vamos a crear los objetos de los tipos de danza que tiene la clase
        DanceCls hiphop = new DanceCls("hiphop");
        DanceCls afrodance = new DanceCls ("afrodance");
        DanceCls popping = new DanceCls("popping");
        DanceCls locking = new DanceCls ("locking");
        DanceCls breaking = new DanceCls("breaking");

    }

}