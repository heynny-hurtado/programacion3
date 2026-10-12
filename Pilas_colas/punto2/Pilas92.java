package Pilas_colas.punto2;
import java.util.Stack;

public class Pilas92 {
    Stack<String> nombres = new Stack<>();

    //este metodo sirve para agregar un nombre a la pila
    public void agregarNombre(String nombre) {
                nombres.push(nombre);
        }

        public void mostrarPila(){
            Stack<String> auxiliar = new Stack<>();

           //este while sirve para mostrar los nombres de la pila y al mismo tiempo ir guardando los nombres en una pila auxiliar
            while (!nombres.isEmpty()) {
                String nombre = nombres.pop();
                System.out.println(nombre);
                auxiliar.push(nombre);
            }
        }
}