public class Ejercicio12 {
    public static void main (String[]args ){
        
        
        //Crear el arreglo a
        int[] a =new int[12];

        //creamos el arreglo donde vamos a ver las posiciones
        int[]b= new int[a.length];

        //crear x
        int x = 2;
        int p = 0; //p para posición

        //creal el for para el arreglo a
        for(int i = 0;i<a.length; i++){

            // el if para X
            if (a[i]==x){ b[p]=i;p++;
                
            }

            
        }
    }
    
}
