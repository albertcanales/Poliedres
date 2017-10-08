package com.example.albertcanales.poliedres;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class PiramideFunctions extends PrismaPiramideFunctions {

    public PiramideFunctions() {
    }

    public float volum(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) * altura / 3.0f;
    }

    public float area(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) + areaLateral(altura, numCostats, longitudCostat);
    }

    public float areaLateral(float altura, int numCostats, float longitudCostat) {
        return altura * longitudCostat * numCostats / 2.0f;
    }
}