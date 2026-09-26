package Parcial1;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Crear un objetos Peliculas- pero ahora con arreglos
        Peliculas[] peliculas = new Peliculas[10];
        Funciones[][] funciones = new Funciones[3][3];
        int opcion;
        int cPeliculas = 0;

        // creamos el do while para que el menu se repita hasta que el usuario decida salir

        do {
            System.out.println("===========CINEMASTAR===============");
            System.out.println("1. Acceso al menu de creacion de  peliculas");
            System.out.println("2. Acesso al menu de funciones");
            System.out.println("3. Acceso al menu de entradas");
            System.out.println("4. salir");
            System.out.println("ingrese una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) { // creamos el switch para que el usuario pueda elegir la opcion que desee

                case 1: //lo hicimos primero de este modo para confirmar que funcionara
                    int opcionPeliculas;

                    do{

                        System.out.println("===========MENU DE PELICULAS===============");
                        System.out.println("1. Mostrar Peliculas");
                        System.out.println("2. Añadir peliculas");
                        System.out.println("3. Regresar");
                        System.out.println("Ingresa una opcion");

                        opcionPeliculas = entrada.nextInt();

                        switch (opcionPeliculas) {
                            case 1:
                                if(cPeliculas == 0){
                                System.out.println("No hay peliculas registradas");
                                }else{
                                    for(int i = 0; i<cPeliculas; i++){
                                        System.out.println("pelicula"+(i + 1));
                                        peliculas[i].mostrarDatos();
                                    }
                                }
                                break;
                                //ahora si agregamos lo que teniamos de crear peliculas
                            case 2:
                                System.out.println("Ingresa el nombre de la pelicula");
                                String nombre = entrada.next();

                                System.out.println("Ingresa el idioma de la pelicula");
                                String idioma = entrada.next();

                                System.out.println("Ingresa el tipo de pelicula");
                                String tipo = entrada.next();

                                System.out.println("Ingresa la duracion de la pelicula");
                                int duracion = entrada.nextInt();

                                peliculas[cPeliculas]= new Peliculas(nombre, idioma, tipo, duracion);

                                cPeliculas++;

                                System.out.println("pelicula creada con exito");
                                break;
                            case 3:
                                break;

                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }

                    }while (opcionPeliculas !=3);
                    break;

                case 2:
                    System.out.println("=======Menu Funciones=======");

                    //Aqui basicamente lo que busco con este if, es verificar si el 
                    //usuario ya registro al menos una pelicula.
                    if (cPeliculas ==0) {
                        System.out.println("Primero debes registras al menos una pelicula");
                        break;
                        
                    }


                    //Menu para seleccionar la sala deseada 
                    System.out.println("Selecciona tu sala:");
                    System.out.println("1) Sala 1 (General y Preferencial |No Disponibilidad 3D|)");
                    System.out.println("2) Sala 2 (General y Preferencial |No Disponibilidad 3D|)");
                    System.out.println("3) Sala 3 (General y Preferencial |Solo Disponibilidad 3D|)");
                    System.out.println("Ingresa el numero de la sala 1-3: ");
                    int numSala= entrada.nextInt();
                    //Aqui lo que hacemos es  validar si el usuario dio un numero permitido entre el 1 y 3.
                    if (numSala < 1 || numSala > 3) {
                        System.out.println("Numero de la sala no valida.");
                        break;
                    }

                    //Creamos como el menu para solicitar en que horario quiere a funcion
                    System.out.println("Selecciona el horario deseado:");
                    System.out.println("1) 14:00 a 16:30");
                    System.out.println("2) 16:30 a 19:00");
                    System.out.println("3) 19:00 a 21:00");
                    System.out.println("Ingrese opcion de horario 1-3: ");
                    int numHorario = entrada.nextInt();

                    if (numHorario < 1 || numHorario > 3) {
                        System.out.println("Opcion no valida");
                        break;
                        
                    }
                    
                    /* Aqui lo que voy a hacer es no permitir que coloque
                    una pelicula en un horario en la que ya hay otra pelicula
                    entonces primero  toca restarle 1 a numSala y NumHorario, con la
                    finalidad de que se dapte a los numeros de nuetra matriz*/
                    if (funciones[numSala - 1][numHorario - 1] != null) {
                        //si la casilla de la matriz no es null o vacia, esto nos da a entender 
                        // que ya tenemos una pelicula con ese horario estipulado
                        System.out.println("Ya existe una pelicula programada en la sala  " + numSala + "para ese horario" );

                        break;
                        
                    }

                    //Aqui mostraremos la pelicula registrada para seleccionar cual asigar
                    System.out.println("Catalogo de peliculas");
                    for (int i = 0; i < cPeliculas; i++) {
                        System.out.println((i + 1) + ". " + peliculas[i].getNombre() + " (" + peliculas[i].getTipo() + ")");
                        // mostramos el numer ode la pelicula junto al nombre y el formato

                        
                    }
                    System.out.println("Seleccione el numero de la pelicula a asignar: ");
                    int peSelec = entrada.nextInt(); 
                    
                    if (peSelec < 1 || peSelec >3) {
                        System.out.println("Opcion no valida");
                        break;
                        
                    }

                    Peliculas peliculasSeleccionada= peliculas[peSelec - 1];
                    //basicamente obtenemos el objeto peliculas que nos de el usuario y lo 
                    // guardamos en una variable de tipo auxiliar
                   
                    if ((numSala == 1 || numSala == 2) && peliculasSeleccionada.getTipo().equalsIgnoreCase("3D")) {
                        System.out.println("Las Salas 1 y 2 no pueden proyectar pelicuals en 3D...");
                        /* Aqui lo que hacemos es validar que las salas 1 y 2 no permitan peliculas 3D*/
                       break;
                    }

                    if (numSala == 3 && !peliculasSeleccionada.getTipo().equalsIgnoreCase("3D")) {
                        System.out.println("La sala 3 solo puede proyectar peliculas en 3D...");
                        // lo mismo que antes validamos que la sala 3 solo permita formato 3D

                        break;
                    }
                   
                    //Aqui el horario que era tipo numerico lo convertimos a un tipo texto para guardala
                    String opcHora= "";
                    if (numHorario ==1) {
                        opcHora="14:00 - 16:30";

                        
                    }
                    if (numHorario == 2) {
                        opcHora="16:30 - 19:00";
                        
                    }
                    if (numHorario == 3) {
                        opcHora="19:00 - 21:00";
                        
                    }

                    funciones[numSala - 1][numHorario - 1] = new Funciones(peliculasSeleccionada, numSala, opcHora);
                    //guardamos el objeto en la nuestra matriz de funciones

                    System.out.println("===Funcion Asignada Con Exito===");
                    System.out.println("Pelicula: " + peliculasSeleccionada.getNombre() + " | Sala " + numSala + "| Horario: " + opcHora);
                   
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    break;

                default:

            }

        } while (opcion != 4);
    }
}
//comenzamos a trabajar desde visual studio por problemas en github