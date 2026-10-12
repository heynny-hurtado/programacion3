
package Pilas_colas.punto2;

import java.util.Stack;
import java.util.Scanner;

public class Pilas92 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.println("Ingrese una secuencia con el formato X&Y");

        // Nos permite guardar la secuencia ingresada
        String secuencia = entrada.nextLine();

        // Separamos la secuencia que ingresó
        String[] partes = secuencia.split("&");

        // Guardamos la primera cadena en X y la segunda en Y
        String x = partes[0];
        String y = partes[1];

        // Sirve para recorrer los caracteres de la primera cadena
        for (int i = 0; i < x.length(); i++) {
            pila.push(x.charAt(i));
        }

        // Creamos una cadena vacía para construir la inversa
        String inversa = "";

        while (!pila.empty()) {
            inversa = inversa + pila.pop();
        }

        // Comparamos la cadena inversa con la segunda cadena
        if (inversa.equals(y)) {
            System.out.println("La secuencia es correcta");
        } else {
            System.out.println("La secuencia es incorrecta");
        }

        entrada.close();
    }
}
