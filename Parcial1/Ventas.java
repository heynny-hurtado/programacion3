package Parcial1;

//creamos la clase ventas
public class Ventas {

    private Funciones funcion;
    private int cantEntradas;
    private int total;

    // para dar la posibilidad de que una persona pueda comprar
    // varias sillas
    private String[] asientosSelec;

    // creamos el constructor para ventas
    public Ventas(Funciones funcion) {
        this.funcion = funcion;
        this.cantEntradas = 0;
        this.total = 0;
        this.asientosSelec = new String[96]; // recerba de espacio para guardar las sillas
    }

    //Realizamos los gets

    public Funciones getFuncion(){
        return funcion;
    }

    public int getCantEntradas(){
        return cantEntradas;
    }

    public int  getTotal(){
        return total;
    }

    public String[] getAsientoSelec(){
        return asientosSelec;
    }

        public void guardarAsiento(String asiento){
            asientosSelec[cantEntradas] = asiento;

            cantEntradas++;
        }


}