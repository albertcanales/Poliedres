package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class EsferaFunctions extends PoliedresFunctions {

    public EsferaFunctions() {
    }

    public float area(float radi) {
        return 4 * areaBase(radi);
    }

    public float volum(float radi) {
        return (float) (4 * Math.PI * radi * radi * radi) / 3;
    }

    protected float areaBase(float radi) {
        return (float) (Math.PI * radi * radi);
    }

}