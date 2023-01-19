package com.wecare.coachservice.repository;

import com.wecare.coachservice.domain.Coach;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoachRepository extends MongoRepository<Coach,String> {
}
