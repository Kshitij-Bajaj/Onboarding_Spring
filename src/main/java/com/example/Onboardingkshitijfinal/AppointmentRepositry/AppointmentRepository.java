package com.example.Onboardingkshitijfinal.AppointmentRepositry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.Onboardingkshitijfinal.Appointment.Appointment;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment, Long>{

}