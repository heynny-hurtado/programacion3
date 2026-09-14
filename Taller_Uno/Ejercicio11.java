public class Ejercicio11 {

    public static void main (String[]agrs){
        //debemos de un arreglo con n numeros generar 3 arreglos uno + otro - otro con 0
        
        //creación del arreglo a  
        int[] a= new int[10];

        //vamos a crear los arreglos para negativos positivos y ceros
        int[] negativos = new int[a.length];
        int[] positivos = new int[a.length];
        int[] cero = new int [a.length];
        
        //para los contadores de posición 
        int n= 0;  
        int psi = 0;
        int c = 0;

        

        //creación del for
        for (int i= 0; i< a.length; i++){
            //esta parte de abajo no permite que los nu,eros se guarden de 10 a -10 pero aleatoriamente
            a[i]=(int)(Math.random()*(10-(10)+1)+(-10));
        }

        //creaion del for para los arreglos negattivos positivos y ceros 

        for (int i=0; i< a.length; i++){

            //condición con if declarando que si el numero que aparezca en el arreglo es menor a 0 lo asocie como negativo
            if (a[i]<0){
                negativos[n]= a[i]; n++;
            }
            
        }
    }
    
}
