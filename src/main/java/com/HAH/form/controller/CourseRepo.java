package com.HAH.form.controller;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import com.HAH.form.model.Course;

@Service
@ApplicationScope
public class CourseRepo {

	private List<Course> courses = List.of(
			new Course(1, "Java Basic", 150000),
			new Course(2, "Spring Framework", 200000),
			new Course(3, "Angular", 200000),
			new Course(4, "React", 200000)
	);
	
	public List<Course> getCourses() {
		return courses;
	}

}
