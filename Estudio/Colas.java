package Estudio;

import java.util.Queue;
import java.util.LinkedList;

public class Colas {

    public static void main(String[] args) {

        Queue<String> nombres = new LinkedList<>();

        // 1. OFFER: agregar personas
        nombres.offer("Ana");
        nombres.offer("Luis");
        nombres.offer("Carlos");

        System.out.println("Cola: " + nombres);

        // 2. PEEK: mirar el primero
        System.out.println("Primero: " + nombres.peek());

        // 3. SIZE: cantidad de elementos
        System.out.println("Cantidad: " + nombres.size());

        // 4. CONTAINS: buscar un nombre
        System.out.println("¿Esta Luis? " + nombres.contains("Luis"));

        // 5. POLL: eliminar el primero
        System.out.println("Sale: " + nombres.poll());

        System.out.println("Cola actual: " + nombres);

        // 6. ISEMPTY: comprobar si esta vacia
        System.out.println("¿Esta vacia? " + nombres.isEmpty());

        // 7. CLEAR: vaciar la cola
        nombres.clear();

        System.out.println("Cola final: " + nombres);
        System.out.println("¿Esta vacia? " + nombres.isEmpty());
    }
}
