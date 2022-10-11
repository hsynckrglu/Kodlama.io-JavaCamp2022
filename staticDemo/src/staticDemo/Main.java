package staticDemo;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.id=123456;
		product.name="Soğutucu";
		product.price=289.90;
		product.stockAmount=10;
		
		ProductManager manager =new ProductManager();
		manager.add(product);

	}

}
