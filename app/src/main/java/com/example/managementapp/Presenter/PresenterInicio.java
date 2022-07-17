package com.example.managementapp.Presenter;

import com.example.managementapp.Interfaces.InterfacesInicio;
import com.example.managementapp.Modelo.ModeloInicio;

public class PresenterInicio implements InterfacesInicio.IniPresenter {

    InterfacesInicio.IniView View;
    InterfacesInicio.IniModelo Modelo;

    public PresenterInicio(InterfacesInicio.IniView view) {
        this.View = view;
        this.Modelo = new ModeloInicio(this);
    }











    /*
    @Override
    public void prueba(String prueba) {
        this.Modelo.prueba(prueba);
    }

    @Override
    public void prueba2(String prueba) {
        this.View.prueba2(prueba);
    }
*/

}
