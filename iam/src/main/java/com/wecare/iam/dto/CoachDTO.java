package com.wecare.iam.dto;

import com.mongodb.lang.NonNull;
import com.wecare.iam.domain.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@ToString
public class CoachDTO extends BaseEntityDTO{

    private String speciality;
}
