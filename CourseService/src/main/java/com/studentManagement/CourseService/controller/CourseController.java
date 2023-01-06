package com.studentManagement.CourseService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentManagement.CourseService.entity.Course;
import com.studentManagement.CourseService.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseService courseService;

	@DeleteMapping("/{name}")
	public void deletecourse(@PathVariable("name") String courseName) {
		courseService.deleteCourse(courseName);

	}
	
	@GetMapping("/allCourses")
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}

	@PostMapping("/")
	public Course saveCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}

	@GetMapping("/")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}

	@GetMapping("/{name}")
	public Optional<Course> getCourseById(@PathVariable("name") String name) {
		return courseService.getCourseById(name);
	}

}
