package Arreglos;
public class Ejercicio10 {
    public static void main (String[]args){

      //mision, sumar primero con ultimo segundo con penultimo etc cmomo lo vamos a hacer?
        //quiero hacerlo creando  un arreglo que me de numeros aleatorios
        int [] s = new int [12]; //mi arreglo lo llame s
        int max= 15;
        int min= 1;

        //ahora si crearemos el for 

        for (int i = 0; i<s.length; i++){
            s[i]=(int)(Math.random()*(max-min+1))+min;
            System.out.println("s["+i+"]="+s[i]); //Sysout para imprimir y visualizar el arreglo
        }
        //la pregunta es como aremos que se sumen el primero con el ultimo, el segundo con el penultimo etc...
        //debemos crear otro arreglo que sume y haga esto tomando el arreglo de a

        int[] e =new int [s.length/2]; // el arreglo de suma de estremos  /2 divide el tamaño entre 2
    
        for(int i = 0; i<e.length; i++){
            //vamos a crear la suma en el arreglo e para sumar los arreglos de s
            e[i]=s[i]+s[s.length -1-i];
            
            System.out.println("e["+i+"]="+e[i]); // de esta forma se puede ver lo que sucedio con el arreglo s y el ecomo termino
        }
    
    }


    
}
