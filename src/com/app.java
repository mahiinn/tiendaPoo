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
import java.util.stream.Stream;

public class app {
    
    public ArrayList <Factura> facturas = new ArrayList();
    public Map<String,String> productosCantidad = new HashMap<>();
    
    public static String fechaHoy() {
        Date objDate = new Date();
        String strDateFormat = "hh: mm: ss a dd-MMM-aaaa"; // El formato de fecha está especificado  
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); // La cadena de formato de fecha se pasa como un argumento al objeto de formato de fecha  
        //System.out.println(objSDF.format(objDate)); // El formato de fecha se aplica a la fecha actual
        return objSDF.format(objDate);
    }
    public ArrayList <Factura> verFacturas(){
        return facturas;
    }
    public static void llenarComboBox(JComboBox comboBox) {
        comboBox.addItem("Seleccionar un método de pago");
        comboBox.addItem("Crédido de contado");
        comboBox.addItem("Crédito a cuotas");
    }

    public static ArrayList idProductos() {
        ArrayList<Producto> productos = new ArrayList();
        productos.add(new Producto(1, "pantalon", "moda", 200, 1000));
        productos.add(new Producto(2, "zapatos", "moda", 250, 250));
        productos.add(new Producto(3, "computadora", "tecnologia", 1200.50, 50));
        productos.add(new Producto(4, "celular", "tecnologia", 520.10, 75));
        return productos;
    }

    public static void restarCantidad(int cantidad, int idProducto) {
        int size = idProductos().size();
        ArrayList<Producto> productos;
        productos = idProductos();
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

    public static boolean confirmarVendedor(String userAdmi, char[] password) {
        String contraseña = "";
        for (int i = 0; i < password.length; i++) {
            contraseña = String.valueOf(password);
        }
        return userAdmi.toLowerCase().equals("vendedor1") && contraseña.equals("5695");
    }
    public Map<String,String> productosCantidadLlevar(int idProducto,int cant){
        productosCantidad.put(Integer.toString(idProducto),Integer.toString(cant));
        return productosCantidad;
    }
    public void realizarFactura(String Cliente, String Fecha, boolean Estado, int CantProducto,double total){
        Random rd = new Random();
        //String Cliente, String Vendedor, String Fecha, boolean estadoCancelacion, int CantProducto,producutosCantidad
        int idFactura;
        if(facturas.isEmpty()){
            idFactura=rd.nextInt(10000000)+1;
            facturas.add(new Factura(idFactura, Cliente, "Patricio", Fecha, Estado, CantProducto,productosCantidad));
            productosCantidad.clear();
        }else{
            boolean continuar;
            do {
                idFactura = rd.nextInt(10000000) + 1;
                for (int i = 0; i < facturas.size(); i++) {
                    if (facturas.get(i).getIdFactura() != idFactura) {
                        continuar = false;
                    }
                }
            } while (continuar = true);
            facturas.add(new Factura(idFactura, Cliente, "Patricio", Fecha, Estado, CantProducto,productosCantidad));
        }
        ArrayList<Producto> productos;
        productos=idProductos();
        String listaProductos="";
        for(Map.Entry<String, String> entry : productosCantidad.entrySet()){
            for (int j = 0; j < productos.size(); j++) {
                if (Integer.toString(productos.get(j).getIdProducto()).equals(entry.getKey())) {
                    listaProductos+=entry.getKey()+" "+productos.get(j).getNombre()+" "+entry.getValue()
                    +" x "+Double.toString(productos.get(j).getPrecio())+"................."
                    +Double.toString(Integer.parseInt(entry.getValue())*productos.get(j).getPrecio())+"\n";
                }
            }    
        }
        String estado;
        if(Estado==true){
            estado = "Facutra Cancelada";
        }else{
            estado = "Factura a cuotas";
        }
        try {
            String name="factura"+Integer.toString(idFactura)+".txt";
            //cambiar la parte de la ruta de D:\\Documentos\\NetBeansProjects a donde quiera guardar las diferentes facturas.
            String ruta = "D:\\Documentos\\NetBeansProjects\\tiendaPoo\\src\\facturas\\"+name;
            String contenido = "-------------------"+Integer.toString(idFactura)+"-------------------\n"+
                               "-------------------"+Fecha+"-------------------\n"
                                +listaProductos+"Nombre del vendedor: Patricio\n"+Cliente+"\n"+Integer.toString(CantProducto)+"\n"
                                +"............................"+Double.toString(total)+"\n"+"Estado de la factura: "+estado;
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido);
            bw.close();
        } catch (IOException ex) {
            System.out.println("File create exception (Excepción al crear el fichero): \n     " + ex);
        }
        productosCantidad.clear();
    }
    public ArrayList <String[]> contarFacturas(){
        File ruta = new File("D:\\Documentos\\NetBeansProjects\\tiendaPoo\\src\\facturas");
        String [] variasFacturas = ruta.list();
        ArrayList <String[]> almacenFacturas = new ArrayList <>();
        for (int i = 0; i < variasFacturas.length; i++) {
            String texto="";
            try{
                BufferedReader buffer = new BufferedReader(new FileReader("D:\\Documentos\\NetBeansProjects\\tiendaPoo\\src\\facturas\\"+variasFacturas[i]));
                String temp="";
                String bfRead;
                while ((bfRead=buffer.readLine())!=null){
                    //hacer el ciclo, mientras bfRead tiene datos
                    temp = temp+bfRead+"\n";
                }
                texto=temp;
            }catch (IOException ex) {
                System.out.println("No se encontró archivo "+ex);
            }
            String[] array = texto.lines().toArray(String[]::new);
            almacenFacturas.add(array);
        }
        return almacenFacturas;
    }
    public ArrayList <Factura> llenarFacturas(){
        ArrayList <String[]> backupFacturas=contarFacturas();
        Map<String,String> productoCantidad = new HashMap<>();
        int idFactura,cantProductos,posicionJ=3;
        String cliente,vendedor,fecha,estado,productos,idProducto,cantProducto;
        double total;
        for (int i = 0; i < backupFacturas.size(); i++) {
            //int idFactura String Cliente, String Vendedor, String Fecha, boolean estadoCancelacion, int CantProducto,producutosCantidad
            idFactura=Integer.parseInt(backupFacturas.get(i)[0].replaceAll("-", ""));
            fecha=backupFacturas.get(i)[1].replaceAll("-", "");
            for (int j = 1; j < backupFacturas.get(i).length; j++) {
               if(backupFacturas.get(i)[j].equals("Nombre del vendedor: Patricio")){
                     posicionJ=j;
                }
            }
            for (int j = 2; j < posicionJ; j++) {
//                    listaProductos+=i+" "+productos.get(j).getNombre()+" "+productosCantidad.get(i)
//                    +" x "+Double.toString(productos.get(j).getPrecio())+"................."
//                    +Double.toString(Integer.parseInt(productosCantidad.get(i))*productos.get(j).getPrecio())+"\n";
                productos=backupFacturas.get(i)[j];
                String [] producto = productos.split(" ");
                idProducto=producto[0];
                cantProducto=producto[2];
                productoCantidad.put(idProducto,cantProducto);
            }
            int nuevaPosicion=posicionJ+1;
           
            cliente=backupFacturas.get(i)[nuevaPosicion];
            cantProductos=Integer.parseInt(backupFacturas.get(i)[nuevaPosicion+1]);
            total=Double.parseDouble(backupFacturas.get(i)[nuevaPosicion+2]);
            estado=backupFacturas.get(i)[nuevaPosicion+3];
            boolean estadoFactura;
            if(estado.equals("Facutra Cancelada")){
                estadoFactura=true;
            }else{
                estadoFactura=false;
            }
            facturas.add(new Factura(idFactura,cliente,"Patricio",fecha,estadoFactura,cantProductos,productoCantidad));
        }
        return facturas;
    }
}
