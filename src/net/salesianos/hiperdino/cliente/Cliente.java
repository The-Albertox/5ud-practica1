package net.salesianos.hiperdino.cliente;

import java.util.Stack;

import net.salesianos.hiperdino.utiles.GeneradorDeNombres;;

public class Cliente {

private String nombre;
    private Stack<String> cestaDeCompra;

    public Cliente() {
        this.nombre = GeneradorDeNombres.nombreAleatorio();
        this.cestaDeCompra = new Stack<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarProducto(String producto) {
        cestaDeCompra.push(producto);
    }

    public void mostrarCesta() {
        System.out.println("Cesta de " + nombre + ":");
        for (String producto : cestaDeCompra) {
            System.out.println(producto);
        }
    }

    public void vaciarCesta() {
        cestaDeCompra.clear();
        System.out.println("La cesta de " + nombre + " ha sido vaciada.");
    }

    @Override
public String toString() {
    Stack<String> pila = new Stack<>();
    pila.push("===================================\n");
    pila.push("Lista de artículos en la cesta:\n");
    for (String articulo : this.cestaDeCompra) {
        pila.push(articulo + "\n");
    }
    pila.push("* Nombre: " + this.nombre + "\n");
    return toString();
}
}
