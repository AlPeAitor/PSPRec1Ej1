package com.company;

import java.lang.Thread;
import java.util.Random;

public class Sonda extends Thread{

    private String nombre = "";
    final int TARDANZAMINIMA = 3000;
    final int TARDANZAMAXIMA = 6000-TARDANZAMINIMA;

    public void run(){
        Random r = new Random();
        try {
            int lanzamiento = 0;
            int intentos = 0;
            boolean terminar = false;
            do {
                lanzamiento = r.nextInt(TARDANZAMAXIMA)+TARDANZAMINIMA;
                sleep((long) lanzamiento);
                Planeta p = new Planeta();
                System.out.println(this.getNombre() + " se desplaza al siguiente planeta, pues este no es habitable");
                intentos = intentos +1;
                terminar = p.getHabitable();
            }while(intentos<3 && !terminar);

            if (terminar){
                Ganador.primeraPos(this);
            }else System.out.println(this.getNombre() + " se ha quedado sin combustible y no puede continuar");


        }catch(InterruptedException var9){
            var9.printStackTrace();
        }
    }

    public void setNombre (String x){
        this.nombre = x;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean planetaHabitadoEncontrado(Planeta x){
        if (x.getHabitable()){
            return true;
        }else return false;
    }
}
