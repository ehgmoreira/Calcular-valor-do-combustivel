package com.example.calcularvalordocombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText campoDistancia;
    private EditText campoConsumo;
    private EditText campoValor;
    private TextView textoResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoDistancia = findViewById(R.id.editTextDistancia);
        campoConsumo = findViewById(R.id.editTextConsumo);
        campoValor = findViewById(R.id.editTextValor);
        textoResultado = findViewById(R.id.textViewResultado);

    }


    public void calcular(View view){
        Double valorTotalCombustivel;
        Double valorTotalGastos;
        String distancia = (campoDistancia.getText().toString());
        String consumo = (campoConsumo.getText().toString());
        String valor = (campoValor.getText().toString());

        Double distanciaD = Double.parseDouble(distancia);
        Double consumoD = Double.parseDouble(consumo);
        Double valorD = Double.parseDouble(valor);

        valorTotalCombustivel = (distanciaD/consumoD)*valorD;

        textoResultado.setText("Você pode esperar gastar " + String.valueOf(valorTotalCombustivel));

    }

}