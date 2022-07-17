package com.example.managementapp.Modelo;

import com.example.managementapp.Interfaces.InterfacesInicio;

public class ModeloInicio implements InterfacesInicio.IniModelo {

    InterfacesInicio.IniPresenter Presenter;

    public ModeloInicio(InterfacesInicio.IniPresenter presenter) {
        this.Presenter = presenter;
    }











    /*
    @Override
    public void prueba(String prueba) {
        this.Presenter.prueba2(prueba);
    }*/
}
