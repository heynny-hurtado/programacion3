
package proyectoFinal.clases;

public class Campus {

    // creamos los atributos
    private String[] edificios;
    private int[][] matrizDistancias;

    // constructor
    public Campus(String[] edificios) {

        if (edificios == null || edificios.length < 5) {
            throw new IllegalArgumentException(
                    "El campus debe tener minimo 5 edificios");
        }

        this.edificios = edificios;
        this.matrizDistancias = new int[edificios.length][edificios.length];
    }

    // buscar un edificio
    private int buscarEdificio(String nombre) {

        for (int i = 0; i < edificios.length; i++) {

            if (edificios[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }

        return -1;
    }

    // agregar una conexion entre edificios
    public void agregarConexion(String origen, String destino, int distancia) {

        int i = buscarEdificio(origen);
        int j = buscarEdificio(destino);

        if (i == -1 || j == -1) {
            throw new IllegalArgumentException(
                    "Uno de los edificios no existe");
        }

        if (i == j || distancia <= 0) {
            throw new IllegalArgumentException(
                    "La conexion no es valida");
        }

        matrizDistancias[i][j] = distancia;
        matrizDistancias[j][i] = distancia;

        System.out.println("Conexion agregada correctamente");
    }

    // algoritmo de Dijkstra
    public void encontrarRuta(String origen, String destino) {

        int inicio = buscarEdificio(origen);
        int fin = buscarEdificio(destino);

        if (inicio == -1 || fin == -1) {
            System.out.println("El edificio no existe");
            return;
        }

        int cantidad = edificios.length;

        int[] distancias = new int[cantidad];
        boolean[] visitados = new boolean[cantidad];
        int[] anterior = new int[cantidad];

        // inicializamos los arreglos
        for (int i = 0; i < cantidad; i++) {
            distancias[i] = Integer.MAX_VALUE;
            anterior[i] = -1;
        }

        distancias[inicio] = 0;

        // recorremos los edificios
        for (int i = 0; i < cantidad; i++) {

            int actual = -1;
            int menor = Integer.MAX_VALUE;

            // buscamos el edificio con menor distancia
            for (int j = 0; j < cantidad; j++) {

                if (!visitados[j] && distancias[j] < menor) {
                    menor = distancias[j];
                    actual = j;
                }
            }

            if (actual == -1) {
                break;
            }

            visitados[actual] = true;

            // revisamos los edificios vecinos
            for (int j = 0; j < cantidad; j++) {

                int distancia = matrizDistancias[actual][j];

                if (distancia > 0 && !visitados[j]) {

                    int nuevaDistancia = distancias[actual] + distancia;

                    if (nuevaDistancia < distancias[j]) {
                        distancias[j] = nuevaDistancia;
                        anterior[j] = actual;
                    }
                }
            }
        }

        // verificamos si existe una ruta
        if (distancias[fin] == Integer.MAX_VALUE) {
            System.out.println("No existe una ruta entre los edificios");
            return;
        }

        // reconstruimos el camino
        int[] camino = new int[cantidad];
        int total = 0;

        for (int actual = fin; actual != -1; actual = anterior[actual]) {

            camino[total] = actual;
            total++;
        }

        // mostramos la ruta completa
        System.out.println("Ruta mas corta:");

        for (int i = total - 1; i >= 0; i--) {

            System.out.print(edificios[camino[i]]);

            if (i > 0) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
        System.out.println(
                "Distancia total: " + distancias[fin] + " metros");
    }
}
