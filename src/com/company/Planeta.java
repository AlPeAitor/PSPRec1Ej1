package com.company;

import java.util.Random;

public class Planeta {

    static final int probHabitable = 4; //25%

    public Planeta(){

    }
    Random r = new Random();
    private String nombre ="";
    private int coordX = r.nextInt();
    private int coordY = r.nextInt();
    private int coordZ = r.nextInt();
    private boolean habitable=r.nextInt(probHabitable)==0;

    public void setNombre(String x){
        this.nombre= x;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean getHabitable(){
        return habitable;
    }

    public int getCoordX(){
        return coordX;
    }

    public int getCoordY(){
        return coordY;
    }

    public int getCoordZ(){
        return coordZ;
    }
}