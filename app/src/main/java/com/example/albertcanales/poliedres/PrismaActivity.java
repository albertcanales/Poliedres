package com.example.albertcanales.poliedres;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class PrismaActivity extends BaseActivity {
    PrismaFunctions prismaFunctions = new PrismaFunctions();
    Toast toast;
    float altura;
    float longitudCostat;
    int numCostats;
    int AreaVolum;
    float area;
    float volum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);
    }

    public void calcular(View view) {
        declareCheckBoxes();
        if (!declareVariables() && AreaVolum != 0) {
            calculate();
        }
    }

    boolean declareVariables() {
        boolean error = false;
        String alturaCheckBox = ((EditText) findViewById(R.id.Altura)).getText().toString();
        String numCostatsCheckBox = ((EditText) findViewById(R.id.NumCostats)).getText().toString();
        String longitudCostatCheckBox = ((EditText) findViewById(R.id.LongitudCostat)).getText().toString();
        if (alturaCheckBox.isEmpty() || numCostatsCheckBox.isEmpty() || longitudCostatCheckBox.isEmpty()) {
            showToast("Falten dades!");
            error = true;
        } else {
            altura = Integer.parseInt(alturaCheckBox);
            numCostats = Integer.parseInt(numCostatsCheckBox);
            longitudCostat = Integer.parseInt(longitudCostatCheckBox);
            if (numCostats < 3 || altura <= 0 || longitudCostat <= 0) {
                showToast("Les dades no són corretes!");
                error = true;
            }
        }
        return error;

    }

    void declareCheckBoxes() {  // 0 = None, 1 = Area, 2 = Volum, 3 = Both
        CheckBox areaCheckBox = (CheckBox) findViewById(R.id.AreaCheckBox);
        CheckBox volumCheckBox = (CheckBox) findViewById(R.id.VolumCheckBox);

        if (areaCheckBox.isChecked() && !volumCheckBox.isChecked()) {
            AreaVolum = 1;
        } else if (!areaCheckBox.isChecked() && volumCheckBox.isChecked()) {
            AreaVolum = 2;
        } else if (areaCheckBox.isChecked() && volumCheckBox.isChecked()) {
            AreaVolum = 3;
        } else {
            showToast("No has seleccionat res!");
            AreaVolum = 0;
        }

    }

    void calculate() {
        switch (AreaVolum) {
            case 1:
                area = PrismaFunctions.area(altura, numCostats, longitudCostat);
                showToast(String.format("Area = %s", Float.toString(area)));
                break;
            case 2:
                volum = PrismaFunctions.volum(altura, numCostats, longitudCostat);
                showToast(String.format("Volum = %s", Float.toString(volum)));
                break;
            case 3:
                area = PrismaFunctions.area(altura, numCostats, longitudCostat);
                showToast(String.format("Area = %s", Float.toString(area)));
                volum = PrismaFunctions.volum(altura, numCostats, longitudCostat);
                showToast(String.format("Volum = %s", Float.toString(volum)));
                break;

        }
    }
}

