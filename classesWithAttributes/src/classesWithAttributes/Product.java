package classesWithAttributes;

public class Product {
	// attribute | field
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String code;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	String getCode() {
		return name.substring(0, 3) + id;
	}

//	public int getId() {
//		return _id;
//	}	
//	public void setId(int id) {
//		_id = id;
//	}

}
