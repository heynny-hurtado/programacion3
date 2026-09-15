package Matrices;

public class Ejercicio20 {
    public static void main(String[]args){
        //haremos practicamente lo mismo que el anterior solo que cambia un poco

        int[][] m = new int[10][10];

        for(int i =0; i<m.length; i++){

            for(int j = 0; j<m[i].length;j++){
                //condiciones 
                if(i+j==m[i].length -1){
                    m[i][j]=1;
                }else{
                    m[i][j]= 0;
                }
                System.out.print(m[i][j]+"");
            }
            System.out.println();
        }
    }
}
