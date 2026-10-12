
package Pilas_colas.punto1;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {

    // Creamos una cola para guardar las salas
    private Queue<String> salas;

    // Hacemos el constructor
    public Colas() {
        salas = new LinkedList<>();
    }

    // El metodo add sirve para agregar una sala a la cola
    public boolean agregarSala(String sala) {
        return salas.add(sala);
    }

    // El metodo poll sirve para quitar la primera sala de la cola
    public String quitarSala() {
        return salas.poll();
    }

    // El metodo element sirve para ver la primera sala sin quitarla
    public String verSala() {
        return salas.element();
    }

    // Comprobamos si la cola esta vacia
    public boolean estaVacia() {
        return salas.isEmpty();
    }
}
