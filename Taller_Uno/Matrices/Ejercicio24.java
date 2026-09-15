package Matrices;

public class Ejercicio24 {

    public static void main(String[]args){

        //meses  
        String[] meses = {
            "Enero","Febrero", "Marzo","Abril",
            "Mayo","Junio", "Julio", "Agosto",
            "Septiembrw","Octubre", "Noviembre", "Diciembre",
        };

        String[] cereales = {
            "Arroz","Granola", "sucaritas", "trigo",
        };

        //los mese por los cereales
        int[][]a =new int[12][4];

        //llenamos la matriz

        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a[i].length; j++){
               a[i][j]= (int)(Math.random()*100);
               
            }
        }

    }
    
}
