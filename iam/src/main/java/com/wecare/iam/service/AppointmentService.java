package com.wecare.iam.service;

import com.wecare.iam.domain.Appointment;
import com.wecare.iam.dto.AppointmentDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AppointmentService {

    AppointmentDTO createAppointment(AppointmentDTO appointmentDTO);

    Appointment getAppointmentById(String appointmentId);

    List<AppointmentDTO> getAppointmentByUserId(String userId);
}
