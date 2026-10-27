package Estudio;
import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<String> nombres = new Stack<>();

        //hacemos el push
        nombres.push("Heynny");
        nombres.push("Hillary");
        nombres.push("Hanny");
        nombres.push("Heimy");

        System.out.println("pila:"+ nombres);

        //peek
        System.out.println("Arriba:"+nombres.peek());

        //size
        System.out.println("Cantidad:"+ nombres.size());

        //search
        System.out.println("posicion:"+ nombres.search("Heynny"));

        //contains
        System.out.println("¿se encuentra heynnt?"+nombres.contains("Heynny"));

        //pop
        System.out.println("Eliminado"+ nombres.pop());

        System.out.println("pila actual:"+nombres);
        //empty
        System.out.println("¿esta vacia?:"+nombres.empty());

        //get
        System.out.println("Indice:"+nombres.get(0));

        //set
        nombres.set(0, "Keissy");
        System.out.println("Despues de cambiar:" + nombres);

        //clear
        nombres.clear();
        System.out.println("Pila final:"+ nombres);

    }
    
}
