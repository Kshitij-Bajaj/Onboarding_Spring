package com.example.Onboardingkshitijfinal.AppointmentController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Onboardingkshitijfinal.Appointment.Appointment;
import com.example.Onboardingkshitijfinal.Service.Service_interface;

@RestController
public class AppointmentController {

    @Autowired
    private Service_interface service_obj;

    @GetMapping("/home")
    public String home() {
        return "It is working";
    }

    @GetMapping("/appointments")
    public List<Appointment> getAppointments() {
        return service_obj.getAppointments();
    }


    @GetMapping("/appointments/{a_id}")
    public Optional<Appointment> getAppointment(@PathVariable String a_id) {
        return service_obj.getAppointment(Long.parseLong(a_id));

    }

    @PostMapping("/appointments")
    public Appointment addAppointment(@RequestBody Appointment a) {
        return service_obj.addAppointment(a);
    }

    @PutMapping("/appointments")
    public Appointment updateAppointment(@RequestBody Appointment a) {
        return service_obj.updateAppointment(a);
    }

    @DeleteMapping("/appointments/{id}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id) {
        try {
            service_obj.deleteAppointment(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}