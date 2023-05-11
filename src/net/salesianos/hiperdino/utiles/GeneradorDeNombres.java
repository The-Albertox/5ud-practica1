package net.salesianos.hiperdino.utiles;

import java.util.Random;

public class GeneradorDeNombres {
    private static final String[] NOMBRES = {"Juan", "María", "Pedro", "Ana", "Luis", "Sofía", "Jorge Jorge in the jungle", "Lau", "Carlos", "Lucy", "Diana", "Alberto", "Miguel", "Isabel", "Pablo", "Elena", "Rafael", "Clara", "Antonio", "Marta"};

    public static String nombreAleatorio() {
        Random rand = new Random();
        return NOMBRES[rand.nextInt(NOMBRES.length)];
    }
}