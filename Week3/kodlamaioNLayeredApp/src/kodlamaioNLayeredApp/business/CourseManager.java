package kodlamaioNLayeredApp.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioNLayeredApp.core.logging.Logger;
import kodlamaioNLayeredApp.dataAccess.CourseDao;

import kodlamaioNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao; // burası ne işe yarar oopWithNLayeredApp projesinde açıkladım.
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] logger) {
		this.courseDao = courseDao;
		this.loggers = logger;

	}
	
	//List<int[]> idList = new ArrayList<int[]>();
	List<Integer> idList = new ArrayList<Integer>();	
	List<String> categoryList = new ArrayList<String>();	

	public void add(Course course) throws Exception {

		// Course properties
		if (course.getUnitPrice() < 0 
			|| course.getName().isEmpty() || course.getCategoryName().isEmpty() || course.getInstructorName().isEmpty() 
			|| idList.contains(course.getId()) || categoryList.contains(course.getCategoryName())) 
		{
			throw new Exception("Course information is invalid. No parameter can be empty. Id and Category Name cannot be repeated.");
		} else {
			categoryList.add(course.getCategoryName());//This add is a collection. not the void add(Course course)
			idList.add(course.getId());
		}
		

		// Database properties
		courseDao.addToDatabase(course);
		for (Logger logger : loggers) {
			logger.log(course.getName());
			;
		}
	}

}
