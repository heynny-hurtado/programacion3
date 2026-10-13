package Pilas_colas.punto2;
import  java.util.Scanner;
import java.util.Stack;

public class Pilas94 {

    public static void main(String[]args){

        Scanner leer = new Scanner(System.in);

        //creamos las cinco pilas
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        Stack<Integer> P3 = new Stack<>();
        Stack<Integer> P4 = new Stack<>();
        Stack<Integer> P5 = new Stack<>();

        int i, j;

        //creamos el do para poder ingresar los datos

        do{
            //leer los datoos
            System.out.println("Ingrese i(0 para teminar)");
            i = leer.nextInt();

            if(i != 0){
                System.out.print("Ingrese j:");
                j = leer.nextInt();

            //Agregar elementos
            if (i> 0){

                if (i == 1){
                    P1.push(j);
                }else if (i== 2){
                    P2.push(j);
                }else if (i==3){
                    P3.push(j);
                }else if (i==4){
                    P4.push(j);
                }else if (i==5){
                    P5.push(j);
                }else{
                    System.out.println("Pila no valida");
                }

              

            }
            }
        }
    }
    
}
