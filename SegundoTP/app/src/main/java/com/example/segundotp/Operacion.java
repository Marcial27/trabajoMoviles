package com.example.segundotp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Operacion extends AppCompatActivity implements View.OnClickListener{

    private char operador;

    private EditText valor1,valor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);

        valor1 = findViewById(R.id.number1);
        valor2 = findViewById(R.id.number2);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            operador= extras.getChar("operador");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonResult:
                Intent replyIntent = new Intent(this,Calculadora.class);
                double resultado= obtenerResultado(operador);

                replyIntent.putExtra("resultado",resultado);

                setResult(RESULT_OK, replyIntent);
                finish();
                break;
            default:
                break;

        }
    }

    private double obtenerResultado(char operador ) {
        switch (operador) {
            case '+':
                return Integer.parseInt(valor1.getText().toString()) +
                        Integer.parseInt(valor2.getText().toString());
            default:
                break;
        }
        return 0;
    }
}
