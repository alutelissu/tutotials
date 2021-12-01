package com.last.springbootbackend.controller;


import com.last.springbootbackend.model.Appointment;
import com.last.springbootbackend.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @GetMapping("/appointment")
    public List<Appointment> getAppointments(){
        return appointmentRepository.findAll();
    }
    @PostMapping("/appointment")
    public Appointment sendAppointment(@RequestBody Appointment appointment){
       return  appointmentRepository.save(appointment);
    }


}
