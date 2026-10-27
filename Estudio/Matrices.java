package Estudio;

public class Matrices {
    
    public static void main(String[] args) {
        String[][]matriz = {{"a", "b","c"},
                        {"d", "e", "f"},
                        {"g","h","i"} };

        for (int i = 0; i<matriz.length; i++ ){
            for (int j = 0;j < matriz[i].length; j++){
                System.out.println("matriz["+ i + "]["+j +"]= "+ matriz [i][j]);

            }
        }
    }
}
