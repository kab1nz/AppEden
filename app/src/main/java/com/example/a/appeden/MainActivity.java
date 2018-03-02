package com.example.a.appeden;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnInicio,btnevento,btngeleria,btnhabi,btninstalaciones,btnlugar,btnoferta,btnrestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInicio = findViewById(R.id.btninfo1);
        btnInicio.setOnClickListener(this);
        btnevento=findViewById(R.id.btnevento);
        btngeleria=findViewById(R.id.btngaleria);
        btnhabi=findViewById(R.id.btnhabi);
        btninstalaciones=findViewById(R.id.btninstalaciones);
        btnlugar=findViewById(R.id.btnlugar);
        btnoferta=findViewById(R.id.btnoferta);
        btnrestaurante=findViewById(R.id.btnrestaurante);


        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,InicioActivity.class);
                startActivity(e);
            }
        });
        btnevento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,eventos.class);
                startActivity(e);
            }
        });
        btngeleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,InicioActivity.class);
                startActivity(e);
            }
        });
        btnhabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,Habitacion.class);
                startActivity(e);
            }
        });
        btninstalaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,instalacionesservicios.class);
                startActivity(e);
            }
        });
        btnlugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,lugar.class);
                startActivity(e);
            }
        });
        btnoferta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,oferta.class);
                startActivity(e);
            }
        });
        btnrestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(MainActivity.this,restaurante.class);
                startActivity(e);
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
/*
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btninfo1:
                Intent i = new Intent(MainActivity.this,InicioActivity.class);
                startActivity(i);
                break;
            case R.id.btnevento:
                Intent e = new Intent(MainActivity.this,eventos.class);
                startActivity(e);
                break;
            case R.id.btngaleria:
                Intent g = new Intent(MainActivity.this,InicioActivity.class);
                startActivity(g);
                break;
            case R.id.btnhabi:
                Intent h = new Intent(MainActivity.this,Habitacion.class);
                startActivity(h);
                break;
            case R.id.btninstalaciones:
                Intent info = new Intent(MainActivity.this,instalacionesservicios.class);
                startActivity(info);
                break;
            case R.id.btnlugar:
                Intent lu = new Intent(MainActivity.this,lugar.class);
                startActivity(lu);
                break;
            case R.id.btnoferta:
                Intent ofe = new Intent(MainActivity.this,oferta.class);
                startActivity(ofe);
                break;

            case R.id.btnrestaurante:
                Intent res = new Intent(MainActivity.this,restaurante.class);
                startActivity(res);
                break;
        }

    }
     */
}
