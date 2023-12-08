package com.Assessment01SpringBootRestAPI.Assessment01.Controller;

import com.Assessment01SpringBootRestAPI.Assessment01.Entity.Course;
import com.Assessment01SpringBootRestAPI.Assessment01.Service.CourseService;
import com.oracle.svm.core.annotate.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/createCourse")
    public Course createCourse(@RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("/findCourse/{id}")
    public Optional<Course> findCourseById(@PathVariable int id){

        return courseService.findCourseById(id);
    }

    @GetMapping("/findAllCourses")
    public List<Course> getAllCourses(){
        return courseService.findAllCourses();
    }

    @GetMapping("/countCourses")
    public long countAllCourses(){
        return courseService.countCourses();
    }

    @DeleteMapping("/delCourse/{id}")
    public String deleteCourseById(@PathVariable int id){
        courseService.deleteCourseById(id);
        return id+" deleted successfully ";
    }

    @GetMapping("/isPresentCourse/{id}")
    public boolean isCoursePresent(@PathVariable int id){
        return courseService.doesCourseExists(id);
    }

//    @PutMapping("/updateCourse")
//    public Course updateCourse(@RequestBody Course course){
//        return courseService.updateCourseEntity(course);
//    }
}
