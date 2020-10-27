package com.example.a04_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void capturarClick(View view) {

        //Creamos nuestro objeto de tipo Checkbox
        CheckBox myBox = (CheckBox) findViewById(R.id.CheckBoxCita);

        //En este caso usamos Toast para mostrar notificación haciendo uso de una operación ternaria
        // para determinar si el checkbox ha sido clicado o no.
        Toast.makeText(this, "Estado: " + (myBox.isChecked() ? " Checkeado" : " No Chequeado"),
                Toast.LENGTH_LONG).show();
    }
}