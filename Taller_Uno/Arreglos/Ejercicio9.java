package Arreglos;
//elimine el ejercicio 9 porque no podia darle al run lo copie y pegue

public class Ejercicio9{
    public static void main(String[]args){

    //antes de crar el for creamos los arreglos y los rangos maximo y minimo
        int[] a= new int[10];
        int max = 15;
        int min = 1;
        int h;
        int cont = 0; //cont es contador profe
     

     //tenia un error porque no hice el for para el arreglo de a

    for (int i = 0; i< a.length; i++){
        a[i]= (int)(Math.random()*(max- min +1))+min;
    }
      //vamos a crear el for 

      for (int i= 0; i<a.length; i++){
        a[i]= (int)(Math.random()*(max-min+1))+min;
            System.out.println("a["+i+"]="+a[i]); //para mirar los numeros que el agregue en este arreglo y confirmar si si da
      
      }  
      //tambien hicimos de forma random el generador del número que se va aa buscar
      h = (int)(Math.random()*(max-min+1))+min;

        //el for para contar las repeticiones 
        for(int i =0; i< a.length;i ++){
            if(a[i]==h){
                cont++;
            }
        }
        //los Sysout para imprimir  
        System.out.println("El número buscado es:"+ h);
        System.out.println("Se repite "+cont+ "veces");
    }
}
