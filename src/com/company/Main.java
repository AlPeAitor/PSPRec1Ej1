package com.company;

import java.util.Random;
import java.lang.Thread;
public class Main {



    public static void main(String[] args) {

        final int PAISES = 5;


        for (int i = 1; i < PAISES+1; i++){
            Sonda s = new Sonda();
            s.setNombre("Sonda del país " + i);
            s.start();
        }


    }

}
