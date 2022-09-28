package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();

		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus");
		product.setPrice(1500);
		product.setStockAmount(3);
		
	ProductManager productManager = new ProductManager();
	productManager.Add(product);

	}

}
