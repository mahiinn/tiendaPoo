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
public class Venta {
    private String nombre;
    private String fecha;
    private String mediopago;
    private double totalpagar;

    public Venta(String nombre, String fecha, String mediopago, double totalpagar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.mediopago = mediopago;
        this.totalpagar = totalpagar;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMediopago(String mediopago) {
        this.mediopago = mediopago;
    }

    public void setTotalpagar(double totalpagar) {
        this.totalpagar = totalpagar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMediopago() {
        return mediopago;
    }

    public double getTotalpagar() {
        return totalpagar;
    }
        
}
