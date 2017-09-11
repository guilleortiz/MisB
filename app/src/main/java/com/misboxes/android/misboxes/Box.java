package com.misboxes.android.misboxes;

/**
 * Created by Guille on 10/09/2017.
 */

public class Box {

    Boolean cajaAbierta=false;
    int numero;
    String descripion,ubicacion,tipo;



    public Boolean getCajaAbierta() {
        return cajaAbierta;
    }

    public void setCajaAbierta(Boolean cajaAbierta) {
        this.cajaAbierta = cajaAbierta;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero>=0){
            this.numero = numero;
        }

    }

    public String getDescripion() {
        return descripion;
    }

    public void setDescripion(String descripion) {
        this.descripion = descripion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}
