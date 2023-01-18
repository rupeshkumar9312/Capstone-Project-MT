package com.wecare.iam.controller;

import com.wecare.iam.dto.CoachDTO;
import com.wecare.iam.dto.UserDTO;
import com.wecare.iam.service.CoachService;
import com.wecare.iam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {

    @Autowired
    private UserService userService;

    @Autowired
    private CoachService coachService;

    @PostMapping("/coaches")
    public CoachDTO create(@RequestBody @Valid CoachDTO coach) {
        return coachService.createCoach(coach);
    }

    @PostMapping("/users")
    public UserDTO create(@RequestBody @Valid UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
