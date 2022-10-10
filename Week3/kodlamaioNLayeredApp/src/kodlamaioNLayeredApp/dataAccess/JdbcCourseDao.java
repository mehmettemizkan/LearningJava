package kodlamaioNLayeredApp.dataAccess;

import kodlamaioNLayeredApp.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void addToDatabase(Course course) {
		System.out.println("Added to database with JDBC.");
	}
}
