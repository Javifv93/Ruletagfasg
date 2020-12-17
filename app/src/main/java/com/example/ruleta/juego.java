package com.example.ruleta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class juego extends AppCompatActivity {

    private int bala = (int) (Math.random()*6+1);
    private int cargador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);

        switch(bala)
        {
            case 1:{cargador = 1; break;}
            case 2:{cargador = 2; break;}
            case 3:{cargador = 3; break;}
            case 4:{cargador = 4; break;}
            case 5:{cargador = 5; break;}
            case 6:{cargador = 6; break;}
        }
        String x = String.valueOf(bala);

        Button op1 = findViewById(R.id.op1);
        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disparar(1);
            }
        });
        Button op2 = findViewById(R.id.op2);
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disparar(2);
            }
        });
        Button op3 = findViewById(R.id.op3);
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disparar(3);
            }
        });
        Button op4 = findViewById(R.id.op4);
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disparar(4);
            }
        });
        Button op5 = findViewById(R.id.op5);
        op5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disparar(5);
            }
        });
        Button op6 = findViewById(R.id.op6);
        op6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disparar(6);
            }
        });
    }
    public void disparar(int tambor){
        if(tambor == bala){
            Intent ntnt = new Intent(juego.this,muerto.class);
            startActivity(ntnt);
            finish();
        }
        else{
            switch (tambor)
            {
                case 1:{
                    Button boton = findViewById(R.id.op1);
                    boton.setEnabled(false);
                    boton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    break;
                }
                case 2:{
                    Button boton = findViewById(R.id.op2);
                    boton.setEnabled(false);
                    boton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    break;
                }
                case 3:{
                    Button boton = findViewById(R.id.op3);
                    boton.setEnabled(false);
                    boton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    break;
                }
                case 4:{
                    Button boton = findViewById(R.id.op4);
                    boton.setEnabled(false);
                    boton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    break;
                }
                case 5:{
                    Button boton = findViewById(R.id.op5);
                    boton.setEnabled(false);
                    boton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    break;
                }
                case 6:{
                    Button boton = findViewById(R.id.op6);
                    boton.setEnabled(false);
                    boton.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
                    break;
                }
            }
            Toast tostada = Toast.makeText(this, "...", Toast.LENGTH_SHORT);
            tostada.show();
        }
    }
}