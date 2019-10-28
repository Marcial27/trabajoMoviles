package com.example.segundotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonPractico2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPractico2 = findViewById(R.id.buttonPractico2);
        buttonPractico2.setClickable(true);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void onClick(View view)
    {
        Log.d("AAAAAAAAAAAAA","AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        switch (view.getId())
        {
            case R.id.buttonPractico2:
                Intent intent = new Intent(this,Calculadora.class);
                startActivity(intent);
                break;
            case R.id.buttonPractico1:
                break;
            default:
                break;

        }
    }
}
