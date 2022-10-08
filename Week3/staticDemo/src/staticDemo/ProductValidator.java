package staticDemo;

public class ProductValidator { // productValidator genelde bir ürünü kaydederken / güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanırız
	
	public static boolean isValid(Product product) {
		
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void hesapla() {
		System.out.println("Hesaplandı.");
	}

	
}
