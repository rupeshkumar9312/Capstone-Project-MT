package com.wecare.iam.dto;

import com.wecare.iam.domain.Coach;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Getter
@Setter
public class AppointmentDTO {
    private String userId;
    private Coach coach;
    private String date;
    private String slot;

}
