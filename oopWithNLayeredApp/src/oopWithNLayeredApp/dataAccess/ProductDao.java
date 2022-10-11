package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public interface ProductDao {

	//2 tane birbirinin alternatifi olan yöntem varsa interface eklmeeliyim ve o classları implements etmeliyim.
	
	 void add(Product product) ;
		
	
	
}
