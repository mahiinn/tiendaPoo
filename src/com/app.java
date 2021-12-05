package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.net.URL;

public class app {

    public ArrayList<Factura> facturas = new ArrayList();
    Map<String, String> productosCantidad = new HashMap<>();
    Random rd = new Random();
    int idFactura;
    String listaProductos;
    BufferedWriter bw;
    FileWriter fw;
    public  String nomVendedor;

    public static String fechaHoy() {
        Date objDate = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto de formato de fecha  
        //System.out.println(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
        return objSDF.format(objDate);
    }

    public ArrayList<Factura> verFacturas() {
        return facturas;
    }

    public static void llenarComboBox(JComboBox comboBox) {
        comboBox.addItem("Seleccionar un método de pago");
        comboBox.addItem("Crédido de contado");
        comboBox.addItem("Crédito a cuotas");
    }

    public static ArrayList<Producto> idProductos() {
        ArrayList<Producto> productos = new ArrayList();

        productos.add(new Producto(1, "pantalon", "moda", 200, 1000));
        productos.add(new Producto(2, "zapatos", "moda", 250, 250));
        productos.add(new Producto(3, "computadora", "tecnologia", 1200.50, 50));
        productos.add(new Producto(4, "celular", "tecnologia", 520.10, 75));
        return productos;
    }

    public void restarCantidad(int cantidad, int idProducto) {
        ArrayList<Producto> productos = idProductos();
        int size = idProductos().size();
        for (int i = 0; i < size; i++) {
            if (productos.get(i).getIdProducto() == idProducto) {
                cantidad = productos.get(i).getCantidad() - cantidad;
                productos.get(i).setCantidad(cantidad);
                System.out.println(productos.get(i).getCantidad());
            }
        }
    }

    public static boolean confirmarAdministrador(String userAdmi, char[] password) {
        String contraseña = "";
        for (int i = 0; i < password.length; i++) {
            contraseña = String.valueOf(password);
        }
        return userAdmi.toLowerCase().equals("eladmin") && contraseña.equals("5695");

    }
    
    public static boolean confirmarVendedor(String userVendedor, char[] password) {
        Conexion objConexion = new Conexion();
//        nomVendedor=userVendedor;
        String contraseña = "";
        for (int i = 0; i < password.length; i++) {
            contraseña = String.valueOf(password);
        }
        String sql = "SELECT * FROM vendedor WHERE nom_vendedor='" + userVendedor + "'AND password=" + contraseña;
        try (Connection conn = objConexion.Conexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                rs.close();
                return false;

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public void crearFactura() {
        Conexion objConexion = new Conexion();
        String sql = "SELECT * FROM factura";
        try (Connection conn = objConexion.Conexion(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            if (!rs.next()) {
                idFactura = rd.nextInt(10000000) + 1;
            } else {
                boolean continuar;
                do {
                    idFactura = rd.nextInt(10000000) + 1;
                    sql = "SELECT * FROM factura WHERE cod_factura=" + idFactura;
                    PreparedStatement ps2 = conn.prepareStatement(sql);
                    ResultSet rs2 = ps2.executeQuery();
                    if (rs.next()) {
                        continuar = true;
                    } else {
                        continuar = false;
                    }
                } while (continuar == false);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
//        sql="INSERT INTO factura (`cod_factura`, "
//                + "`cod_cliente`, `cod_vendedor`, `fecha_venta`, "
//                + "`cod_mediopago`, `total_pagar`)"
//                + "VALUES ("+idFactura+","+""+","+nomVendedor+")";
//                return new Factura(idFactura, Cliente, "Patricio", Fecha, Estado, CantProducto, pCantidad);
//
    }

    public Map<String, String> productosCantidadLlevar(int idProducto, int cant) {
        productosCantidad.put(Integer.toString(idProducto), Integer.toString(cant));
        return productosCantidad;
    }

//    public String comparaproductos (){
//        ArrayList<Producto> productos = idProductos();
//   
//        for(Map.Entry<String, String> entry : productosCantidad.entrySet()){
//            for (int j = 0; j < productos.size(); j++) {
//                if (Integer.toString(productos.get(j).getIdProducto()).equals(entry.getKey())) {
//                    listaProductos+=entry.getKey()+" "+productos.get(j).getNombre()+" "+entry.getValue()
//                    +" x "+Double.toString(productos.get(j).getPrecio())+"................."
//                    +Double.toString(Integer.parseInt(entry.getValue())*productos.get(j).getPrecio())+"\n";
//                }
//            }    
//        }
//        return listaProductos;
//    }
    public Factura realizarVenta(String Cliente, String Fecha, boolean Estado, int CantProducto, double total, Map<String, String> pCantidad) {
        if (facturas.isEmpty()) {
            idFactura = rd.nextInt(10000000) + 1;
        } else {
            boolean continuar;
            do {
                idFactura = rd.nextInt(10000000) + 1;
                for (int i = 0; i < facturas.size(); i++) {
                    if (facturas.get(i).getIdFactura() != idFactura) {
                        continuar = false;
                    }
                }
            } while (continuar = true);
        }
        return new Factura(idFactura, Cliente, "Patricio", Fecha, Estado, CantProducto);

    }

    public void limpiar() {
        productosCantidad.clear();
    }
//    public void realizarFactura(String Cliente, String Fecha, boolean Estado, int CantProducto, double total) {
//        //String Cliente, String Vendedor, String Fecha, boolean estadoCancelacion, int CantProducto,producutosCantidad
//        //Runnable miRunnable = () -> {
//        if (facturas.isEmpty()) {
//            idFactura = rd.nextInt(10000000) + 1;
//            facturas.add(new Factura(idFactura, Cliente, "Patricio", Fecha, Estado, CantProducto, productosCantidad));
//            productosCantidad.clear();
//        } else {
//            boolean continuar;
//            do {
//                idFactura = rd.nextInt(10000000) + 1;
//                for (int i = 0; i < facturas.size(); i++) {
//                    if (facturas.get(i).getIdFactura() != idFactura) {
//                        continuar = false;
//                    }
//                }
//            } while (continuar = true);
//            facturas.add(new Factura(idFactura, Cliente, "Patricio", Fecha, Estado, CantProducto, productosCantidad));
//        }
//        productosCantidad.clear();

//            String estado;
//            if(Estado==true){
//                estado = "Facutra Cancelada";
//            }else{
//                estado = "Factura a cuotas";
//            }
//            try {
//                String name="factura"+Integer.toString(idFactura)+".txt";
//                //cambiar la parte de la ruta de D:\\Documentos\\NetBeansProjects a donde quiera guardar las diferentes facturas.
//                String ruta = "D:\\Documentos\\NetBeansProjects\\tiendaPoo\\src\\facturas\\"+name;
//                String contenido = "-------------------"+Integer.toString(idFactura)+"-------------------\n"+
//                        "-------------------"+Fecha+"-------------------\n"
//                        +listaProductos+"Nombre del vendedor: Patricio\n"+Cliente+"\n"+Integer.toString(CantProducto)+"\n"
//                        +"............................"+Double.toString(total)+"\n"+"Estado de la factura: "+estado;
//                File file = new File(ruta);
//                // Si el archivo no existe es creado
//                if (!file.exists()) {
//                    file.createNewFile();
//                }
//                fw= new FileWriter(file);
//                bw = new BufferedWriter(fw);
//                bw.write(contenido);
//                bw.close();
//            } catch (IOException ex) {
//                System.out.println("File create exception (Excepción al crear el fichero): \n     " + ex);
//            }
//        };
//        Thread hilo = new Thread (miRunnable);
//        hilo.start();
}
//    public ArrayList <String[]> contarFacturas(){
//        File ruta = new File("D:\\Documentos\\NetBeansProjects\\tiendaPoo\\src\\facturas");
//    public ArrayList <String[]> contarFacturas(){
//        File ruta = new File("C:\\Users\\devin\\Desktop\\tiendaPoo\\src\\facturas\\");
//        String [] variasFacturas = ruta.list();
//        ArrayList <String[]> almacenFacturas = new ArrayList <>();
//        for (int i = 0; i < variasFacturas.length; i++) {
//            String texto="";
//            try{
//                BufferedReader buffer = new BufferedReader(new FileReader("C:\\Users\\devin\\Desktop\\tiendaPoo\\src\\facturas\\"+variasFacturas[i]));
//                String temp="";
//                String bfRead;
//                while ((bfRead=buffer.readLine())!=null){
//                    //hacer el ciclo, mientras bfRead tiene datos
//                    temp = temp+bfRead+"\n";
//                }
//                texto=temp;
//            }catch (IOException ex) {
//                System.out.println("No se encontró archivo "+ex);
//            }
//            String[] array = texto.lines().toArray(String[]::new);
//            almacenFacturas.add(array);
//        }
//        return almacenFacturas;
//    }
//    public ArrayList <Factura> llenarFacturas(){
//        ArrayList <String[]> backupFacturas=contarFacturas();
//        Map<String,String> productoCantidad = new HashMap<>();
//        int idFactura,cantProductos,posicionJ=3;
//        String cliente,vendedor,fecha,estado,productos,idProducto,cantProducto;
//        double total;
//        for (int i = 0; i < backupFacturas.size(); i++) {
//            //int idFactura String Cliente, String Vendedor, String Fecha, boolean estadoCancelacion, int CantProducto,producutosCantidad
//            idFactura=Integer.parseInt(backupFacturas.get(i)[0].replaceAll("-", ""));
//            fecha=backupFacturas.get(i)[1].replaceAll("-", "");
//            for (int j = 1; j < backupFacturas.get(i).length; j++) {
//               if(backupFacturas.get(i)[j].equals("Nombre del vendedor: Patricio")){
//                     posicionJ=j;
//                }
//            }
//            for (int j = 2; j < posicionJ; j++) {
////                    listaProductos+=i+" "+productos.get(j).getNombre()+" "+productosCantidad.get(i)
////                    +" x "+Double.toString(productos.get(j).getPrecio())+"................."
////                    +Double.toString(Integer.parseInt(productosCantidad.get(i))*productos.get(j).getPrecio())+"\n";
//                productos=backupFacturas.get(i)[j];
//                String [] producto = productos.split(" ");
//                idProducto=producto[0];
//                cantProducto=producto[2];
//                productoCantidad.put(idProducto,cantProducto);
//            }
//            int nuevaPosicion=posicionJ+1;
//           
//            cliente=backupFacturas.get(i)[nuevaPosicion];
//            cantProductos=Integer.parseInt(backupFacturas.get(i)[nuevaPosicion+1]);
//            total=Double.parseDouble(backupFacturas.get(i)[nuevaPosicion+2]);
//            estado=backupFacturas.get(i)[nuevaPosicion+3];
//            boolean estadoFactura;
//            if(estado.equals("Facutra Cancelada")){
//                estadoFactura=true;
//            }else{
//                estadoFactura=false;
//            }
//            facturas.add(new Factura(idFactura,cliente,"Patricio",fecha,estadoFactura,cantProductos,productoCantidad));
//        }
//        return facturas;
//    }

