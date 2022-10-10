package katmanlıYapılarDemo;

import katmanlıYapılarDemo.business.CarCreditManager;
import katmanlıYapılarDemo.business.CustomerManager;
import katmanlıYapılarDemo.business.MilitaryCreditManager;
import katmanlıYapılarDemo.business.TeacherCreditManager;
import katmanlıYapılarDemo.entities.Company;
import katmanlıYapılarDemo.entities.Customer;
import katmanlıYapılarDemo.entities.Person;

public class Main {

	public static void main(String[] args) {

		Customer customer1 = new Customer();// örneğini oluşturmak, instance oluşturmak, instance creation

		customer1.id = 1;

		customer1.city = "Giresun";

		Person person = new Person();
		person.nationalIdentity = "5558848884";
		person.firstName = "Hüseyin";
		person.lastName = "Çakıroğlu";
		
		Person person1 = new Person();
		person1.nationalIdentity = "1145148884";
		person1.firstName = "Ayşe";
		person1.lastName = "Sipahi";
		

		Company company = new Company();
		company.taxNumber = "14444144441";
		company.companyName = "Arçelik";
		company.id=1141;

		
		//Ioc Container
		CustomerManager customerManager = new CustomerManager(new Person(),new MilitaryCreditManager());
		customerManager.Save();
		customerManager.Delete();
		customerManager.giveCredit();
		
		System.out.println("***************");
		
		CustomerManager customerManager1 = new CustomerManager(new Company(),new TeacherCreditManager());
//		customerManager1.Save();
//		customerManager1.Delete();
		customerManager1.giveCredit();
		
		System.out.println("***************");

		
		CustomerManager customerManager2 = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager2.giveCredit();
		
		
		
	}

}
