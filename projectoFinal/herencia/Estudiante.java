package projectoFinal.herencia;
import java.util.LinkedList;

public  class Estudiante extends Persona{

    //Atributos de la clase estudiante
    private int semestreActual;
    private Double [][] notas;
    private LinkedList<String> historialMaterias;

    //constructor
    public Estudiante(String nombre, String email, int ID, int semestreActual, Double[][] notas) {
        super(nombre, email, ID); //llamaos la herencia

        this.semestreActual = semestreActual;
        this.notas = notas;
        this.historialMaterias = new LinkedList<>();

    }
    //los gets y lso sets
    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public Double[][] getNotas() {
        return notas;
    }

    public LinkedList<String> getHistorialMaterias() {
        return historialMaterias;
    }

    //metodo para mostrar información 
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("ID: " + getID());
        System.out.println("Semestre Actual: " + semestreActual);
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Historial de Materias: " + historialMaterias);
    }

}