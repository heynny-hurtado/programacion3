package Pilas_colas.punto2;

import java.util.Scanner;
import java.util.Stack;

public class Pilas96 {

    // Creamos el nodo
    static class Nodo {
        char dato;
        Nodo siguiente;

        public Nodo(char dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String frase;
        // despues hacemos el leer las frases
        System.out.println("Ingrese una frase vacia para terminar");

        do {
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();

            if (!frase.isEmpty()) {

                // vamos a crear la pila
                Stack<Character> pila = new Stack<>();

                // y ahora creamos la lista
                Nodo primero = null;
                Nodo ultimo = null;

                // vamos a hacer el agregar los caracteres
                for (int i = 0; i < frase.length(); i++) {

                    char caracter = Character.toLowerCase(frase.charAt(i));

                    if (caracter != ' ') {
                        // ahora agrega la pila
                        pila.push(caracter);

                        // creamos el nodo
                        Nodo nuevo = new Nodo(caracter);

                        // Agregar a la lista

                        if (primero == null) {
                            primero = nuevo;
                            ultimo = nuevo;
                            ultimo.siguiente = primero;
                        } else {
                            ultimo.siguiente = nuevo;
                            ultimo = nuevo;
                            ultimo.siguiente = primero;
                        }
                    }
                }
                // compara los caracteres
                boolean palindromo = true;
                Nodo actual = primero;

                while (!pila.empty()) {

                    char caracterPila = pila.pop();
                    char caracterLista = actual.dato;

                    if (caracterPila != caracterLista) {
                        palindromo = false;
                    }
                    actual = actual.siguiente;
                }
                // mostrar el resultado
                if (palindromo) {
                    System.out.println("La frase es palindromo");
                } else {
                    System.out.println("La frase no es palindromo");
                }
            }
        } while (!frase.isEmpty());
        leer.close();
    }

}