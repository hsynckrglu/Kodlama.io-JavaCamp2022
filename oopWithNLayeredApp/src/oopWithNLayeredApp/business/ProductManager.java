package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	
	private ProductDao productDao;
	
	private Logger[] loggers;
	
	

	public ProductManager(ProductDao productDao,Logger[] loggers) {
	
		this.productDao = productDao;
		this.loggers=loggers;
	}



	//aynı isimde ürüm eklememek iş kuralıdır. Domaine göre iş kuralları olur.
	
	public void add(Product product) throws Exception {
		
		//iş kuralları yazılır. --> business rules
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
			//throw -->fırlat demek 
			// fırlat yeni hata -->program koşarken hata fırlatırsa program durur orada kesilir.
		}
		//JdbcProductDao productDao = new JdbcProductDao();
		//ProductDao productDao = new JdbcProductDao();
		
		productDao.add(product);
		
		
		for (Logger logger : loggers) { // [db,file,mail]
			
			logger.log(product.getName());
		}
		
	}

}
