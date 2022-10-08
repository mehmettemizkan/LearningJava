package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator productValidator = new ProductValidator(); isValid fonksiyonunu static olarak tanımlamasaydık
		// isValid çağırmak için bu kodu kullanmalıydık yan new kullanmamız gerekirdi.
		
		if (ProductValidator.isValid(product)) {
			System.out.println("Veritabanına eklendi.");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
	}
}
