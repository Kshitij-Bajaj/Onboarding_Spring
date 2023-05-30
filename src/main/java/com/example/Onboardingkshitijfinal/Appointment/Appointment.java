package com.example.Onboardingkshitijfinal.Appointment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AppointmentTable")
public class Appointment {

    @Id
    private long id;
    private String name;
    private String car;
    private String date;

    public Appointment(long id, String name, String car, String date) {
        super();
        this.id = id;
        this.name = name;
        this.car = car;
        this.date = date;
    }
    public Appointment() {
        super();
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


}
