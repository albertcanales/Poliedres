package com.example.albertcanales.poliedres.activities;

import android.os.Bundle;
import android.widget.EditText;

import com.example.albertcanales.poliedres.R;

public class CilindreConActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindre_con);
        check();
    }

    protected void declareVariables() {
        EditText alturaET = (EditText) findViewById(R.id.altura);
        EditText radiET = (EditText) findViewById(R.id.radi);

        String alturaString = alturaET.getText().toString();
        String radiString = radiET.getText().toString();

        if (alturaET.getText().toString().isEmpty())
            alturaET.setError(getString(R.string.error_altura));
        if (radiString.isEmpty())
            radiET.setError(getString(R.string.error_radi));

        if (!alturaString.isEmpty() && !radiString.isEmpty()) {
            altura = Integer.parseInt(alturaString);
            radi = Integer.parseInt(radiString);
        }
    }

    protected float getArea() {
        return poliedreFunctions.area(radi, altura);
    }

    protected float getVolum() {
        return poliedreFunctions.volum(radi, altura);
    }

    protected boolean hasMinimumSides() {
        return true;
    }
}
