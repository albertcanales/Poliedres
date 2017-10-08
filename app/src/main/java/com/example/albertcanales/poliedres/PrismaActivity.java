package com.example.albertcanales.poliedres;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class PrismaActivity extends AppCompatActivity {
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
        if (!declareVariables() && AreaVolum != 0){
            calculate();
        }
    }

    boolean declareVariables() {
        boolean error = false;
        EditText alturaCheckBox = (EditText) findViewById(R.id.Altura);
        EditText numCostatsCheckBox = (EditText) findViewById(R.id.NumCostats);
        EditText longitudCostatCheckBox = (EditText) findViewById(R.id.LongitudCostat);
        if (alturaCheckBox.getText().toString().isEmpty()
                || numCostatsCheckBox.getText().toString().isEmpty()
                || longitudCostatCheckBox.getText().toString().isEmpty()) {
            ShowToast("Falten dades!");
            error = true;
        } else {
            altura = Integer.parseInt(alturaCheckBox.getText().toString());
            numCostats = Integer.parseInt(numCostatsCheckBox.getText().toString());
            longitudCostat = Integer.parseInt(longitudCostatCheckBox.getText().toString());
            if(numCostats < 3 || altura <= 0 || longitudCostat <= 0) {
                ShowToast("Les dades no són corretes!");
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
        }
        else if (!areaCheckBox.isChecked() && volumCheckBox.isChecked()) {
            AreaVolum = 2;
        }
        else if (areaCheckBox.isChecked() && volumCheckBox.isChecked()) {
            AreaVolum = 3;
        }
        else {
            ShowToast("No has seleccionat res!");
            AreaVolum = 0;
        }

    }

    void calculate() {
        switch(AreaVolum) {
            case 1:
                area = PrismaFunctions.area(altura, numCostats, longitudCostat);
                ShowToast(String.format("Area = %s", Float.toString(area)));
                break;
            case 2:
                volum = PrismaFunctions.volum(altura, numCostats, longitudCostat);
                ShowToast(String.format("Volum = %s", Float.toString(volum)));
                break;
            case 3:
                area = PrismaFunctions.area(altura, numCostats, longitudCostat);
                ShowToast(String.format("Area = %s", Float.toString(area)));
                volum = PrismaFunctions.volum(altura, numCostats, longitudCostat);
                ShowToast(String.format("Volum = %s", Float.toString(volum)));
                break;

        }
    }

    void ShowToast(String text) {
        toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }
}

