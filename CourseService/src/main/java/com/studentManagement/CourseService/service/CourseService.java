package com.studentManagement.CourseService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentManagement.CourseService.entity.Course;
import com.studentManagement.CourseService.repo.CourseRepo;

@Service
public class CourseService {

	@Autowired
	CourseRepo courseRepo;

	public Course saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}

	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	public Optional<Course> getCourseById(String name) {
		// TODO Auto-generated method stub
		return courseRepo.findByCourseName(name);
	}

	public void deleteCourse(String courseName) {
		courseRepo.deleteByName(courseName);
	}

}
