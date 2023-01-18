package com.wecare.iam.service;

import com.wecare.iam.domain.Coach;
import com.wecare.iam.dto.CoachDTO;
import com.wecare.iam.repository.CoachRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachRepository coachRepository;

    @Override
    public CoachDTO createCoach(CoachDTO coachDTO) {
        Coach coach = new Coach();
        BeanUtils.copyProperties(coachDTO, coach);
        Coach savedCoach = coachRepository.save(coach);
        BeanUtils.copyProperties(savedCoach, coachDTO);
        return coachDTO;
    }
}
