package com.example.managementapp.Vista;

import static com.example.managementapp.R.color.Base;
import static com.example.managementapp.R.color.Menu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.managementapp.Interfaces.InterfacesRegistrar;
import com.example.managementapp.Presenter.PresenterRegistrar;
import com.example.managementapp.R;

public class ViewRegistrar extends AppCompatActivity implements InterfacesRegistrar.RegView {

    TextView Registrar, Consultar, Actualizar, Borrar, Inicio, Name;
    PresenterRegistrar Presenter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_registrar);

        Registrar = findViewById(R.id.Registar);
        Consultar = findViewById(R.id.Consultar);
        Actualizar = findViewById(R.id.Actualizar);
        Borrar = findViewById(R.id.Borrar);
        Inicio = findViewById(R.id.Inicio);
        Name = findViewById(R.id.Name);
        context = this;
        this.Presenter = new PresenterRegistrar(this);
        String NameDataBase = getName();
        Name.setText(NameDataBase);

        Registrar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                opcion(0);
                vistaBoton(0);
            }
        });

        Consultar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                opcion(1);
            }
        });

        Actualizar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                opcion(2);
            }
        });

        Borrar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                opcion(3);
            }
        });

        Inicio.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                opcion(4);
            }
        });

    }

    private String getName() {
        SharedPreferences BaseDatos = getSharedPreferences("prueba", Context.MODE_PRIVATE);
        String nameBD = BaseDatos.getString("Usuario", "");
        return nameBD;
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    private void opcion(int opcion) {
        switch (opcion) {
            case 0:
                Toast.makeText(this, "0", Toast.LENGTH_SHORT).show();
                configurarBoton(opcion);
                break;
            case 1:
                Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
                configurarBoton(opcion);
                break;
            case 2:
                Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
                configurarBoton(opcion);
                break;
            case 3:
                Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
                configurarBoton(opcion);
                break;
            default:
                Toast.makeText(this, "4", Toast.LENGTH_SHORT).show();
                configurarBoton(opcion);
                break;
        }
    }

    public void vistaBoton(int opcion) {
        switch (opcion) {
            case 0:
                finish();
                Intent siguiente = new Intent(ViewRegistrar.this, ViewRegistrar.class);
                startActivity(siguiente);
                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            default:

                break;
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void configurarBoton(int opcion) {

        switch (opcion) {
            case 0:
                Registrar.setTextColor(getColor(Menu));
                Consultar.setTextColor(getColor(Base));
                Actualizar.setTextColor(getColor(Base));
                Borrar.setTextColor(getColor(Base));
                Inicio.setTextColor(getColor(Base));
                Registrar.setTextSize(23);
                Consultar.setTextSize(20);
                Actualizar.setTextSize(20);
                Borrar.setTextSize(20);
                Inicio.setTextSize(20);
                break;
            case 1:
                Registrar.setTextColor(getColor(Base));
                Consultar.setTextColor(getColor(Menu));
                Actualizar.setTextColor(getColor(Base));
                Borrar.setTextColor(getColor(Base));
                Inicio.setTextColor(getColor(Base));
                Registrar.setTextSize(20);
                Consultar.setTextSize(23);
                Actualizar.setTextSize(20);
                Borrar.setTextSize(20);
                Inicio.setTextSize(20);
                break;
            case 2:
                Registrar.setTextColor(getColor(Base));
                Consultar.setTextColor(getColor(Base));
                Actualizar.setTextColor(getColor(Menu));
                Borrar.setTextColor(getColor(Base));
                Inicio.setTextColor(getColor(Base));
                Registrar.setTextSize(20);
                Consultar.setTextSize(20);
                Actualizar.setTextSize(23);
                Borrar.setTextSize(20);
                Inicio.setTextSize(20);
                break;
            case 3:
                Registrar.setTextColor(getColor(Base));
                Consultar.setTextColor(getColor(Base));
                Actualizar.setTextColor(getColor(Base));
                Borrar.setTextColor(getColor(Menu));
                Inicio.setTextColor(getColor(Base));
                Registrar.setTextSize(20);
                Consultar.setTextSize(20);
                Actualizar.setTextSize(20);
                Borrar.setTextSize(23);
                Inicio.setTextSize(20);
                break;
            default:
                Registrar.setTextColor(getColor(Base));
                Consultar.setTextColor(getColor(Base));
                Actualizar.setTextColor(getColor(Base));
                Borrar.setTextColor(getColor(Base));
                Inicio.setTextColor(getColor(Menu));
                Registrar.setTextSize(20);
                Consultar.setTextSize(20);
                Actualizar.setTextSize(20);
                Borrar.setTextSize(20);
                Inicio.setTextSize(23);
                break;
        }


    }
}