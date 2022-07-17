package com.example.managementapp.Modelo;

import android.content.Context;
import android.widget.Toast;

import com.example.managementapp.InterfacesConsultar;
import com.example.managementapp.MainActivity;
import com.example.managementapp.Presenter.PresenterConsultar;

public class ModeloConsultar implements InterfacesConsultar.ConsModelo  {

    InterfacesConsultar.ConsPresenter Presenter;

    public ModeloConsultar(InterfacesConsultar.ConsPresenter presenter) {
        this.Presenter = presenter;
    }

    @Override
    public void prueba(String prueba) {
        this.Presenter.prueba2(prueba);
    }
}
