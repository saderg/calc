package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.calculadora.MESSAGE";
    private Button botonSuma;
    private Button botonResta;
    private Button botonMulti;
    private Button botonDividir;

    private TextView respuesta;

    private EditText edit_numero1;
    private EditText edit_numero2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_numero1 = findViewById(R.id.numero1);
        edit_numero2 = findViewById(R.id.numero2);

        respuesta = (TextView) findViewById(R.id.respuestaCalculadora1);

        botonSuma = findViewById(R.id.sumaBoton);
        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText (suma (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });

        botonResta = findViewById(R.id.restaBoton);
        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText (resta (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });

        botonMulti = findViewById(R.id.multiplicarBoton);
        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText (multiplicación (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });
        botonDividir = findViewById(R.id.dividirBoton);
        botonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String envio;
                respuesta.setText (dividir (Integer.parseInt(edit_numero1.getText().toString()) , Integer.parseInt(edit_numero2.getText().toString()) ) + " ");
                envio = respuesta.getText().toString();
                enviar(this, envio);
            }
        });


    }

    public int suma (int a, int b){

        return a+b;

    }
    public int resta (int a, int b){


        return a-b;

    }
    public int multiplicación (int a, int b){


        return a*b;

    }
    public int dividir (int a, int b){
        int respuesta = 0;
        if(b!=0){
            respuesta = a/b;
        }
        return a/b;

    }
        public void enviar(View.OnClickListener view, String envio){

            Intent intent = new Intent(this, Resultado.class);
            intent.putExtra(EXTRA_MESSAGE , envio);
            startActivity(intent);
        }

}