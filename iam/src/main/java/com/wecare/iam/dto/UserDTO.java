package com.wecare.iam.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class UserDTO extends BaseEntityDTO {
    private String city;
    private String pincode;
    private String state;
    private String country;
}
