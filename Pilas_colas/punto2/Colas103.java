package Pilas_colas.punto2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas103 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // COLA DE LOS 25 CARRITOS
        Queue<Integer> carritos = new LinkedList<>();

        // COLAS DE LAS TRES CAJAS
        Queue<Integer> caja1 = new LinkedList<>();
        Queue<Integer> caja2 = new LinkedList<>();
        Queue<Integer> caja3 = new LinkedList<>();

        // CLIENTES QUE ESPERAN UN CARRITO
        Queue<Integer> espera = new LinkedList<>();

        // INICIALIZAR LOS CARRITOS
        for (int i = 1; i <= 25; i++) {
            carritos.offer(i);
        }

        int opcion, cliente = 1;
        int carrito;
        int[] carritoCliente = new int[1000];

        do {
            System.out.println("1. Llega un cliente");
            System.out.println("2. Termina de comprar");
            System.out.println("3. Paga en caja");
            System.out.println("0. Salir");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    if (!carritos.isEmpty()) {
                        carrito = carritos.poll();
                        carritoCliente[cliente] = carrito;
                        System.out.println("Cliente " + cliente
                                + " recibe carrito " + carrito);
                    } else {
                        espera.offer(cliente);
                        System.out.println("Cliente espera un carrito");
                    }
                    cliente++;
                    break;

                case 2:
                    System.out.print("Numero del cliente: ");
                    int c = leer.nextInt();

                    if (c > 0 && c < cliente
                            && carritoCliente[c] != 0) {

                        if (caja1.size() <= caja2.size()
                                && caja1.size() <= caja3.size()) {
                            caja1.offer(c);
                        } else if (caja2.size() <= caja3.size()) {
                            caja2.offer(c);
                        } else {
                            caja3.offer(c);
                        }

                    } else {
                        System.out.println("Cliente no valido");
                    }
                    break;

                case 3:
                    System.out.print("Caja (1, 2 o 3): ");
                    int caja = leer.nextInt();
                    int atendido = 0;

                    if (caja == 1 && !caja1.isEmpty()) {
                        atendido = caja1.poll();
                    } else if (caja == 2 && !caja2.isEmpty()) {
                        atendido = caja2.poll();
                    } else if (caja == 3 && !caja3.isEmpty()) {
                        atendido = caja3.poll();
                    }

                    if (atendido != 0) {
                        carritos.offer(carritoCliente[atendido]);
                        carritoCliente[atendido] = 0;

                        if (!espera.isEmpty()) {
                            int esperando = espera.poll();
                            carrito = carritos.poll();
                            carritoCliente[esperando] = carrito;
                            System.out.println("Cliente " + esperando
                                    + " recibe carrito " + carrito);
                        }
                    }
                    break;
            }

        } while (opcion != 0);

        leer.close();
    }
}
