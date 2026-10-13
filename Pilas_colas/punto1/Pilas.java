package Pilas_colas.punto1;

import java.util.Stack;


public class Pilas {
    // empecemos de nuevo, vamos a hacer una pila de juegos
    private Stack<String> videoJuegos;

    // hacemos el costructor
    public Pilas() {
        videoJuegos = new Stack<>();
    }

    // el metodo push sirve para agregar un juego a la pila
    public void agregarJuego(String juego) {
        videoJuegos.push(juego);
    }

    // el metodo Pop, este metodo es para quitar un elemento (juego) de la pila
    public String quitarJuego() {
        if (!videoJuegos.isEmpty()) {
            return videoJuegos.pop();
        } else {
            return "La pila está vacía, no hay juegos para quitar.";
        }
    }

    // el metodo peek, este metodo es para ver el juego que esta en la cima de la
    // pila
    public String verJuegoCima() {
        if (!videoJuegos.isEmpty()) {
            return videoJuegos.peek();
        } else {
            return "La pila está vacía, no hay juegos para ver.";
        }
    }
    //search nos permite buscar un juego en la pila y comprobar si esta o no en la pila, si esta nos devuelve la posicion del juego en la pila, si no esta nos devuelve -1
    public boolean buscarVideoJuego(String videoJuego) {
        return videoJuegos.search(videoJuego) != -1;
    }

    // este nos muestra cuantos tenemos guardados en la pila
    public void mostrarJuegos() {
        System.out.println("los videojuegos son:"+videoJuegos);
    }

    public int cantidadVideoJuegos(){
        return videoJuegos.size();
    }
    //listo
    public boolean estaVacia() {
        return videoJuegos.isEmpty();
    }

}
