package proyectoFinal.Estructura;

import proyectoFinal.clases.Aula;
import proyectoFinal.clases.Materia;
import proyectoFinal.herencia.Estudiante;

public class Operacion {

    private String tipoOperacion;
    private Object datoAnterior;
    private Object datoNuevo;
    private String clave;

    // creamos el constructor
    public Operacion(String tipoOperacion, Object datoAnterior, Object datoNuevo, String clave) {
        this.tipoOperacion = tipoOperacion;
        this.datoAnterior = datoAnterior;
        this.datoNuevo = datoNuevo;
        this.clave = clave;
    }

    // creamos los gets
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public Object getDatoAnterior() {
        return datoAnterior;
    }

    public Object getDatoNuevo() {
        return datoNuevo;
    }

    public String getClave() {
        return clave;
    }

    // metodos para deshacer operacion
    public void deshacer(ContEstructura contenedor) {

        switch (tipoOperacion) {

            case "REGISTRAR_ESTUDIANTE":
                contenedor.eliminarEstudiante(clave);
                break;

            case "ELIMINAR_ESTUDIANTE":
                contenedor.registrarEstudiante((Estudiante) datoAnterior);
                break;

            case "REGISTRAR_MATERIA":
                contenedor.eliminarMateria(clave);
                break;

            case "ELIMINAR_MATERIA":
                contenedor.registrarMateria((Materia) datoAnterior);
                break;

            case "REGISTRAR_AULA":
                contenedor.eliminarAula(clave);
                break;

            case "ELIMINAR_AULA":
                contenedor.registrarAula((Aula) datoAnterior);
                break;

            default:
                throw new IllegalArgumentException(
                        "Operacion no reconocida");
        }
    }

    // metodos para rehacer operacion
    public void rehacer(ContEstructura contenedor) {

        switch (tipoOperacion) {

            case "REGISTRAR_ESTUDIANTE":
                contenedor.registrarEstudiante((Estudiante) datoNuevo);
                break;

            case "ELIMINAR_ESTUDIANTE":
                contenedor.eliminarEstudiante(clave);
                break;

            case "REGISTRAR_MATERIA":
                contenedor.registrarMateria((Materia) datoNuevo);
                break;

            case "ELIMINAR_MATERIA":
                contenedor.eliminarMateria(clave);
                break;

            case "REGISTRAR_AULA":
                contenedor.registrarAula((Aula) datoNuevo);
                break;

            case "ELIMINAR_AULA":
                contenedor.eliminarAula(clave);
                break;

            default:
                throw new IllegalArgumentException(
                        "Operacion no reconocida");
        }
    }

}
