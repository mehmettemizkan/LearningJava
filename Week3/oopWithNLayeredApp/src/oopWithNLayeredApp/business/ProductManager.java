package oopWithNLayeredApp.business;
import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { //bir logger değil de birden çok logger yolla demiş oluyoruz
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception { 
		// aşağıdaki if ile iş kuralları eklemiş oluyoruz. Ürünler istediğimiz şekilde gelmezse programa hata verdiriyoruz.
		if (product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz.");
		}

		productDao.add(product);
		
		for (Logger logger : loggers) { // [db,file,]
			logger.log(product.getName());
		}
	}
}
