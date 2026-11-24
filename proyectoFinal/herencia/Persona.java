package proyectoFinal.herencia;

public abstract class Persona {

    // colocaremos los atributos de la clase persona
    private String nombre;
    private String email;
    private int ID;

    // creamos el constructor
    public Persona(String nombre, String email, int ID) {
        this.nombre = nombre;
        this.email = email;
        this.ID = ID;
    }

    // la parte abstracta de la clase persona
    public abstract void mostrarInformacion();

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
