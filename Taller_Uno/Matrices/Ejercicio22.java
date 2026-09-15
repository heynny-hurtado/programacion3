package Matrices;

import java.io.StringReader;

public class Ejercicio22 {
    
    public static void main (String[]args){

        int [][]a = new int [f][c];



        // creamos el for para llenar
        for(int i =0; i<a.length; i++){
            for (int j = 0; j <a[i].length;j++){
                a[i][j]= (int)(Math.random()* 100+1);
    
            }
        }

        //mostrar la matriz
        String  cad ="";

        for(int i = 0; i<a.length;i++){
            for(int j = 0; j <a[i].length;j++){
                cad+= "|"+a[i][j]+"|";
            }
            cad+= "n";


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
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

        }




    }
}
