/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Date;

/**
 *
 * @author devin
 */
public class Factura {
    private int idFactura;
    private String Cliente;
    private String Vendedor;
    private String Fecha;
    private String Estado;
    private int CantProducto;

    public Factura(int idFactura, String Cliente, String Vendedor, String Fecha, String Estado, int CantProducto) {
        this.idFactura = idFactura;
        this.Cliente = Cliente;
        this.Vendedor = Vendedor;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.CantProducto = CantProducto;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setCantProducto(int CantProducto) {
        this.CantProducto = CantProducto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public String getFecha() {
        return Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public int getCantProducto() {
        return CantProducto;
    }    
}
