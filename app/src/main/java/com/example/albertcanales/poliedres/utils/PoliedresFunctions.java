package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert on 08/10/2017.
 */

public abstract class PoliedresFunctions {

    public float area(float radi) {
        return 0;
    }

    public float area(float radi, float altura) {
        return 0;
    }

    public float area(float altura, int numCostats, float longitudCostat) {
        return 0;
    }


    public float volum(float radi) {
        return 0;
    }

    public float volum(float radi, float altura) {
        return 0;
    }

    public float volum(float altura, int numCostats, float longitudCostat) {
        return 0;
    }


    protected float areaBase(float radi) {
        return 0;
    }

    protected float areaBase(int numCostats, float longitudCostat) {
        return 0;
    }


    protected float areaLateral(float altura, float radi) {
        return 0;
    }

    protected float areaLateral(float altura, int numCostats, float longitudCostat) {
        return 0;
    }

    protected float generatriu(float radi, float altura){return 0;}
}
