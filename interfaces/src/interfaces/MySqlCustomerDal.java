package interfaces;

public class MySqlCustomerDal implements IcustomerDal{

	/* classlar birden fazla interfaceyi implemente edebilir
	 * fakat sadece bir tane classı ya da abstract classı inheritance edebilir.*/
	
	@Override
	public void Add() {
		System.out.println("MySql eklendi");
		
	}

	/* Dal --> data access layer -veri erişim katmanı- */

	
	
}
