package com.company;

import java.util.concurrent.Semaphore;

public class Ganador {
    private static final Semaphore ganador = new Semaphore(1, true);

    public Ganador() {
    }

    public static void primeraPos(Sonda sonda) throws InterruptedException {
        ganador.acquire();
        System.out.println(sonda.getNombre() + " HA SIDO EL PRIMERO EN ENCONTRAR UN PLANETA HABITABLE" );
    }
}