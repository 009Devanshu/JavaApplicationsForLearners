package com.devanshu.boot.practicspringbootdemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> getCourses(){
		return Arrays.asList(
				new Course(1,"Learn DevOps","in28minutes"),
				new Course(2,"Learn Spring Boot","in28minutes")
				);
	}
}
