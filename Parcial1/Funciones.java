package Parcial1;

public class Funciones{

    //crearemos los attributos de esta clase

    private  Peliculas pelicula;
    private int numeroSala;
    private String hora;

    private String[][] sala;
    //creamos este atributo para la matriz que mostrara la sala

    public  Funciones(Peliculas pelicula, int numeroSala, String hora){
        this.pelicula = pelicula;
        this.numeroSala = numeroSala;
        this.hora = hora;
        inicializarSala();
    }
    public void inicializarSala(){
        int filastotal = (numeroSala == 3) ? 7 : 9; //hacemos esta especia de formila para que las filas
        // sean de 6 o 8 pero que siempre quede una para el encabezado

        int totalCols = 13; //lo mismo, son 12 sillas pero coloco una de mas para la letra de cada fila


        sala = new String[filastotal][totalCols];

        sala[0][0] = " ";
        for (int j = 1; j < totalCols; j++) {
            sala[0][j] = j + ""; // aqui onvertimos el int en texto haciendo suma ""

        }

        String[] letras = (numeroSala == 3)
        ? new String[]{"A","B","C","D","E","F"}
        : new String[]{"A","B","C","D","E","F","G","H"};
        //Aqui ya comenzamos a hacer nuestros arreglos con las letras de las filas segun la sala en la que estemos

        for (int i = 1; i < filastotal; i++) {
            sala[i][0] = letras[i-1];
            for (int j = 1; j < totalCols; j++) {
                sala[i][j] = "_"; 
                
            }
            
        }
    }

    //Creamos nuestro metodo para imprimir la matriz de nuestra sala
    public void mostrarSala(){
        System.out.println("---Disponibilidad De Asientos (Sala " + numeroSala + ")---");
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                System.out.print(sala[i][j] + "\t");

                
            }
            System.out.println("\t");
            
        }
    }

    public String[][] getSala(){
        return sala;
    }

    public void  setSala (String[][] sala){
        this.sala=sala;
    }





    public String obtenerHorario(int opcionHora){
        switch (opcionHora) {
            case 1: return "14:00 - 16:30";
            case 2: return "16:30 - 19:00";
            case 3: return "19:00 - 21:00";
                
               
        
            default: return "Opcion no valida";
                
        }
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