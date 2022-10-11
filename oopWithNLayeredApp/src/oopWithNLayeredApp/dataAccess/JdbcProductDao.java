package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır...
		//SQL bilmek gerekir.
		System.out.println("JDCB ile veritabanına eklendi");
	}
	
	
	
	
	
}

//yıllar geçiyor ve sistemi Hibernate e geçmek istiyor. O da veri erişimi yöntemlerinden birisi.

//veri tabanına erişim işleri yapılır. 
//ürün ile ilgili işleri yapıyorum