import java.util.Stack;

public class Historial {

    private Stack<String> acciones;

    // creamos el constructor de a pila
    public Historial() {
        acciones = new Stack<>();
    }

    Historial historial = new Historial();

    //metodo para guardar las acciones
    public void guardarAccion(String accion){
        acciones.push(accion);
    }

    //metodo para quitar o deshacer una accion
    public String deshacerAccion(){
        if(!acciones.empty()){
            return acciones.pop();
        }
        return "No hay acciones en el historial";|
    }
    //metodo para consultar
    public String ultimaAccion(){
        if(!acciones.empty()){
            return acciones.peek();
        }
        return "No hay acciones en el historial";
    }
}