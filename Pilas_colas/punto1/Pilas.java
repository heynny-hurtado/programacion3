package Pilas_colas.punto1;
import java.util.Stack;

public class Pilas {
    //empecemos de nuevo, vamos a hacer una pial de juegos
    private Stack<String> VideoJuegos;

    //hacemos el costructor
    public Pilas() {
        VideoJuegos = new Stack<>();
    }

    //metodonos sirve para agregar un juego a la pila
    public void agregarJuego(String juego) {
        VideoJuegos.push(juego);
    }

    //este metodo  es para quitar un juego de la pila
    public String quitarJuego(){

        if(!VideoJuegos.isEmpty()){ //en este verificamos si la pila no esta vacia
            return VideoJuegos.pop();//si no esta vacia, quitamos el juego de la pila y lo retornamos
        }
        return "No hay juegos en la pila";//si esta vacia, retornamos un mensaje

    }

    public String VerUltimoVideoJuego(){
        if(!VideoJuegos.isEmpty()){ // entonces aquí verificamos si la pila no esta vacia
            return VideoJuegos.peek();//si no esta vacia, retornamos el ultimo juego de la pila
        }
        return "No hay juegos en la pila";//si esta vacia, retornamos un mensaje
    }
}
