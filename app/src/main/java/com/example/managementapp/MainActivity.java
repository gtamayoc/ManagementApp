package com.example.managementapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.managementapp.Presenter.PresenterConsultar;

public class MainActivity extends AppCompatActivity implements InterfacesConsultar.ConsView {


    TextView Registrar, Consultar, Actualizar, Borrar, Name;
    InterfacesConsultar.ConsPresenter Presenter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Registrar = findViewById(R.id.Registar);
        Consultar = findViewById(R.id.Consultar);
        Actualizar = findViewById(R.id.Actualizar);
        Borrar = findViewById(R.id.Borrar);
        Name = findViewById(R.id.Name);
        context = this;
        this.Presenter = new PresenterConsultar(this);
        String NameDataBase = getName();
        Name.setText(NameDataBase);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcion(0);
            }
        });

        Consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcion(1);
            }
        });

        Actualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcion(2);
            }
        });

        Borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opcion(3);
            }
        });

    }

    private String getName() {
        SharedPreferences BaseDatos = getSharedPreferences("prueba", Context.MODE_PRIVATE);
        String nameBD = BaseDatos.getString("Usuario", "");
        return nameBD;
    }


    private void opcion(int opcion) {
        switch (opcion) {
            case 0:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                prueba("holaaa");
            case 1:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
            case 2:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
            case 3:
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }



    @Override
    public void prueba(String prueba) {
        this.Presenter.prueba(prueba);
    }

    @Override
    public void prueba2(String prueba) {
        Toast.makeText(context, " "+prueba, Toast.LENGTH_SHORT).show();
    }
}