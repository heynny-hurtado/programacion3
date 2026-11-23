package proyectoFinal.herencia;

public class Profesor extends Persona {

    //aqui tenemos los atributos de profesor
    private String  departamento;
    private double salario;

    public Profesor(String nombre, int ID, String email, String departamento, double salario ){
        super(nombre, email, ID);
        this.departamento = departamento;
        this.salario = salario;
    }
    //creamos los gets y los sets
    public String getDepartamento(){
        return departamento;

    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public void mostrarInformacion() {
            System.out.println("===== INFORMACIÓN DEL PROFESOR =====");
            System.out.println("Nombre: " + getNombre());
            System.out.println("ID: " + getID());
            System.out.println("Email: " + getEmail());
            System.out.println("Departamento: " + departamento);
            System.out.println("Salario: " + salario);
        }

}
