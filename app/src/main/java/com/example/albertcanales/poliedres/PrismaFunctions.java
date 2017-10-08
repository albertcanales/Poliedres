package com.example.albertcanales.poliedres;

/**
 * Created by Albert Canales on 03/10/2017.
 */

public class PrismaFunctions {
    public float Area = 6;
    public float Volum;

    static float volum(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) * altura;
    }

    static float area(float altura, int numCostats, float longitudCostat) {
        return areaBase(numCostats, longitudCostat) * 2 + areaLateral(altura, numCostats, longitudCostat);
    }

    static float areaBase(int numCostats, float longitudCostat) {
        return (numCostats * (longitudCostat * longitudCostat)) / (float)(4* Math.tan(Math.toRadians(180.0f/numCostats)));
    }

    static float areaLateral(float altura, int numCostats, float longitudCostat) {
        return altura * longitudCostat * numCostats;
    }
}



// apotema = b/(2*tan(180/n))
