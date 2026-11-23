package proyectoFinal.Excepciones;

public class Excepciones {


    public static class  EstudianteNoEncontradoException extends Exception{
        public EstudianteNoEncontradoException(String mensaje){
            super(mensaje);
        }
    }

    public static class CupoLlenoException extends Exception{
        public CupoLlenoException(String mensaje){
            super(mensaje);
        }
    }

    public static class AulatadNoEncontradaException extends Exception{
        public AulatadNoEncontradaException(String mensaje){
            super(mensaje);
        }
    }

    public static class  ArchivoInvalidoException extends  Exception{
        public  ArchivoInvalidoException(String mensaje){
            super(mensaje);
        }

    }
    public static class PrerequisitoNoAprobadoException extends Exception{
        public PrerequisitoNoAprobadoException(String mensaje){
            super(mensaje);
        }
    }
    public static class HorarioConflictivoException extends Exception{
        public HorarioConflictivoException(String mensaje){
            super(mensaje);
        }
    }

    public static class ColaDeEsperaVaciaException extends Exception{
        public ColaDeEsperaVaciaException(String mensaje){
            super(mensaje);        }
    }


    }

