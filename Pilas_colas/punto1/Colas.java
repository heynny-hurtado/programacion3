package Pilas_colas.punto1;

import java.util.LinkedList;
import java.util.Queue; //este se importa para poder usar la clase Queue

public class Colas {

    // creamos una cola de tipo String
    private Queue<String> salasGamer;

    // hacemos el constructor de la clase
    public Colas() {
        salasGamer = new LinkedList<>();
    }

    
    //metodo add para agregar en este caso una sala a la cola
    public void agregarSala(String sala) {
        salasGamer.add(sala);
    }
}
