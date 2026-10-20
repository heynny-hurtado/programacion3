import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // ahora vamos a crear los objetos de los tipos de danza que tiene la clase
        DanceCls hiphop = new DanceCls("hiphop");
        DanceCls afrodance = new DanceCls("afrodance");
        DanceCls popping = new DanceCls("popping");
        DanceCls locking = new DanceCls("locking");
        DanceCls breaking = new DanceCls("breaking");

        // el de historial
        Historial historial = new Historial();

        int opcion;

        do {
            System.out.println("========DANCE STUDIO==========");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Inscribir estudiante");
            System.out.println("3. Retirar estudiante");
            System.out.println("4. Buscar estudiante");
            System.out.println("5. Mostrar estudiante");
            System.out.println("6. Consultar cupos disponibles");
            System.out.println("7. Mostrar cola de espera");
            System.out.println("8. Mostrar historial");
            System.out.println("9. Deshacer ultima accion");
            System.out.println("10. Salir");

            System.out.println("Seleccione una opcion:");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    // para registrar un estudiante y asignarle un numero
                    System.out.println("Nombre del estudiante");
                    String nombre = entrada.nextLine();

                    System.out.println("Numero del estudiante");
                    int numero = entrada.nextInt();
                    entrada.nextLine();

                    Estudiante estudiante = new Estudiante(nombre, numero);
                    estudiantes.add(estudiante);

                    historial.guardarAccion("Se registro a " + nombre);

                    System.out.println("Estudiante registrado correctamente");
                    break;

                case 2:
                    System.out.println("Numero del estudiante");
                    int numBuscar = entrada.nextInt();
                    entrada.nextLine();

                    Estudiante encontrado = null;

                    for (Estudiante e : estudiantes) {
                        if (e.getNumero() == numBuscar) {
                            encontrado = e;
                            break;
                        }
                    }

                    if (encontrado == null) {
                        System.out.println("Estudiante no registrado");
                        break;
                    }

                    System.out.println("Seleccione el estilo de baile");
                    System.out.println("1. Hiphop");
                    System.out.println("2. Afrodance");
                    System.out.println("3. Popping");
                    System.out.println("4. Locking");
                    System.out.println("5. Breaking");

                    int opcionEstilo = entrada.nextInt();
                    entrada.nextLine();

                    DanceCls clase = seleCls(opcionEstilo, hiphop, afrodance,
                            popping, locking, breaking);

                    if (clase == null) {
                        System.out.println("Estilo no valido");
                    } else if (clase.inscribirEstudiante(encontrado)) {
                        historial.guardarAccion("Inscripcion de "
                                + encontrado.getNombre()
                                + " en " + clase.getEstilo());

                        System.out.println("Estudiante inscrito correctamente");
                    } else {
                        System.out.println("Clase llena: El estudiante se agregara a la cola de espera");
                    }
                    break;

                case 3:
                    System.out.println("Numero del estuifante");
                    int numRetirar = entrada.nextInt();
                    entrada.nextLine();

                    Estudiante retirar = null;

                    for (Estudiante e : estudiantes) {
                        if (e.getNumero() == numRetirar) {
                            retirar = e;
                            break;
                        }

                    }
                    if (retirar == null) {
                        System.out.println("Estudiante no registrado");
                        break;
                    }
                    System.out.println("Seleccione el estilo de baile");
                    System.out.println("1. hiphop");
                    System.out.println("2. Afrodance");
                    System.out.println("3. popping ");
                    System.out.println("4. LLocking");
                    System.out.println("5. Breaking");

                    int opcionRetirar = entrada.nextInt();
                    entrada.nextLine();

                    DanceCls claseRetirar = seleCls(opcionRetirar,
                            hiphop, afrodance, popping, locking, breaking);

                    if (claseRetirar == null) {
                        System.out.println("Estilo no valido");
                    } else if (claseRetirar.retirarEstudiante(numRetirar)) {
                        historial.guardarAccion("se retiro a" + retirar.getNombre() + "de"
                                + claseRetirar.getEstilo());

                        System.out.println("Estudiante retirado correctamente");

                    }
                    break;

                case 4:
                    System.out.println("Numero del estudiante que desea buscar");
                    int numBuscarEst = entrada.nextInt();
                    entrada.nextLine();

                    Estudiante encontradoBuscar = null;

                    for(Estudiante e : estudiantes){
                        if(e.getNumero()== numBuscarEst){
                            encontradoBuscar = e;
                            break;
                        }
                    }
                    if(encontradoBuscar != null){
                        System.out.println("Estudiante encontrado");
                        System.out.println(encontradoBuscar);
                    }else{
                        System.out.println("Estudiante no registrado");
                    }
                    break;

                case 5:
                    System.out.println("Lista de estudiantes registrados");

                    if(estudiantes.isEmpty()){
                        System.out.println("No hay estudiantes registrados");
                    }else{
                        for (Estudiante e: estudiantes){
                            System.out.println(e);
                        }
                    }
                    break;

                case 6:
                    System.out.println("Cupos disponibles por estilo de baile");

                    System.out.println("Hiphop: "+hiphop.cuposDisponibles());
                    System.out.println("Afrodance:"+ afrodance.cuposDisponibles());
                    System.out.println("Popping :"+ popping.cuposDisponibles());
                    System.out.println("Locking: "+ locking.cuposDisponibles());
                    System.out.println("Breaking: "+ breaking.cuposDisponibles());
                    break;

                case 7:
                    System.out.println("Cola de espera por estilo de baile");

                    System.out.println("\nHiphop:");
                    if(hiphop.cantidadEnEspera()>0){
                        hiphop.mostarEspera();
                    }else{
                        System.out.println("No hay estudiantes en espera");
                    }
                    System.out.println("\nAfrodance:");
                    if (afrodance.cantidadEnEspera()>0){
                        afrodance.mostarEspera();
                    }else{
                        System.out.println("Nohay estudiantes en espera");
                    }
                    System.out.println("\nPopping:");
                    if(popping.cantidadEnEspera()> 0){
                        popping.mostarEspera();
                    }else{
                        System.out.println("No hay estudiantes en espera");
                    }
                    System.out.println("\nLocking:");
                    if(locking.cantidadEnEspera()>0){
                        locking.mostarEspera();
                    }else{
                        System.out.println("No hay estudiantes en espera");
                    }
                    System.out.println("\nBreaking:");
                    if(breaking.cantidadEnEspera()>0){
                        breaking.mostarEspera();
                    }else{
                        System.out.println("No hay estudiantes en espera");
                    }
                    break;

                case 8:
                    System.out.println("Historial de acciones");
                    historial.mostrarHistorial();
                    break;

                case 9:
                    System.out.println("Deshacer ultima accion");

                    String accion = historial.deshacerAccion();

                    System.out.println(accion);
                    break;

                case 10:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 10);

        entrada.close();
    }

    // metodo para seleccionar la clase de baile
    public static DanceCls seleCls(
            int opcionEstilo,
            DanceCls hiphop,
            DanceCls afrodance,
            DanceCls popping,
            DanceCls locking,
            DanceCls breaking) {

        switch (opcionEstilo) {
            case 1:
                return hiphop;
            case 2:
                return afrodance;
            case 3:
                return popping;
            case 4:
                return locking;
            case 5:
                return breaking;
            default:
                return null;
        }
    }
}
