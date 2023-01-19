package com.wecare.appointmentservice.dto;

import com.wecare.appointmentservice.domain.Coach;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppointmentDTO {
    private String userId;
    private Coach coach;
    private String date;
    private String slot;

}
