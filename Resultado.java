package com.example.calculadora;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resultado);
        Intent intent = getIntent();

        Double rest = intent.getDoubleExtra(MainActivity.EXTRA_MESSAGE, 0);

        TextView texto = findViewById(R.id.respuestaCalculadora);

        texto.setText(" " +rest);
    }
}