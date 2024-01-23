package com.SpringBoot.learnspringboot.controller;

import com.SpringBoot.learnspringboot.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Maxine"),
                new Course(2, "Learn Azure", "Maxi"),
                new Course(3, "Learn Google", "Max")
        );
    }

}
