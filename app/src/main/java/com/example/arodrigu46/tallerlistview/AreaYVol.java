package com.example.arodrigu46.tallerlistview;

/**
 * Created by arodrigu46 on 26/09/2017.
 */

public class AreaYVol {
    private String operacion;
    private String datos;
    private String res;

    public AreaYVol(String operacion, String datos, String res) {
        this.operacion = operacion;
        this.datos = datos;
        this.res = res;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }
    public void guardar(){
        Datos.guardar(this);
    }
}
