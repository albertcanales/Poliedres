package com.example.albertcanales.poliedres.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.albertcanales.poliedres.R;
import com.example.albertcanales.poliedres.utils.CilindreFunctions;
import com.example.albertcanales.poliedres.utils.ConFunctions;
import com.example.albertcanales.poliedres.utils.EsferaFunctions;
import com.example.albertcanales.poliedres.utils.PiramideFunctions;
import com.example.albertcanales.poliedres.utils.PoliedresFunctions;
import com.example.albertcanales.poliedres.utils.PrismaFunctions;

public class BaseActivity extends AppCompatActivity {
    public static final String POLIEDRE_KEY = "poliedre_key";
    public static final String PRISMA_KEY = "prisma_key";
    public static final String PIRAMIDE_KEY = "piramide_key";
    public static final String CILINDRE_KEY = "cilindre_key";
    public static final String CON_KEY = "con_key";
    public static final String ESFERA_KEY = "esfera_key";

    protected PoliedresFunctions poliedreFunctions;
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
        switch (getIntent().getStringExtra(POLIEDRE_KEY)) {
            case PRISMA_KEY:
                ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.prisma);
                poliedreFunctions = new PrismaFunctions();
                break;
            case PIRAMIDE_KEY:
                ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.piramide);
                poliedreFunctions = new PiramideFunctions();
                break;
            case CILINDRE_KEY:
                ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.cilindre);
                poliedreFunctions = new CilindreFunctions();
                break;
            case CON_KEY:
                ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.cono);
                poliedreFunctions = new ConFunctions();
                break;
            case ESFERA_KEY:
                ((ImageView) findViewById(R.id.imatge)).setImageResource(R.drawable.esfera);
                poliedreFunctions = new EsferaFunctions();
                break;
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
        if (!hasMinimumSides()) {
            showToast(getString(R.string.toast_minim_costats));
            return;
        }

        if (areaChecked) showToast(getString(R.string.area_toast, Float.toString(getArea())));
        if (volumChecked) showToast(getString(R.string.volum_toast, Float.toString(getVolum())));
    }

    protected float getArea() {
        return poliedreFunctions.area(altura, numCostats, longitudCostat);
    }

    protected float getVolum() {
        return poliedreFunctions.volum(altura, numCostats, longitudCostat);
    }

    protected boolean hasMinimumSides() {
        return true;
    }

    void showToast(int text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    void showToast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
