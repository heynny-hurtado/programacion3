package proyectoFinal.clases;

public class Notas {

    //creamos  los atributos
    private Double[][]notas;

    //hacemso el constructor
    public Notas() {
        this.notas = new Double[10][20];
    }

    //creamos los gets
    public Double[][] getNotas() {
        return notas;
    }

    //metodo para registrar las notas
    public void registrarNota(int numeSemetre, int indiceMateria, Double nota){

        int fila = numeSemetre - 1; // Ajustar el número de semestre a un índice de fila (0-9)

        if(fila >= 0 && fila <notas.length
            && indiceMateria >=0
            && indiceMateria <notas[fila].length
            && nota != null && nota >= 0 && nota <= 5){

            notas[fila][indiceMateria] = nota;
            }
        }

        //consultar una nota
        public Double consultarNota(int numeSemestre, int indiceMateria){
            int fila = numeSemestre - 1; // Ajustar el número de semestre a un índice de fila (0-9)

            if(fila >= 0 && fila <notas.length
                && indiceMateria >=0
                && indiceMateria <notas[fila].length){
                return notas[fila][indiceMateria];
            }
                return null;
        }

        //calcular el promedio de un semestre
        public double calcularPromedioSemestre(int numeSemestre){
            int fila = numeSemestre - 1; // Ajustar el número de semestre a un índice de fila (0-9)

            if(fila < 0 || fila >= notas.length){
                return 0.0;
            }
            double suma = 0.0;
            int cantidadNotas = 0;

            for(int j=0; j<notas[fila].length; j++){

                if(notas[fila][j]!= null){
                    suma += notas[fila][j];
                    cantidadNotas++;
                }
            }
            return (cantidadNotas > 0) ? suma / cantidadNotas : 0.0;
        }
        //calcular el promedio acumulado
        public double clacularPromedioAcumulado(){
        double suma = 0.0;
        int cantidadNotas = 0;

        for(int i = 0; i < notas.length; i++){
            for(int j = 0; j < notas[i].length; j++){

                if(notas[i][j] != null){
                    suma += notas[i][j];
                    cantidadNotas++;
                }
            }
        }

        return (cantidadNotas > 0) ? suma / cantidadNotas : 0.0;
    }
        //metodo de mostara o generar el historial de materias reprobadas
        public void generarReporteReprobadas(){
            boolean hayReprobadas = false;

            System.out.println("Materias reprobadas:");
            for(int i = 0; i < notas.length; i++){

                for(int j = 0; j<notas[i].length; j++){

                    if(notas[i][j]!= null && notas [i][j]<3.0){

                        System.out.println("Semestre: " + (i+1));
                        System.out.println("Materia: " + (j+1));
                        System.out.println("Nota: " + notas[i][j]);
                        hayReprobadas = true;
                    }
                }
            }
            if(!hayReprobadas){
                System.out.println("No hay materias reprobadas.");
            }
        }
}
