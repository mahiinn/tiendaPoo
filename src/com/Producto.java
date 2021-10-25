package com;

public class Producto {
    private int idProducto;
    private String Nombre;
    private String Categoria;
    private double Precio;
    private int Cantidad;

    public Producto(int idProducto, String Nombre, String Categoria, double Precio, int cantidad) {
        this.idProducto = idProducto;
        this.Nombre = Nombre;
        this.Categoria = Categoria;
        this.Precio = Precio;
        this.Cantidad=cantidad;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
