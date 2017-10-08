package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class ConFunctions extends PoliedresFunctions {

    public ConFunctions() {
    }

    public float area(float radi, float altura) {
        return 0;
    }

    public float volum(float radi, float altura) {
        return 0;
    }

    protected float areaBase(float radi) {
        return (float) Math.PI * radi * radi;
    }

    protected float areaLateral(float altura, int numCostats) {
        return 0;
    }
}