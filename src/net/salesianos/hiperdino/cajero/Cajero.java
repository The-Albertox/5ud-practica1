package net.salesianos.hiperdino.cajero;

import java.util.Queue;

import net.salesianos.hiperdino.cliente.Cliente;

import java.util.List;
import java.util.Stack;

public class Cajero {
    private String nombre;
    public static Queue<Cliente> filaDeClientes;
    private int numCaja;
    private int numClientes;
    private List<String> listaClientes;

    public Cajero(String nombre, Queue<Cliente> filaDeClientes, int numCaja, int numClientes, List<String> listaClientes) {
        this.nombre = nombre;
        this.filaDeClientes = filaDeClientes;
        this.numCaja = numCaja;
        this.numClientes = numClientes;
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarCliente(Cliente cliente) {
        filaDeClientes.offer(cliente);
        System.out.println(cliente.getNombre() + " ha entrado en la fila para ser atendido por " + nombre + ".");
    }

    public void atenderCliente() {
        if (!filaDeClientes.isEmpty()) {
            Cliente cliente = filaDeClientes.poll();
            System.out.println(nombre + " ha atendido a " + cliente.getNombre() + ".");
        } else {
            System.out.println("No hay clientes en la fila de " + nombre + ".");
        }
    }

    public void mostrarFila() {
        System.out.println("Fila de " + nombre + ":");
        for (Cliente cliente : filaDeClientes) {
            System.out.println(cliente.getNombre());
        }
    }

    public void vaciarFila() {
        filaDeClientes.clear();
        System.out.println("La fila de " + nombre + " ha sido vaciada.");
    }

    @Override
    public String toString() {
        Stack<String> stack = new Stack<>();
        stack.push("===================================");
        stack.push("* Clientes en la fila:");
        for (String cliente : this.listaClientes) {
            stack.push(cliente);
        }
        stack.push("* Total de clientes: " + this.numClientes);
        stack.push("* Número de caja: " + this.numCaja + ":");
        stack.push("Cajero");
     return toString();
    }
}
