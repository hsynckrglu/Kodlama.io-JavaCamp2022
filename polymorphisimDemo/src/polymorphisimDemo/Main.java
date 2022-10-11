package polymorphisimDemo;

import polymorphisimDemo.business.CustomerManager;
import polymorphisimDemo.logger.BaseLogger;
import polymorphisimDemo.logger.ConsoleLogger;
import polymorphisimDemo.logger.EmailLogger;
import polymorphisimDemo.logger.FileLogger;
import polymorphisimDemo.logger.databaseLogger;

public class Main {

	public static void main(String[] args) {
	
//	BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new EmailLogger(), new databaseLogger(), new ConsoleLogger()};
//
//	for (BaseLogger logger : loggers) {
//		logger.Log("Log mesajı :)");
//		
//	}
		
		CustomerManager customerManager = new CustomerManager(new databaseLogger());
		
		customerManager.add();
		
		
	}

}
