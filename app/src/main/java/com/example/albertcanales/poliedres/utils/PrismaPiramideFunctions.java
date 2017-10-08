package com.example.albertcanales.poliedres.utils;

/**
 * Created by Albert on 08/10/2017.
 */

public abstract class PrismaPiramideFunctions {

    public float areaBase(int numCostats, float longitudCostat) {
        return (numCostats * (longitudCostat * longitudCostat)) / (float) (4 * Math.tan(Math.toRadians(180.0f / numCostats)));
    }

    public abstract float volum(float altura, int numCostats, float longitudCostat);

    public abstract float area(float altura, int numCostats, float longitudCostat);

    public abstract float areaLateral(float altura, int numCostats, float longitudCostat);
}
