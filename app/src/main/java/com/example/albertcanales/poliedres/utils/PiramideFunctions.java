package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class PiramideFunctions extends PoliedresFunctions {

    public PiramideFunctions() {
    }

    public float area(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) + areaLateral(altura, numCostats, longitudCostat);
    }

    public float volum(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) * altura / 3.0f;
    }

    protected float areaBase(int numCostats, float longitudCostat) {
        return (numCostats * (longitudCostat * longitudCostat)) / (float) (4 * Math.tan(Math.toRadians(180.0f / numCostats)));
    }

    protected float areaLateral(float altura, int numCostats, float longitudCostat) {
        return altura * longitudCostat * numCostats / 2.0f;
    }
}