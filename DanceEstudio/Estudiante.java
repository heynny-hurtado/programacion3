//vamsoa iniciar con estudiante

public class Estudiante {

    // crearlos los datos que tendra nuestra clase
    private String nombre;
    private int numero;

    // creamos el constructor
    public Estudiante(String nombre, int numero) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void serNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Codigo: " + numero + " - Nombre: " + numero;
    }
}