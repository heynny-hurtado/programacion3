//elimine el ejercicio 9 porque do podia darle al run lo copie y pegue

public class Ejercicio9{
    public static void main(String[]args){

    //antes de crar el for creamos los arreglos y los rangos maximo y minimo
        int[] a= new int[10];
        int max = 20;
        int min = 1;
        int h;
        int cont = 0; //cont es contador profe
     

     //tenia un error porque no hice el for para el arreglo de a

    for (int i = 0; i< a.length; i++){
        a[i]= (int)(Math.random()*(max- min +))+min;
    }
      //vamos a crear el for 

      for (int i= 0; i<a.length; i++){
        a[i]= (int)(Math.random()*(max-min+1))+min;
      
      }  
      //tambien hicimos de forma random el generador del nimero que se va aa buscar
      h = (int)(Math.random()*(max-min+1))+min;

        //el for para contar las repeticiones 
        for(int i =0; i< a.length;i ++){
            if(a[i]==h){
                cont++;
            }
        }
        //los Sysout para imprimir  
        System.out.println("El número buscado es:"+ h);
        System.out.println("Se repite "+cont+ "de veces");
    }
}
