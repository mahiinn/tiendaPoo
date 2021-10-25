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
public class Cliente extends Persona {
    private int idCliente;

    public Cliente(int idCliente, String nombre, int cedula, int telefono, String direccion) {
        super(nombre, cedula, telefono, direccion);
        this.idCliente = idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return super.toString() + "idCliente=" + idCliente;
    }
    
}
