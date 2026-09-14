package Arreglos;
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

        //agregue este para poder modificar los numeros sin cambiar nada en el for
        int max = 5;
        int min=-5;

        //creación del for
        for (int i= 0; i< a.length; i++){
            //esta parte de abajo no permite que los nu,eros se guarden de 10 a -10 pero aleatoriamente
            a[i]=(int)(Math.random()*(max-min+1))+min;
        }

        //creaion del for para los arreglos negattivos positivos y ceros 

        for (int i=0; i< a.length; i++){

            //condición con if declarando que si el numero que aparezca en el arreglo es menor a 0 lo asocie como negativo
            if (a[i]<0){
                negativos[n]= a[i]; n++;
            }
            if (a[i]>0){
                positivos[psi] = a[i];
                psi++;
            }
            if (a[i]== 0){
                cero[c]= a[i]; c++;   //tenia un error       
              }
        }
        System.out.println("los Negativos son:"); 
        for (int i = 0; i < n; i++){
            System.out.println(negativos[i]+"");
        }
        System.out.println("Los positivos son:");
        for (int i = 0; i < psi; i++){
            System.out.println(positivos[i]+"");
        }
        System.out.println("los ceros son:");
        for (int i = 0; i<c; i++){
            System.out.println(cero[i]+"");
        }
        }

    }
    

