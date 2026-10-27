package Estudio;

public class Array {

    public static void main(String[] args) {
        String[]apellidos = new String[5];
        apellidos [0] = "Hurtado";
        apellidos [1] = "Sanchez";
        apellidos [2] = "Gómez";
        apellidos [3] = "Hernandez";
        apellidos [4] = "Valencia";


        for(int i = 0; i<apellidos.length; i++){
            System.out.println("["+i+"] ["+ apellidos [i]+"]");

        }
    }


}
