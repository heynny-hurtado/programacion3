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
        
    }
}
