package interfaces;

public class CustomerManager {

	private IcustomerDal dal ;
	
	

	public CustomerManager(IcustomerDal dal) {
		this.dal = dal;
	}



	public void add() {
		/*
		 * interfacenin içinde add() vardı tekrar neden oluşturuyoruz? Buraya iş
		 * kodlarını yazıyoruz. müşterinin adı girilmiş mi? veriler doğru mu? gibib
		 * kontroller için simüle ediliyor.
		 */

		/* OracleCustomerDal dal = new OracleCustomerDal(); dersem eğer sistem bağımlı oluyor. */
		
		dal.Add();
	
	}

}
