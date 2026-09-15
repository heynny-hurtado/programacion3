package Matrices;

public class Ejercicio17 {
    
    public static void main(String[]args){
        //i representa las fila, horizontal
        //j las columnas vertical
    
    //vamos a crear la matriz  m
        int [][]m={
            {8,5,4},
            {3,2,1},
            {7,6,9},
        };
        //recorrido de la matriz m 
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[i].length;j++){

                 
            System.out.println("m["+i+"]["+j+"]="+m[i][j]);
            }
           
        }
        //for para la suma de filas 
     
        
        for(int i = 0; i< m.length;i++){
               int sumaF=0;

            for(int j=0; j<m[i].length; j++){
                sumaF = sumaF+m[i][j];
            }
            System.out.println("La suma de la fila es"+i+"="+ sumaF);
        }
    }

}
