package projectoFinal;

//esta clase nos servira para crear los objetos de tipo persona, que sera en este caso estudiantes
public class Persona {

    //colocaremos los atributos de la clase persona
    private String nombre;
    private String email;
    private int  ID;

    //creamos el constructor
    public Persona(String nombre, String email, int ID) {
        this.nombre = nombre;
        this.email = email;
        this.ID = ID;
    }
    //creamos los gets
    public String getNombre() {
        return nombre;
    }
    public String getEmail() {
        return email;
    }
    public int getID() {
        return ID;
    }

}
