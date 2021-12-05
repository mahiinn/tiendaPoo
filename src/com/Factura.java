/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.*;

/**
 *
 * @author devin
 */
public class Factura {
    private int idFactura;
    private String Cliente;
    private String Vendedor;
    private String Fecha;
    private boolean estadoCancelacion;
    private boolean estadoDevuelta= false;
    private int CantProducto;
    private Map<String,String> productosCantidad = new HashMap<>();

    public Factura(int idFactura, String Cliente, String Vendedor, String Fecha, boolean estadoCancelacion, int CantProducto) {
        this.idFactura=idFactura;
        this.Cliente = Cliente;
        this.Vendedor = Vendedor;
        this.Fecha = Fecha;
        this.estadoCancelacion = estadoCancelacion;
        this.CantProducto = CantProducto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public boolean isEstadoCancelacion() {
        return estadoCancelacion;
    }

    public void setEstadoCancelacion(boolean estadoCancelacion) {
        this.estadoCancelacion = estadoCancelacion;
    }

    public boolean isEstadoDevuelta() {
        return estadoDevuelta;
    }

    public void setEstadoDevuelta(boolean estadoDevuelta) {
        this.estadoDevuelta = estadoDevuelta;
    }

    public int getCantProducto() {
        return CantProducto;
    }

    public void setCantProducto(int CantProducto) {
        this.CantProducto = CantProducto;
    }

    public Map<String,String> getMap() {
        return productosCantidad;
    }

    public void setMap(Map<String,String> productosCantidad) {
        this.productosCantidad = productosCantidad;
    }
    
}