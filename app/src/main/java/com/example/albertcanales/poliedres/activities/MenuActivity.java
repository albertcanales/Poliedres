package com.example.albertcanales.poliedres.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.albertcanales.poliedres.R;

public class MenuActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void prisma(View view) {
        Intent intent = new Intent(this, PrismaPiramideActivity.class);
        intent.putExtra(PrismaPiramideActivity.PRISMA_PIRAMIDE_KEY, PrismaPiramideActivity.PRISMA_KEY);
        startActivity(intent);
    }

    public void piramide(View view) {
        Intent intent = new Intent(this, PrismaPiramideActivity.class);
        intent.putExtra(PrismaPiramideActivity.PRISMA_PIRAMIDE_KEY, PrismaPiramideActivity.PIRAMIDE_KEY);
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
