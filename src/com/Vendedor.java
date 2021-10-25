/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author devin
 */
public class Vendedor extends Persona {
    private int idVendedor;

    public Vendedor(int idVendedor, String nombre, int cedula, int telefono, String direccion) {
        super(nombre, cedula, telefono, direccion);
        this.idVendedor = idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    @Override
    public String toString() {
        return super.toString() + "idVendedor=" + idVendedor;
    }    
}
