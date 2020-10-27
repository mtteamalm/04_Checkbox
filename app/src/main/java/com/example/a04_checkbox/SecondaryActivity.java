package com.example.a04_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class SecondaryActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

    }

    public void activarOpcionesPremium(View view) {

        CheckBox informes = (CheckBox) findViewById(R.id.checkBoxInforme);
        CheckBox envios = (CheckBox) findViewById(R.id.checkBoxEnvio);

        informes.setEnabled(true);
        envios.setEnabled(true);
    }
}