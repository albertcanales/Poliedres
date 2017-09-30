package com.example.albertcanales.poliedres;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Prisma extends AppCompatActivity {
    Toast toast;
    float altura;
    float longitudCostat;
    int numCostats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);

    }

    public void Calcular(View view) {
        declareVariables();

        if (numCostats < 3) {
            ShowToast("El nombre de costats no es correcte");
        } else {
            ShowToast("Encara no ho se fer :P");
        }
    }

    void declareVariables() {
        EditText alturaCheckBox = (EditText) findViewById(R.id.Altura);
        EditText numCostatsCheckBox = (EditText) findViewById(R.id.NumCostats);
        EditText longitudCostatCheckBox = (EditText) findViewById(R.id.LongitudCostat);
        if (alturaCheckBox.getText().toString().isEmpty()
                || numCostatsCheckBox.getText().toString().isEmpty()
                || longitudCostatCheckBox.getText().toString().isEmpty()) {
            ShowToast("Falten dades!");
        } else {
            ShowToast("You entered the matrix!");
            altura = Integer.parseInt(alturaCheckBox.getText().toString());
            numCostats = Integer.parseInt(numCostatsCheckBox.getText().toString());
            longitudCostat = Integer.parseInt(longitudCostatCheckBox.getText().toString());
        }

    }

    void ShowToast(String text) {
        toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }
}

