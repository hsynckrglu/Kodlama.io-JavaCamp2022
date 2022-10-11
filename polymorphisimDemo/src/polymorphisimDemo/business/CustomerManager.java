package polymorphisimDemo.business;

import polymorphisimDemo.logger.BaseLogger;

public class CustomerManager {
	
	BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Müşteri eklendi");
		logger.log("Log mesaji");
	}
	
	
	

}
