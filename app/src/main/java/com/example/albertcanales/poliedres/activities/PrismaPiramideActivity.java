package com.example.albertcanales.poliedres.activities;

import android.os.Bundle;
import android.widget.EditText;

import com.example.albertcanales.poliedres.R;


public class PrismaPiramideActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma_piramide);
        check();
    }

    protected void declareVariables() {
        EditText alturaET = (EditText) findViewById(R.id.altura);
        EditText numCostatsET = (EditText) findViewById(R.id.numCostats);
        EditText longitudCostatsET = (EditText) findViewById(R.id.longitudCostat);

        String alturaString = alturaET.getText().toString();
        String numCostatsString = numCostatsET.getText().toString();
        String longitudCostatsString = longitudCostatsET.getText().toString();

        if (alturaET.getText().toString().isEmpty())
            alturaET.setError(getString(R.string.error_altura));
        if (numCostatsString.isEmpty())
            numCostatsET.setError(getString(R.string.error_num_costats));
        if (longitudCostatsString.isEmpty())
            longitudCostatsET.setError(getString(R.string.error_longitud_costats));

        if (!alturaString.isEmpty() && !numCostatsString.isEmpty() && !longitudCostatsString.isEmpty()) {
            altura = Integer.parseInt(alturaString);
            numCostats = Integer.parseInt(numCostatsString);
            longitudCostat = Integer.parseInt(longitudCostatsString);
        }
    }


    protected boolean hasMinimumSides() {
        return numCostats >= 3;
    }
}

