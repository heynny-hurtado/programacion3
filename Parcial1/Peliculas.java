package Parcial1;
public class Peliculas {
    private String nombre;
    private String idoma;
    private String tipo;
    private int duracion;

    public Peliculas() {
    }

    
    
    public Peliculas(String nombre, String idoma, String tipo, int duracion) {
    this.nombre = nombre;
    this.idoma = idoma;
    this.tipo = tipo;
    this.duracion = duracion;

    

}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getIdoma() {
    return idoma;
}
public void setIdoma(String idoma) {
    this.idoma = idoma;
}
public String getTipo() {
    return tipo;
}
public void setTipo(String tipo) {
    this.tipo = tipo;
}
public int getDuracion() {
    return duracion;
}
public void setDuracion(int duracion) {
    this.duracion = duracion;
}
public void mostrarDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Idioma: " + idoma);
    System.out.println("Tipo: " + tipo);
    System.out.println("Duración: " + duracion + " minutos");
}



}

