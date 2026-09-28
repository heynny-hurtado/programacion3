 package Parcial1;

 public class sala {
    
    private int numeroSala;

    private String[][] salaAsientos;
    //creamos este atributo para la matriz que mostrara la sala

     public sala(int numeroSala){
        this.numeroSala = numeroSala;
        inicializarSala();
     }
    
    
    public void inicializarSala(){
        int filastotal = (numeroSala == 3) ? 7 : 9; //hacemos esta especia de formila para que las filas
        // sean de 6 o 8 pero que siempre quede una para el encabezado

        int totalCols = 13; //lo mismo, son 12 sillas pero coloco una de mas para la letra de cada fila


        salaAsientos = new String[filastotal][totalCols];

        salaAsientos[0][0] = " ";
        for (int j = 1; j < totalCols; j++) {
            salaAsientos[0][j] = j + ""; // aqui onvertimos el int en texto haciendo suma ""

        }

        String[] letras = (numeroSala == 3)
        ? new String[]{"A","B","C","D","E","F"}
        : new String[]{"A","B","C","D","E","F","G","H"};
        //Aqui ya comenzamos a hacer nuestros arreglos con las letras de las filas segun la sala en la que estemos

        for (int i = 1; i < filastotal; i++) {
            salaAsientos[i][0] = letras[i-1];
            for (int j = 1; j < totalCols; j++) {
                salaAsientos[i][j] = "_"; 
                
            }
            
        }
    }

    //Creamos nuestro metodo para imprimir la matriz de nuestra sala
    public void mostrarSala(){
        System.out.println("---Disponibilidad De Asientos (Sala " + numeroSala + ")---");
        for (int i = 0; i < salaAsientos.length; i++) {
            for (int j = 0; j < salaAsientos[0].length; j++) {
                System.out.print(salaAsientos[i][j] + "\t");

                
            }
            System.out.println("\t");
            
        }
    }

    //getters y seters
    public int getNumeroSala(){
        return  numeroSala;
    }

    public String[][] getsalaAsientos(){
        return salaAsientos;
    }

    public void setsalaAsientos(String[][] salaAsientos){
        this.salaAsientos= salaAsientos;
    }

}