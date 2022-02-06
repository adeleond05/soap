/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parametasoap.parametasoap.controllers;

import com.parametasoap.parametasoap.configuration.Conexion;
import com.parametasoap.parametasoap.models.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class EmployeeController extends Conexion {

    Connection con;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean insertEmployee(Employee employee) throws SQLException {

        try {
            String sql = "insert into empleados values (null, ?, ?,?,?,?,?,?,?)";

            boolean result = false;

            con = connect();
            ps = con.prepareStatement(sql);

            DateFormat dateFormatYMD = new SimpleDateFormat("yyyy-MM-dd");

            String dateBirthday = dateFormatYMD.format(employee.getDateBirthday());
            String dateEntry = dateFormatYMD.format(employee.getDateEntry());

            java.sql.Date date = new java.sql.Date(0000 - 00 - 00);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getLastName());
            ps.setString(3, employee.getTypeDocument());
            ps.setString(4, employee.getNumberDocument());
            ps.setDate(5, date.valueOf(dateBirthday));
            ps.setDate(6, date.valueOf(dateEntry));
            ps.setString(7, employee.getPosition());
            ps.setDouble(8, employee.getSalary());

            if (ps.executeUpdate() == 1) {
                result = true;
            }

            return result;

        } catch (SQLException e) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, e);
            return false;
        } finally {
            ps.close();
            con.close();
        }

    }

}
