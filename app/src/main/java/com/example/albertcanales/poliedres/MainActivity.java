package com.example.albertcanales.poliedres;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void comencat(View v) {
        EditText password = (EditText) findViewById(R.id.password);
        String contrasenya = password.getText().toString();
        TextView error = (TextView) findViewById(R.id.error);
        Intent intent = new Intent(this, MenuActivity.class);
        if (contrasenya.equals("a")) {
            error.setTextColor(Color.GREEN);
            error.setText("El usuari és correcte");
            startActivity(intent);
        } else {
            error.setTextColor(Color.RED);
            error.setText("El usuari no és correcte");
        }
    }
}
