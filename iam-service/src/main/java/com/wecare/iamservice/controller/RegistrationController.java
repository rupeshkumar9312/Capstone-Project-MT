package com.wecare.iamservice.controller;

import com.wecare.iamservice.client.CoachClient;
import com.wecare.iamservice.client.UserClient;
import com.wecare.iamservice.dto.CoachDTO;
import com.wecare.iamservice.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController implements UserClient,CoachClient{


    @Autowired
    private CoachClient coachClient;

    @Autowired
    private UserClient userClient;

    @Override
    @PostMapping("/coaches")
    public CoachDTO create(CoachDTO coach) {
        return coachClient.create(coach);
    }

    @Override
    public String get() {
        return null;
    }

    @Override
    @PostMapping("/users")
    public UserDTO create(UserDTO userDTO) {
        return userClient.create(userDTO);
    }

    @Override
    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUser(String userId) {
        return userClient.getUser(userId);
    }
}
