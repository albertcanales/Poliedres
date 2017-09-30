package com.example.albertcanales.poliedres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Piramide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramide);
    }

    public void piramide(View view) {
        Intent intent = new Intent(this, Piramide.class);
        startActivity(intent);
    }
}
