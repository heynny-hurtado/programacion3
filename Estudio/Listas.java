
package Estudio;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {

        ArrayList<String> apellidos = new ArrayList<>();

        // 1. ADD: agregar apellidos
        apellidos.add("Hurtado");
        apellidos.add("Sanchez");
        apellidos.add("Gomez");

        System.out.println("Lista: " + apellidos);

        // 2. GET: consultar una posicion
        System.out.println("Posicion 0: " + apellidos.get(0));

        // 3. SET: modificar un apellido
        apellidos.set(1, "Rodriguez");
        System.out.println("Lista modificada: " + apellidos);

        // 4. SIZE: contar elementos
        System.out.println("Cantidad: " + apellidos.size());

        // 5. CONTAINS: buscar un apellido
        System.out.println("¿Esta Gomez? " + apellidos.contains("Gomez"));

        // 6. INDEXOF: buscar la posicion
        System.out.println("Posicion de Gomez: " + apellidos.indexOf("Gomez"));

        // 7. REMOVE: eliminar por indice
        apellidos.remove(0);
        System.out.println("Despues de eliminar: " + apellidos);

        // 8. ISEMPTY: comprobar si esta vacia
        System.out.println("¿Esta vacia? " + apellidos.isEmpty());

        // 9. CLEAR: vaciar la lista
        apellidos.clear();
        System.out.println("Lista final: " + apellidos);

        System.out.println("¿Esta vacia? " + apellidos.isEmpty());
    }
}

