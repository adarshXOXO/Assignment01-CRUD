package com.Assessment01SpringBootRestAPI.Assessment01.Repository;

import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
