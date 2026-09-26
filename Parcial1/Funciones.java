package Parcial1;

public class Funciones{

    //crearemos los attributos de esta clase

    private  Peliculas pelicula;
    private int numeroSala;
    private String hora;


    public String obtenerHorario(int opcionHora){
        switch (opcionHora) {
            case 1: return "14:00 - 16:30";
            case 2: return "16:30 - 19:00";
            case 3: return "19:00 - 21:00";
                
               
        
            default: return "Opcion no valida";
                
        }
    }


    public Funciones(Peliculas pelicula, int numeroSala, String hora) {
        this.pelicula = pelicula;
        this.numeroSala = numeroSala;
        this.hora = hora;
    }

    //creamos los get y los set de los attributos de la clase
    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    //metodo que nos permite ver la informacion de la función
    public void mostrarDatos() {
        System.out.println("Pelicula: " + pelicula.getNombre());
        System.out.println("Sala: " + numeroSala);
        System.out.println("Hora: " + hora);
        if (pelicula != null) {
            pelicula.mostrarDatos();
    }else{
        System.out.println("No hay pelicula asignada a esta funcion");
    }
}
}