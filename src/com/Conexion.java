package com;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexion {
    public Connection Conexion(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/poo","root","Holaquehace?3.0m.");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
        return conn;
    }
    public void create(String sql) {
        try (Connection conn = this.Conexion(); Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Elemento creado exitosamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}

