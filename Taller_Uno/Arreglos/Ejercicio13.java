package Arreglos;
public class Ejercicio13 {

    public static void main(String[]args){

    //crear el arreglo de a
    int []a =new int[10];

    //creamos el arreglo de los mayores y menores
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

    for (int i = 0; i < a.length; i++){
        suma = suma + a[i];
    }
    //para calccular la media 
    double media = (double)suma /a.length;

    System.out.println("La media es:"+ media);

    // creamos los contadores
    int m = 0;
    int n = 0;

    // ahora si creamos elfor y el if  las condiciones para separar  los mayores y menores

    for (int i =0; i<a.length; i++){

        if (a[i]>media){
            mayores[m]=a[i];m++;
        }
        if (a[i] > media){
            menores[n] = a[i]; n++;
        }
    }
    System.out.println("Menores que la media:");

    for(int i = 0; i< n; i++){
        System.out.println("menores["+i+"]="+menores[i]);
    }

    }

}