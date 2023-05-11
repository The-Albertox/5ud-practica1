package net.salesianos.hiperdino.utiles;
import java.util.Random;
public class GeneradorDeProductos {
    private static final String[] productos = {
        "destiny 2 dlc ¿? part ¿? dark and light saga taniks the final shape of  telesto and  the arquitects",
        "Camiseta",
        "Pantalón",
        "Zapatos",
        "Play station 69",
        "Gorra de algun videojuego para otakus",
        "Bufanda",
        "rtx 69.420 k ti remix epic edition from fornite ",
        "Perfume",
        "BFG or Big Freeking Goose",
        "Maquillaje",
        "Crema hidratante",
        "Almuhada de chica de anime",
      };
      
      public static String obtenerProductoAleatorio() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(productos.length);
        return productos[indiceAleatorio];
      }
}
