package Pilas_colas.punto1;

//hacemos un main para probar que la pila funciona correctamente

public class MainPilas {
    
    public static void main(String[]args){

        // creamos un objeto de la clase Pilas para llamar a los metodos de la clase Pilas
        Pilas juegos = new Pilas();


        //ahora vamos a agregar algunos juegos a la pila
        juegos.agregarJuego("Call of Duty");
        juegos.agregarJuego("Los Sims");
        juegos.agregarJuego("Halo");
        juegos.agregarJuego("Minecraft");
        juegos.agregarJuego("GTA");


        
    }
}
