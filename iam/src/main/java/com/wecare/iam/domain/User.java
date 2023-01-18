package com.wecare.iam.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@ToString
public class User extends BaseEntity{

    @NotNull
    @Size(min = 6,max = 20)
    private String city;

    @NotNull
    @Size(max = 6,min = 6)
    private String pincode;

    @NotNull
    @Size(min = 6,max = 20)
    private String state;

    @NotNull
    @Size(min = 6,max = 20)
    private String country;

    @DocumentReference
    private List<Appointment> appointments;
}
