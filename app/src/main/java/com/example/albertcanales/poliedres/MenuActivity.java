package com.example.albertcanales.poliedres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void prisma(View view) {
        Intent intent = new Intent(this, PrismaActivity.class);
        startActivity(intent);
    }

    public void piramide(View view) {
        Intent intent = new Intent(this, PiramideActivity.class);
        startActivity(intent);
    }

    public void cilindre(View view) {
        Intent intent = new Intent(this, CilindreActivity.class);
        startActivity(intent);
    }

    public void cono(View view) {
        Intent intent = new Intent(this, ConoActivity.class);
        startActivity(intent);
    }

    public void esfera(View view) {
        Intent intent = new Intent(this, EsferaActivity.class);
        startActivity(intent);
    }
}
