public class Ejercicio12 {
    public static void main (String[]args ){
        
        
        //Crear el arreglo a
        int[] a =new int[12];

        //creamos el arreglo donde vamos a ver las posiciones
        int[]b= new int[a.length];

        //crear x
        int x = 2;
        int p = 0; //p para posición

        //tambien usar el random para que me de los numeros
        int max= 6;
        int min = 1;

        //creal el for para buscar en el arreglo a
        for(int i = 0;i<a.length; i++){
            a[i]= (int)(Math.random()* (max-min+1))+min;
            System.out.println("a["+i+"]="+a[i]);
                
            }
            //for qye busca el numero x  y la condicion que guarda las posiciones en b
            for(int i = 0;i<a.length; i++){
             // el if para X
            if (a[i]==x){ b[p]=i;p++;

            }
        }

        //ahora si el for que recorre todo el arreglo a
        for (int i = 0; i <a.length;i++){
            // la condicion que busca si en la posición i se encuentra el numero X que buscamos
            if(a[i]==x);{
                b[p]= i; p++;
            }
        }
    }
    
}
