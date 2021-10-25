package com;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;

public class app {
    public static String fechaHoy(){
        Date objDate = new Date();
        String strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto de formato de fecha  
        System.out.println(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
        return objSDF.format(objDate);
    }
    public static void llenarComboBox(JComboBox comboBox){
        comboBox.addItem("Seleccionar un método de pago");
        comboBox.addItem("Crédido de contado");
        comboBox.addItem("Crédito a cuotas");  
    }
    public static ArrayList idProductos(){
        ArrayList<Producto> productos = new ArrayList();
        productos.add(new Producto(1, "pantalon", "moda", 200,1000));
        productos.add(new Producto(2, "zapatos", "moda", 250,250));
        productos.add(new Producto(3, "computadora", "tecnologia", 1200.50,50));
        productos.add(new Producto(4, "celular", "tecnologia", 520.10,75));
        return productos;
    }
    public static void restarCantidad(int cantidad,int idProducto){
        int size = idProductos().size();
        ArrayList<Producto> productos;
        productos=idProductos();
        for(int i=0; i<size; i++){
            if(productos.get(i).getIdProducto()==idProducto){
                cantidad=productos.get(i).getCantidad()-cantidad;
                productos.get(i).setCantidad(cantidad);
                System.out.println(productos.get(i).getCantidad());
            }
        }
    }
    public static boolean confirmarAdministrador(String userAdmi, char[] password){
        String contraseña="";
        for (int i = 0; i < password.length; i++) {
            contraseña=String.valueOf(password);
        }
        return userAdmi.toLowerCase().equals("eladmin")&&contraseña.equals("5695");
        
    }
}
