package overriding.business;

public class StudentCreditManager extends BaseCreditManager {
	
	public double hesapla(double tutar) {
		return tutar*1.10;
		
	}
	

}
