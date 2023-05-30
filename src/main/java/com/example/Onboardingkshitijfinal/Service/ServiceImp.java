package com.example.Onboardingkshitijfinal.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Onboardingkshitijfinal.AppointmentRepositry.AppointmentRepository;
import com.example.Onboardingkshitijfinal.Appointment.Appointment;

@Service
public class ServiceImp implements Service_interface{

    @Autowired
    private AppointmentRepository Rep;

    @Override
    public List<Appointment> getAppointments() {
        return (List<Appointment>) Rep.findAll();
    }

    public Optional<Appointment> getAppointment(long id) {
        return Rep.findById(id);
    }

    public Appointment addAppointment(Appointment a) {
        Rep.save(a);
        return a;
    }

    public Appointment updateAppointment(Appointment a) {
        Rep.save(a);
        return a;
    }

    @Override
    public void deleteAppointment(long id) {
        Rep.deleteById(id);
    }

}