package getterSetter.entities;

public class Product {

	
	
	//attritube |  field
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _colour;
	private String _kod;


	public Product() {
		System.out.println("Yapıcı blok --> constuctor çalıştı");
	}
	
	
	
	public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _colour) {
		
		this._id = _id;
		this._name = _name;
		this._description = _description;
		this._price = _price;
		this._stockAmount = _stockAmount;
		this._colour = _colour;
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;

		// herhangi bir set metodunda this.degiskenAdi o classtaki degiskeni ifade eder.
		// this.degiskenAdi= degiskenAdi --> sağdaki dgiskenAdi ise set metodundaki
		// degiskenAdi'dir.

		/*
		 * bazen set metodunu elle yazdığımız durumlarda ise this yazmayı
		 * unutabiliyoruz. bu tür hataların önüne geçebilmek adına classtaki
		 * degiskenleri tanımlarken _degiskenAdi syntaxında tanımlamak karısıklıgın
		 * önüne gecebilir. buna best practise denilir.
		 */

	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public String getColour() {
		return _colour;
	}

	public void setColour(String colour) {
		_colour = colour;
	}

	public String getKod() {
		return _name.substring(0, 1) + _id; //ismin ilk harfi +id --> kod
		//kodun kullanıcının girmesini set metodunu yazmayarak engellemiş bulunuyorum.
	}


}
