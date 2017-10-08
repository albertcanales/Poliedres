package com.example.albertcanales.poliedres.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.albertcanales.poliedres.utils.PiramideFunctions;
import com.example.albertcanales.poliedres.utils.PrismaFunctions;
import com.example.albertcanales.poliedres.utils.PrismaPiramideFunctions;
import com.example.albertcanales.poliedres.R;


public class PrismaPiramideActivity extends BaseActivity {
    public static String PRISMA_PIRAMIDE_KEY = "prisma_piramide_key";
    public static String PRISMA_KEY = "prisma_key";
    public static String PIRAMIDE_KEY = "piramide_key";

    private PrismaPiramideFunctions prismaPiramideFunctions;
    private float altura;
    private float longitudCostat;
    private int numCostats;
    private boolean areaChecked;
    private boolean volumChecked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma_piramide);
        String stringExtra = getIntent().getStringExtra(PRISMA_PIRAMIDE_KEY);
        if (stringExtra.equals(PRISMA_KEY)) {
            ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.prisma);
            prismaPiramideFunctions = new PrismaFunctions();
        } else if (stringExtra.equals(PIRAMIDE_KEY)) {
            ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.piramide);
            prismaPiramideFunctions = new PiramideFunctions();
        }
    }

    public void calcular(View view) {
        declareCheckBoxes();
        declareVariables();
        calculate();

    }

    private void declareVariables() {
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

    private void declareCheckBoxes() {
        areaChecked = ((CheckBox) findViewById(R.id.areaCheckBox)).isChecked();
        volumChecked = ((CheckBox) findViewById(R.id.volumCheckBox)).isChecked();
        if (!areaChecked && !volumChecked) showToast(R.string.res_seleccionat);
    }

    private void calculate() {
        if (hasMinimumSides()) {
            showToast(getString(R.string.toast_minim_costats));
            return;
        }

        if (areaChecked)
            showToast(getString(R.string.area_toast, Float.toString(prismaPiramideFunctions.area(altura, numCostats, longitudCostat))));
        if (volumChecked)
            showToast(getString(R.string.volum_toast, Float.toString(prismaPiramideFunctions.volum(altura, numCostats, longitudCostat))));
    }

    private boolean hasMinimumSides() {
        return numCostats < 3;
    }
}

