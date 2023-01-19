package com.wecare.coachservice.controller;

import com.wecare.coachservice.client.CoachClient;
import com.wecare.coachservice.dto.CoachDTO;
import com.wecare.coachservice.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/coaches")
public class CoachController implements CoachClient {

    @Autowired
    private CoachService coachService;

    @PostMapping
    public CoachDTO create(@RequestBody @Valid CoachDTO coach) {
        return coachService.createCoach(coach);
    }

    @GetMapping
    public String get() {
        return "Get Mapping";
    }
}