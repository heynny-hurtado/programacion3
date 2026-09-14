package Arreglos;
public class Ejercicio13 {

    public static void main(String[]args){

    //crear el arreglo de a
    int []a =new int[a.length];

    //crreamos el arreglo de los mayores y menores
    int[ ]mayores = new int[a.length];
    int[]menores = new int [a.length];
    
    //Rango de los aleatorios 
    int max = 20;
    int min=  1;


    //for para el arreglo a
    for (int i = 0; i < a.length;i++){
        a[i]=(int)(Math.random()*(max- min +1 ))+min;
        System.out.println("a["+i+"]="+a[i]);
    }
    //para calcular la suma
    int suma = 0;


    }

}