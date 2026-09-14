

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

        //debemos de hacer  que busque el mayor y el menor 
        int mayor = a[0];
        int menor = a[0];

        for (int i = 1; i<a.length; i++){
            if(a[i]>mayor){
                mayor = a[i]; //recorrido para saber si el numero que sigue es mayor a 

            }

            if (a[i]<menor){
                menor = a[i]; // recorrido para sabe si el numero es menor
            }

        }
        // creamos los dos contadores esto nos permitirá saber cuantas veces se contara el mayo y cuantas el menor  y lo inicializamos en 0

        int cMayor = 0;
        int cMenor = 0;

        //creamos el for para revisar los elementos del arreglo
        for (int i =0; i< a.length; i++){

        //este es una condicion si: es como decir si el numero encontrado  es igual al valor mayor se cuenta 1 
            if(a[i]==mayor){
                cMayor++;

            }
        //este es el mismo epro con los menores
            if(a[i]== menor){
                cMenor++;
            }
        }
    }
}