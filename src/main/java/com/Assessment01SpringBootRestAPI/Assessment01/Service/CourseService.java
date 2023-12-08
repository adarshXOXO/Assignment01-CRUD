package com.Assessment01SpringBootRestAPI.Assessment01.Service;

import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Course;
import com.Assessment01SpringBootRestAPI.Assessment01.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public Optional<Course> findCourseById(int id) {
        Optional<Course> tempCourse = courseRepository.findById(id);
        if (tempCourse.isEmpty()) {
            System.out.println("Course doesnt exist");
        }
        return courseRepository.findById(id);
    }

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public long countCourses() {
        return courseRepository.count();
    }

    public void deleteCourseById(int id) {
        Optional<Course> tempCourse = courseRepository.findById(id);
        if (tempCourse.isEmpty()) {
            System.out.println("Course doesnt exist");
        }
        courseRepository.deleteById(id);
    }

    public boolean doesCourseExists(int id) {
        Optional<Course> tempCourse = courseRepository.findById(id);
        return tempCourse.isPresent();
    }

//    public Course updateCourse(Course course){
//        int tempid = course.getCourse_Id();
//        if(tempid == null){
//            System.out.println("course id is null");
//        }
//
//        Optional<Course> tempCourse = courseRepository.findById(tempid);
//        if (tempCourse.isEmpty()){
//            System.out.println("Course doesnt exist");
//        }
//        else if(course.getCourse_description()==null || course.getCourse_name()==null){
//            System.out.println(" something is null");
//        }
//         return course;
//        }

}
