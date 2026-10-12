package Pilas_colas.punto1;
import java.util.Stack;

public class Pilas {
    //empecemos de nuevo, vamos a hacer una pial de juegos
    private Stack<String> videoJuegos;

    //hacemos el costructor
    public Pilas() {
        videoJuegos = new Stack<>();
    }

    //el metodo push  sirve para agregar un juego a la pila
    public void agregarJuego(String juego) {
        videoJuegos.push(juego);
    }

    // el metodo Pop, este metodo  es para quitar un elemento (juego) de la pila
    public String quitarJuego() {
        if (!videoJuegos.isEmpty()) {
            return videoJuegos.pop();
        } else {
            return "La pila está vacía, no hay juegos para quitar.";
        }
    }

    // el metodo peek, este metodo es para ver el juego que esta en la cima de la pila
    public String verJuegoCima() {
        if(!videoJuegos.isEmpty()){
            return videoJuegos.peek();
        } else {
            return "La pila está vacía, no hay juegos para ver.";
        }
    }

}
