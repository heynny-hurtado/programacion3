public class Ejercicio11 {

    public static void main (String[]agrs){
        //debemos de un arreglo con n numeros generar 3 arreglos uno + otro - otro con 0
        
        //creación del arreglo a  
        int[] a= new int[10];
        

        //creación del for
        for (int i= 0; i< a.length; i++){
            //esta parte de abajo no permite que los nu,eros se guarden de 10 a -10 pero aleatoriamente
            a[i]=(int)(Math.random()*(10-(10)+1)+(-10));
        }
    }
    
}
