package Matrices;

public class Ejercicio19 {
    public static void main(String[]args){

      //creamos la matris 
      int [][]m = new int [6][6]; 

      //vamso a crear los for para recorrer las filas y el de recorrer las columnas
      for (int i = 0; i <m.length; i++){

        for(int j = 0; j<m[i].length;j++){

            //crearemos las condiciones que queremos
            if(i==j){
                m[i][j]=1;

            }else{
                m[i][j]=0;
            }
            //Imprimimos
            System.out.print(m[i][j]+"");

        }
        System.out.println(); //para que ahora si lo imprima todo
      }
    }
    
}
