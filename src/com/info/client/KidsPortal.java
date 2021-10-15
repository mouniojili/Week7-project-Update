package com.info.client;

import com.info.service.CourseFactory;
import com.info.service.LearningPortal;

public class KidsPortal {

	
	public static void main(String[] args) {
		
		//Factory pattern to create objects 
		
		CourseFactory courseFactory = new CourseFactory();
		
		LearningPortal learningPortal =  courseFactory.getInstance("course_type");
		
		//Iterator pattern to show all the course 
		
		
		//Observer pattern to show exam alert 
		
		
	}
}
