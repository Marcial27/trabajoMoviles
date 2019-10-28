package com.example.segundotp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora extends AppCompatActivity {

    private Button suma, resta, division, multiplicacion;
    private TextView resultado;

    public static final int OPERACION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        suma = findViewById(R.id.buttonPractico1);
        resta = findViewById(R.id.buttonPractico1);
        division = findViewById(R.id.buttonPractico1);
        multiplicacion = findViewById(R.id.buttonPractico1);
        resultado = findViewById(R.id.resultado);
    }

    public void onClick(View view) {
        Log.d("AAAAAAAAAAAAA","BBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
        switch (view.getId()) {
            case R.id.buttonSuma:
                Intent intent = new Intent(this, Operacion.class);
                intent.putExtra("operador","+");
                Log.d("AAAAAAAAAAAAA","CCCCCCCCCCCCCCCCCCCCCCCCCCCC");
                startActivityForResult(intent,OPERACION);
                Log.d("AAAAAAAAAAAAA","DDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
                break;
            case R.id.buttonResta:
                break;
            case R.id.buttonDivision:
                break;
            case R.id.buttonMultiplicacion:
                break;
            default:
                break;

        }
    }

    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == OPERACION) { // Identify activity
            if (resultCode == RESULT_OK) { // Activity succeeded
                String reply = data.getStringExtra("resultado");
                resultado.setText(reply);
            }}}



}