package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 27;
		product.name = "Laptop";
		product.price = 12522;
		
		manager.add(product);
		
	}

}
