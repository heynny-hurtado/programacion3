package Matrices;

public class Ejercicio21 {
    public static void main(String[]args){


        int[][]a= new int [3][4];

        //vamos a crear el vector
        int[]b = new int[a.length];

        //vamos a hacer uno rango  de los numeros random  para que los numero se repitan
        int max = 8;
        int min = 1;


        //realizamos los for
        for (int i = 0; i< a.length; i++){
            for (int j =0; j<a[i].length;j++){
            
                //creamos el random
                a[i][j]=(int)(Math.random()*(max-min+1))+min;
                //imprimimos
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
