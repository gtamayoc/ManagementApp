package com.example.managementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity{

    private final int tiempoTranscurrir = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        Handler h = new Handler();

        h.postDelayed(new Runnable(){
            @Override
            public void run(){
                CrearBaseDeDatos();
                finish();
                Intent siguiente = new Intent(Splash.this, MainActivity.class);
                startActivity(siguiente);
                h.removeCallbacks(null);
            }

            private void CrearBaseDeDatos() {
                SharedPreferences BaseDatos = getSharedPreferences("prueba", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = BaseDatos.edit();
                editor.putString("Usuario","Giuseppe");
                editor.commit();
            }

        }, tiempoTranscurrir );
    }





}