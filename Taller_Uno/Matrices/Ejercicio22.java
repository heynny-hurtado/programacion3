package Matrices;
import java.util.Scanner;

import java.io.StringReader;

public class Ejercicio22 {
    
    public static void main (String[]args){

        // el ejercicio dice que es para cualquier matriz por ende su dimencion debe ser dada 

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas");
        int f = leer.nextInt() ;

        System.out.print("Ingrese el numero de columnas")
        int c = leer.nextInt();



        int [][]a = new int [f][c];



        // creamos el for para llenar
        for(int i =0; i<a.length; i++){
            for (int j = 0; j <a[i].length;j++){
                a[i][j]= (int)(Math.random()* 100);
    
            }
        }

        //mostrar la matriz

        for(int i = 0; i<a.length;i++){
            for(int j = 0; j <a[i].length;j++){
                System.out.ptint("|"+a[i][j]+"|");
            
            }
            System.out.println();
        }


            // ahora si vamos a inicializa mayores y menores

            int mayor = a[0][0];
            int menor = a[0][0];

            int fMayor= 0;
            int cMayor = 0;
            int fMenor = 0;
            int cMenor = 0;

            //buscamos el mayor y buscamos el menor con los for y los if para las condiciones
            for (int i = 0 ; i<a.length; i ++){
                for (int j = 0;j<a[i].length; j++){
                    if (a[i][j]> mayor){
                        fMayor = i;
                        cMayor = j;
                    }
                    if(a[i][j]<menor){
                        menor= a[i][j];
                        fMayor = i;
                        cMenor = j;
                    }

                }
            }
            System.out.println("El mayor es ="+mayor);
            System.out.println("su posición  es =["+fMayor+"]["+cMayor+"]");

            System.out.println("El menor es = "+menor);
            System.out.println("su posición es = ["+fMenor+"]["+cMenor+"]");

        }




    }

