package com.studentManagement.CourseService.repo;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentManagement.CourseService.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Integer>{
    @Transactional
	Optional<Course> findByCourseName(String name);

}
