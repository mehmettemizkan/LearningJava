package kodlamaioNLayeredApp;

import kodlamaioNLayeredApp.business.CourseManager;
import kodlamaioNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioNLayeredApp.core.logging.FileLogger;
import kodlamaioNLayeredApp.core.logging.Logger;
import kodlamaioNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioNLayeredApp.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Course course1 = new Course(1, "Java", "Backend", 500, "Engin Demirog");
		Course course2 = new Course(2, "Javascript", "Frontend", 500, "Mehmet Temizkan");
		Course course3 = new Course(3,"React", "Frontend", 500, "Mehmet Temizkan"); // Throw. Because category name is the same.
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		

	}

}
