public  class Ejercicio7{
    

    public static void main (String[]args){
         //vamos a crear el arreglo de A
    int[] a={1,2,3,4,5,6,7,8,9,10};

    
    for (int i = 0; i < a.length; i++) {
            System.out.println ("a["+i+"]"+a[i]);
    }
    int[]pares =new int[a.length];  //para los pares
    int [] impares = new int[a.length]; //para los impares

    int np=0;
    int ni= 0;

    //queremos hacer el for para los pares pero debemos agregar la condicion
     for (int i = 0; i < 10; i++) {
         if(a[i]%2 ==0){  //para dividir un numero en  2 partes y que no sobre un valor
            //como si escogieramos un numero y vieramos cuantas veces se puede dividir ese numero
            pares[np]=a[i];
            np = np+1;
         }
     }

    }
    
    
    }
}

