package com.wecare.coachservice.controller;

import com.wecare.coachservice.dto.CoachDTO;
import com.wecare.coachservice.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/coaches")
public class CoachController {

    @Autowired
    private CoachService coachService;

    @PostMapping
    public CoachDTO create(@RequestBody @Valid CoachDTO coach) {
        return coachService.createCoach(coach);
    }

}
