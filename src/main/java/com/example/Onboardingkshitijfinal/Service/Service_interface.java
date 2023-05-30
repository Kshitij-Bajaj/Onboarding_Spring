package com.example.Onboardingkshitijfinal.Service;

import java.util.List;
import java.util.Optional;

import com.example.Onboardingkshitijfinal.Appointment.Appointment;

public interface Service_interface {
    public List<Appointment> getAppointments();
    public Optional<Appointment> getAppointment(long id);
    public Appointment addAppointment(Appointment a);
    public Appointment updateAppointment(Appointment a);
    public void deleteAppointment(long id);

}
