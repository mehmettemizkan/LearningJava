package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao{

	public void addToDatabase(Course course) {
		System.out.println("Added to database with Hibernate.");
	}
}