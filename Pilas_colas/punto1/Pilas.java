package Pilas_colas.punto1;
import java.util.Stack;

public class Pilas {
    
    public static void main(String[]args){
        Stack<String> pila = new Stack<>();

        System.out.println(pila.empty());
        //agregamos elementos a la pila
        pila.push("CallofDuty");
        pila.push("FIFA");
        pila.push("GTA");
    }

}
