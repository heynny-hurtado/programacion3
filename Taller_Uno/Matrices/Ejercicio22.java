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
        }




    }
}
