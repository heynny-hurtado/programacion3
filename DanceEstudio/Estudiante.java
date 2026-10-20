//vamsoa iniciar con estudiante

public class Estudiante {

    // crear los datos que tendra nuestra clase
    private String nombre;
    private int numero;

    // creamos el constructor
    public Estudiante(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // creamso los gets
    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    // creamos los set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString() {
        return "numero: " + numero + " - Nombre: " + nombre;
    }
}