package Pilas_colas.punto2;
import java.util.Stack;
import java.util.Scanner;

public class Pilas92 {
    public static void main(String[]args){


        Scanner entrada = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.println("Ingrese una secuencia con el formato X y Y");
        //nos permite guardar la secuencia ingresada
        String secuencia = entrada.nextLine();
        //separamos la secuencia que ingreso
        String[] partes = secuencia.split("&");

        //nos permite guardar la primera cadena variabel X y la segunda variable Y
        String x = partes[0];
        String y = partes [1];

        for(int i = 0; i< x.length(); i++){
            pila.push(x.charAt(i));
        }

        String inversa ="";


    }
}