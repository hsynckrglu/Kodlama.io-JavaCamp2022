package getterSetter;

import getterSetter.business.ProductManager;
import getterSetter.entities.Product;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();

		product.setId(11515454);
		product.setColour("pink");
		product.setName("Sunglasses");
		product.setPrice(1500);
		product.setStockAmount(30);
		product.setDescription("UV protected");

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());

		Product product2 = new Product(15, "Washing Machine","washing clothes",9000,15,"Gray");
		
		productManager.add(product2);
		product2.getKod();

	}

}
