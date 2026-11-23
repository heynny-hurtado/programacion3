package proyectoFinal.clases;

import proyectoFinal.Excepciones.Excepciones;
import proyectoFinal.Excepciones.Excepciones.HorarioConflictivoException;
public class Aula {

    // creamos los atributos
    private String numAula;
    private int capacidad;
    private boolean[][] disponibilidad;

    public Aula(String numAula, int capacidad) {
        this.numAula = numAula;
        this.capacidad = capacidad;
        this.disponibilidad = new boolean[7][24];
    }

    // creamos los gets
    public String getNumAula() {
        return numAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean[][] getDisponibilidad() {
        return disponibilidad;
    }

    // vamos a consultar los horarios
    public boolean consultarDisponibilidad(int dia, int hora) {

        if (dia < 0 || dia > 6 || hora < 0 || hora > 23) {
            return false;
        }
        return !disponibilidad[dia][hora];
    }

    // metodo para reservar un horario
    public void reservar(int dia, int hora, int duracion)
        throws HorarioConflictivoException{

        if(dia < 0 || dia >6 || hora <0 ||
            duracion <=0 || hora+ duracion > 24){

                throw new HorarioConflictivoException("Rango de día, duracion u hora incorrecta");

            }
        //verificar  si tenemos  el horario ocupado
        for (int h = hora; h < hora + duracion; h++) {

            if (disponibilidad[dia][h]) {
                throw new Excepciones.HorarioConflictivoException(
                        "El día " + dia + " a las " + h
                        + ":00 ya está reservado"
                );
            }
        }

    // reservar horario
    for(

    int h = hora;h<hora+duracion;h++)
    {
        disponibilidad[dia][h] = true;
        }
    }

    // metodo para liberar un horario
    public void liberar (int dia, int hora, int duracion){

        if (dia < 0 || dia > 6 || hora < 0 ||
                hora > 23 || duracion <= 0 ||
                hora + duracion > 24) {

            return;
            }
            for (int h = hora; h < hora + duracion; h++ ){
                disponibilidad[dia][h]= false;
            }
        }

    }


