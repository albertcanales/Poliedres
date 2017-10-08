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
        intent.putExtra(POLIEDRE_KEY, PRISMA_KEY);
        startActivity(intent);
    }

    public void piramide(View view) {
        Intent intent = new Intent(this, PrismaPiramideActivity.class);
        intent.putExtra(POLIEDRE_KEY, PIRAMIDE_KEY);
        startActivity(intent);
    }

    public void cilindre(View view) {
        Intent intent = new Intent(this, CilindreConActivity.class);
        intent.putExtra(POLIEDRE_KEY, CILINDRE_KEY);
        startActivity(intent);
    }

    public void cono(View view) {
        Intent intent = new Intent(this, CilindreConActivity.class);
        intent.putExtra(POLIEDRE_KEY, CON_KEY);
        startActivity(intent);
    }

    public void esfera(View view) {
        Intent intent = new Intent(this, EsferaActivity.class);
        startActivity(intent);
    }
}
