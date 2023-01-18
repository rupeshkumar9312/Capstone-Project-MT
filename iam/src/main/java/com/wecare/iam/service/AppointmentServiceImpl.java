package com.wecare.iam.service;

import com.wecare.iam.domain.Appointment;
import com.wecare.iam.dto.AppointmentDTO;
import com.wecare.iam.repository.AppointmentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentServiceImpl implements AppointmentService{

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public AppointmentDTO createAppointment(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment();
        BeanUtils.copyProperties(appointmentDTO,appointment);

        appointment = appointmentRepository.save(appointment);
        BeanUtils.copyProperties(appointment,appointmentDTO);
        return appointmentDTO;
    }

    @Override
    public Appointment getAppointmentById(String appointmentId) {
        return appointmentRepository.findById(appointmentId).orElse(new Appointment());
    }

    @Override
    public List<AppointmentDTO> getAppointmentByUserId(String userId) {
        AppointmentDTO appointmentDTO = new AppointmentDTO();
        List<Appointment> appointments = appointmentRepository.findByUserId(userId);
        return appointments.stream().map(appointment -> {
            BeanUtils.copyProperties(appointment,appointmentDTO);
            return appointmentDTO;
        }).collect(Collectors.toList());
    }
}
