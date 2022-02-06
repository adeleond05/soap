/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parametasoap.parametasoap.services;

import com.parametasoap.parametasoap.controllers.EmployeeController;
import com.parametasoap.parametasoap.models.Employee;
import java.sql.SQLException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author user
 */
@WebService(serviceName = "EmployeeService")

public class EmployeeService {

    EmployeeController employeeController = new EmployeeController();

    @WebMethod(operationName = "insert")
    public String insertEmployee(@WebParam(name = "employee") Employee employee) {
        try {
            if (employeeController.insertEmployee(employee)) {
                return "OK";
            }
            return "NO";
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "error";
        }
    }
}
