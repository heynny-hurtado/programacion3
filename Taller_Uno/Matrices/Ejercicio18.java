package Matrices;

public class Ejercicio18 {
    public static void main(String[]args){

        //ahora queremos hacer una matriz que haga la tabla del1 al 10
        //es como si fueramos a multiplicar la fila por la columna 
        


        //vamos a crear la matriz 
        int[][]m = new int[10][10]; //con esto sabremo que seran 10filas y 10 columnas
        
        //creamos el for
        for(int i = 0; i<m.length;i++){

            for(int j =0;j < m[i].length; j++){
                m[i][j]= (i+1)*(j+1);
            }
        }
        //ahora si imprimimos
        System.err.println("TABLA DE MULTIPLICAR");

        for (int i =0; i <m.length; i++){

            for(int j = 0; j<m[i].length; j++){
                //para que no salte a la siguiente linea sino que siga en la misma, toco investigar profe
                System.out.print(m[i][j]+"\t" );
            }
        }

    }
    
}
