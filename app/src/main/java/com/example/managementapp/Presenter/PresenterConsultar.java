package com.example.managementapp.Presenter;

import android.content.Context;

import com.example.managementapp.InterfacesConsultar;
import com.example.managementapp.MainActivity;
import com.example.managementapp.Modelo.ModeloConsultar;

public class PresenterConsultar implements InterfacesConsultar.ConsPresenter {

    InterfacesConsultar.ConsView View;
    InterfacesConsultar.ConsModelo Modelo;

    public PresenterConsultar(InterfacesConsultar.ConsView view){
        this.View = view;
        this.Modelo = new ModeloConsultar(this);
    }

    @Override
    public void prueba(String prueba) {
        this.Modelo.prueba(prueba);
    }

    @Override
    public void prueba2(String prueba) {
        this.View.prueba2(prueba);
    }


}
