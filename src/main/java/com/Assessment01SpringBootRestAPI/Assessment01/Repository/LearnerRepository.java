package com.Assessment01SpringBootRestAPI.Assessment01.Repository;

import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnerRepository extends JpaRepository<Learner, Integer> {
}
