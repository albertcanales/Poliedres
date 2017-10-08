package com.example.albertcanales.poliedres.activities;

import android.os.Bundle;
import android.widget.EditText;

import com.example.albertcanales.poliedres.R;

public class EsferaActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        check();
    }

    protected void declareVariables() {
        EditText radiET = (EditText) findViewById(R.id.radi);

        String radiString = radiET.getText().toString();

        if (radiString.isEmpty())
            radiET.setError(getString(R.string.error_radi));

        if (!radiString.isEmpty()) {
            radi = Integer.parseInt(radiString);
        }
    }

    protected float getArea() {
        return poliedreFunctions.area(radi);
    }

    protected float getVolum() {
        return poliedreFunctions.volum(radi);
    }

    protected boolean hasMinimumSides() {
        return true;
    }
}
