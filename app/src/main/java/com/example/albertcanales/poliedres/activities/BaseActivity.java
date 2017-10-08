package com.example.albertcanales.poliedres.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.albertcanales.poliedres.R;
import com.example.albertcanales.poliedres.utils.PiramideFunctions;
import com.example.albertcanales.poliedres.utils.PrismaFunctions;
import com.example.albertcanales.poliedres.utils.PrismaPiramideFunctions;

public class BaseActivity extends AppCompatActivity {
    public static String POLIEDRE_KEY = "poliedre_key";
    public static String PRISMA_KEY = "prisma_key";
    public static String PIRAMIDE_KEY = "piramide_key";
    public static String CILINDRE_KEY = "cilindre_key";
    public static String CON_KEY = "con_key";

    protected PrismaPiramideFunctions poliedreFunctions;
    protected float altura;
    protected float radi;
    protected float longitudCostat;
    protected int numCostats;
    protected boolean areaChecked;
    protected boolean volumChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void check() {
        String stringExtra = getIntent().getStringExtra(POLIEDRE_KEY);
        if (stringExtra.equals(PRISMA_KEY)) {
            ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.prisma);
            poliedreFunctions = new PrismaFunctions();
        } else if (stringExtra.equals(PIRAMIDE_KEY)) {
            ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.piramide);
            poliedreFunctions = new PiramideFunctions();
        } else if (stringExtra.equals(CILINDRE_KEY)) {
            ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.cilindre);
            poliedreFunctions = new PrismaFunctions();
        } else if (stringExtra.equals(CON_KEY)) {
            ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.cono);
            poliedreFunctions = new PiramideFunctions();
        }
    }

    public void calcular(View view) {
        declareCheckBoxes();
        declareVariables();
        calculate();

    }

    protected void declareVariables() {
    }


    protected void declareCheckBoxes() {
        areaChecked = ((CheckBox) findViewById(R.id.areaCheckBox)).isChecked();
        volumChecked = ((CheckBox) findViewById(R.id.volumCheckBox)).isChecked();
        if (!areaChecked && !volumChecked) showToast(R.string.res_seleccionat);
    }

    protected void calculate() {
        if (hasMinimumSides()) {
            showToast(getString(R.string.toast_minim_costats));
            return;
        }

        if (areaChecked)
            showToast(getString(R.string.area_toast, Float.toString(poliedreFunctions.area(altura, numCostats, longitudCostat))));
        if (volumChecked)
            showToast(getString(R.string.volum_toast, Float.toString(poliedreFunctions.volum(altura, numCostats, longitudCostat))));
    }

    protected boolean hasMinimumSides() {
        return false;
    }

    void showToast(int text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
