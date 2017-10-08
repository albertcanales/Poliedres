package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class PrismaFunctions extends PrismaPiramideFunctions {

    public PrismaFunctions() {
    }

    public float volum(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) * altura;
    }

    public float area(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) * 2 + areaLateral(altura, numCostats, longitudCostat);
    }

    public float areaLateral(float altura, int numCostats, float longitudCostat) {
        return altura * longitudCostat * numCostats;
    }
}