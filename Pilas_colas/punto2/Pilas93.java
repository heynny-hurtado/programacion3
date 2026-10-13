package Pilas_colas.punto2;

import java.util.Stack;
import java.util.Scanner;

public class Pilas93 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.println("Ingrese una expresion");
        String expresion = entrada.nextLine();

        boolean equilibrado = true;

        // Recorre cada caracter de la expresion
        for (int i = 0; i < expresion.length(); i++) {

            char caracter = expresion.charAt(i);

            // este que vamos a hacer nos permite guardar los simbolos
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            }

            // Verifique los simbolos de cierre
            else if (caracter == ')' || caracter == ']' || caracter == '}') {

                if (pila.isEmpty()) {
                    equilibrado = false;
                    break;
                }
                // lo que hace es sacar el último carácter que se guardo
                char apertura = pila.pop();
                // es un if para verificar el simbilo si corresponde o no a apertura
                if ((caracter == ')' && apertura != '(') ||
                        (caracter == ']' && apertura != '[') ||
                        (caracter == '}' && apertura != '{')) {

                    equilibrado = false;
                    break;
                }

            }
        }
        // este verifica quedaron simbolos de apertura sin error
        if (!pila.isEmpty()) {
            equilibrado = false;
        }

        if(equilibrado){
            System.out.println("La expresion esta equilibriada");
        }else{
            System.out.println("La expresion no esta equilibrada");
        }
        entrada.close();
    }

}
