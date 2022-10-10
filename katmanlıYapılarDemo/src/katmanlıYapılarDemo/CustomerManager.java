package katmanlıYapılarDemo;

public class CustomerManager {


	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {

		System.out.println("CustomerManager nesnesi çalıştı");
		_customer = customer;
		_creditManager=creditManager;

	}

	public void Save() {
		System.out.println("Müşteri eklendi");
	}

	public void Delete() {
		System.out.println("Müşteri silindi ");
	}
	
	
	public void giveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");
	}

}