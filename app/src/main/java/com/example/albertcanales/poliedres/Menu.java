package com.example.albertcanales.poliedres;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void prisma(View view) {
        Intent intent = new Intent(this, Prisma.class);
        startActivity(intent);
    }

    public void piramide(View view) {
        Intent intent = new Intent(this, Piramide.class);
        startActivity(intent);
    }

    public void cilindre(View view) {
        Intent intent = new Intent(this, Cilindre.class);
        startActivity(intent);
    }

    public void cono(View view) {
        Intent intent = new Intent(this, Cono.class);
        startActivity(intent);
    }

    public void esfera(View view) {
        Intent intent = new Intent(this, Esfera.class);
        startActivity(intent);
    }
}
