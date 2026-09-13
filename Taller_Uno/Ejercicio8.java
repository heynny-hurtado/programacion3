

//vamos a crear el random para generar 30 numeros, con lo mismo que vimos en la clase 2

public class Ejercicio8{
    public static void main(String[]args){

        int max =20;
        int min = 1;
        int[] a= new  int[30];

        for(int i= 0; i< a.length; i++){
            a[i]= (int)(Math.random()* (max-min+1))+min;
        }
        for (int i=0; i<a.length;i++){
            System.out.println("a["+i+"]="+a[i]);
        }
    }
}