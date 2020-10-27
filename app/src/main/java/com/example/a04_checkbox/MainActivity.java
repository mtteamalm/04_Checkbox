package com.example.a04_checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos el objeto checkbox de nuestra activity para poder usarlo
        CheckBox myInsurance = (CheckBox) findViewById(R.id.CheckBoxSeguro);

        //De la misma manera hacemos con nuestro EditText
        EditText myPrice = (EditText) findViewById(R.id.editTextNumberDecimalPrecio);

        myPrice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                //Obtenemos el valor de nuestra caja de texto
                String Cadena = s.toString();

                //Comprobamos que no esté vacía
                if(Cadena.isEmpty()){
                    Cadena = "0";
                }

                //Por último comprobamos el valor, pero previamente lo convertimos a float
                float Cantidad = Float.parseFloat(Cadena);

                if (Cantidad >= 200){
                    myInsurance.setChecked(true);
                }else{
                    myInsurance.setChecked(false);
                }

            }
        });

    }

    public void capturarClick(View view) {

        //Creamos nuestro objeto de tipo Checkbox
        CheckBox myBox = (CheckBox) findViewById(R.id.CheckBoxCita);

        //En este caso usamos Toast para mostrar notificación haciendo uso de una operación ternaria
        // para determinar si el checkbox ha sido clicado o no.
        Toast.makeText(this, "Estado: " + (myBox.isChecked() ? " Checkeado" : " No Chequeado"),
                Toast.LENGTH_LONG).show();
    }

    public void abrirActivitySecundaria(View view) {
        Intent ActivitySecundaria = new Intent(this, SecondaryActivity.class);
        startActivity(ActivitySecundaria);
    }
}