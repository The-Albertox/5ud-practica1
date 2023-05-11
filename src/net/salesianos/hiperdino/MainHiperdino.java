package net.salesianos.hiperdino;

import java.util.Scanner;

import net.salesianos.hiperdino.cajero.Cajero;
import net.salesianos.hiperdino.cliente.Cliente;

public class MainHiperdino {
    public static void main(String[] args) {
        boolean cajaAbierta = false;
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        Cajero cajero = new Cajero(null, null, 0, 0, null);
        while (!salir) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Abrir caja");
            System.out.println("2. Añadir nuevo cliente a la cola");
            System.out.println("3. Atender un cliente");
            System.out.println("4. Ver clientes pendientes");
            System.out.println("5. Cerrar supermercado");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (cajaAbierta) {
                        System.out.println("La caja ya estaba abierta.");
                    } else {
                        cajaAbierta = true;
                        System.out.println("La caja ha sido abierta.");
                    }
                    break;
                case 2:
                    if (!cajaAbierta) {
                        System.out.println("La caja está cerrada. No se puede añadir un nuevo cliente.");
                    } else {
                        Cliente nuevoCliente = nombreAleatorio();

                        System.out.println("Se ha añadido el siguiente cliente a la cola:");
                        System.out.println(nuevoCliente);
                    }
                    break;
                case 3:
                    if (Cajero.filaDeClientes.isEmpty()) {
                        System.out.println("No hay clientes pendientes.");
                    } else {
                        cajero.atenderCliente();
                    }
                    break;
                case 4:
                    System.out.println("Clientes pendientes en la cola de " + cajero.getNombre() + ":");
                    if (Cajero.filaDeClientes.isEmpty()) {
                        System.out.println("No hay clientes pendientes.");
                    } else {
                        for (Cliente cliente : Cajero.filaDeClientes) {
                            System.out.println(cliente);
                        }
                    }
                    break;
                case 5:
                    if (cajaAbierta) {
                        cajaAbierta = false;
                        System.out.println("La caja ha sido cerrada.");
                    } else {
                        System.out.println("La caja ya estaba cerrada.");
                    }
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        }
        scanner.close();
    }

    private static Cliente nombreAleatorio() {
        return null;
    }
}

