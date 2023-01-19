package com.wecare.iamservice.controller;

import com.wecare.iamservice.client.CoachClient;
import com.wecare.iamservice.dto.CoachDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/registration")
public class RegistrationController {


    private CoachClient coachClient;

    @Autowired
    public RegistrationController(CoachClient coachClient) {
        this.coachClient = coachClient;
    }

    @GetMapping
    public String test(){
        return coachClient.get();
    }

    @PostMapping("/coaches")
    public ResponseEntity<CoachDTO> createCoach(@RequestBody @Valid CoachDTO coachDTO){
        return new ResponseEntity<>(coachClient.create(coachDTO), HttpStatus.CREATED);
    }
}
