/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parametasoap.parametasoap.models;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 *
 * @author user
 */
@XmlRootElement
@XmlSeeAlso({String.class})
public class Employee {

    private Long id;

    private String name;

    private String lastName;

    private String typeDocument;

    private String numberDocument;

    private Date dateBirthday;

    private Date dateEntry;

    private String position;

    private Double salary;

    public Employee() {

    }

    public Employee(Long id, String name, String lastName, String typeDocument, String numberDocument, Date dateBirthday, Date dateEntry, String position, Double salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.typeDocument = typeDocument;
        this.numberDocument = numberDocument;
        this.dateBirthday = dateBirthday;
        this.dateEntry = dateEntry;
        this.position = position;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    public Date getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(Date dateEntry) {
        this.dateEntry = dateEntry;
    }

}
