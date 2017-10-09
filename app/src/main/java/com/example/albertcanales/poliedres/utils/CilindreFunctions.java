package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class CilindreFunctions extends PoliedresFunctions {

    public CilindreFunctions() {
    }

    public float area(float radi, float altura) {
        return areaBase(radi) * 2 + areaLateral(radi, altura);
    }

    public float volum(float radi, float altura) {
        return areaBase(radi) * altura;
    }

    protected float areaBase(float radi) {
        return (float) Math.PI * radi * radi;
    }

    protected float areaLateral(float radi, float altura) {
        return (float) (2 * Math.PI * radi * altura);
    }
}