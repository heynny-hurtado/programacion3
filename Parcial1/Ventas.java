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

    // Realizamos los gets

    public Funciones getFuncion() {
        return funcion;
    }

    public int getCantEntradas() {
        return cantEntradas;
    }

    public int getTotal() {
        return total;
    }

    public String[] getAsientoSelec() {
        return asientosSelec;
    }

    public void guardarAsiento(String asiento) {
        asientosSelec[cantEntradas] = asiento;

        cantEntradas++;
    }

    // ahora necesitamos una funcion
    public void calcularPrecio(int fila) {
        // el valor para la sala 3 es de 10000
        if (funcion.getNumeroSala() == 3) {
            total = total + 10000;
        } else {
            if (fila <= 6) { // aquí estamos aclarando que hasta la fila f es general
                total = total + 8000;
            } else { // aplica el valor para preferencial
                total = total + 12000;
            }
        }
    }
    //diseño de ocupar un asiento
    public void selecAsiento(int fila, int columna){

        String[][] matriz = funcion.getObjSala().getsalaAsientos();

        if (matriz[fila][columna]== "_"){
            matriz[fila][columna] = "X";

            String asiento = matriz[fila][0]+ columna;
            guardarAsiento(asiento);
            calcularPrecio(fila);

            System.out.println("Asiento ocupado correctamente");
        }else{

            System.out.println("este haciento Asiento ya esta ocupado por alguien mas");
        }
    }

}