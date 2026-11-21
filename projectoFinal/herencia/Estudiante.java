package projectoFinal.herencia;

import java.util.LinkedList;
import java.util.List;
import projectoFinal.clases.Notas;
import projectoFinal.clases.Materia;


public class Estudiante extends Persona {

    //creammos los atributos
    private int semestreActual;
    private Notas notas;
    private List<Materia> listaNotas;

    //creamos el constructor
    public Estudiante(String nombre, String email, int ID, int semestreActual) {
        super(nombre, email, ID);

        this.semestreActual = semestreActual;
        this.notas = new Notas();
        this.listaNotas = new LinkedList<>();
    }

    //creamos los gets y los sets
    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }
    public Notas getNotas() {
        return notas;
    }

    //metodo para agregar materia
    public void agregarMateriaHistorial(Materia materia){

        if(materia != null && !tieneMateriaAprobada(materia.getCodigo())){
            listaNotas.add(materia);
        }
    }

    //ahora hacemos el metodo para verificar si se aprobo
    public boolean tieneMateriaAprobada(String codigoMateria){
        for(Materia materia : listaNotas){

            if(materia.getCodigo().equals(codigoMateria)){
                return true;
            }
        }
        return false;
    }

    //metodo para registrar
    public void registrarNota(int numSemetre, int indicMateria, Double nota){
    notas.registrarNota(numSemetre, indicMateria, nota);
    }
    //metodo para consultar
    public Double consultarNota(int numSemestre, int indiceMateria){
        return notas.consultarNota(numSemestre, indiceMateria);
    }
    //metodo para calcular
    public double calcularPromedioSemestre(int numSemestr){
        return notas.calcularPromedioSemestre(numSemestr);
    }
    //promedio acomulado
    public double calcularPromedioAcumulado(){
        return notas.clacularPromedioAcumulado();
    }


    //metodo para mostrar información
    @Override
    public void mostrarInformacion(){

        double prom = calcularPromedioAcumulado();

        String textoProm = (prom > 0.0)
            ? String.format("%.2f", prom)
            : "0.0 (sin notas aun)";

        System.out.println("===== INFORMACION DEL ESTUDIANTE =====");
        System.out.println("ID: " + getID());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Semestre: " + semestreActual);
        System.out.println("Promedio acumulado: " + textoProm);

    }
}