package com.studentManagement.CourseService.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentManagement.CourseService.entity.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {
	@Transactional
	Optional<Course> findByCourseName(String name);

	//deleting by name
	Course deleteByName(String courseName);

}
