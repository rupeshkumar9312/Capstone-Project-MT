package com.wecare.iam.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "appointments")
@Getter
@Setter
@ToString
public class Appointment {

    @Id
    private String id;
    private String userId;
    @DocumentReference
    private Coach coach;
    private String date;
    private String slot;
}
