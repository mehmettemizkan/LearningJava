package kodlamaioNLayeredApp.entities;

public class Course {
	private int id;
	private String name;
	private String categoryName;
	private double unitPrice;
	private String instructorName;	
	
	public Course() {
	}

	public Course(int id, String name, String categoryName, double unitPrice, String instructorName) {
		this.id = id;
		this.name = name;
		this.categoryName = categoryName;
		this.unitPrice = unitPrice;
		this.instructorName = instructorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	

	
	
	
	
}
