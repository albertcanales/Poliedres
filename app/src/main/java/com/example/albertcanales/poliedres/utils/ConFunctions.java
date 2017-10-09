package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class ConFunctions extends PoliedresFunctions {

    public ConFunctions() {
    }

    public float area(float radi, float altura) {
        return areaBase(radi) + areaLateral(generatriu(radi, altura), radi);
    }

    public float volum(float radi, float altura) {
        return areaBase(radi) * altura / 3;
    }

    protected float areaBase(float radi) {
        return (float) Math.PI * radi * radi;
    }

    protected float areaLateral(float generatriu, float radi) {
        return (float) Math.PI * radi * generatriu;
    }

    protected float generatriu(float radi, float altura) {
        return (float) Math.sqrt(altura * altura + radi * radi);
    }
}