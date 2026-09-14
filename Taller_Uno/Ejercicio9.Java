public class Ejercicio9{
    public static void main(String[]args){

    //antes de crar el for creamos los arreglos y los rangos maximo y minimo
        int[] a= new int[10];
        int max = 20;
        int min = 1;
        int h;
        int cont = 0; //cont es contador profe
     
      //vamos a crear el for 

      for (unt i= 0; i<a.length; i++){
        a[i]= (int)(Math.random()*(max-min+1))+min;
      
      }  
      //tambien hicimos de forma random el generador del nimero que se va aa buscar
      h = (int)(Math.random()*(max-min+1))+min;

    }
}