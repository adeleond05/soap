/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parametasoap.parametasoap.configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Conexion {

    Connection con = null;

    public Connection connect() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdsoap?useSSL=false&autoReconnect=true&failOverReadOnly=false", "root", "root123");
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public static void main(String[] args) throws SQLException {
        Conexion con = new Conexion();

        System.out.println("Estás conectado " + con.connect());
    }

}
