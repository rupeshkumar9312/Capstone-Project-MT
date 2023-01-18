package com.wecare.iam.repository;

import com.wecare.iam.domain.Coach;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoachRepository extends MongoRepository<Coach,String> {
}
