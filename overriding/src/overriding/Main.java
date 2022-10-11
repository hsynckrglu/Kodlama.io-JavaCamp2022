package overriding;

import overriding.business.BaseCreditManager;
import overriding.business.StudentCreditManager;
import overriding.business.TarımCreditManager;
import overriding.business.TeacherCreditManager;

public class Main {

	public static void main(String[] args) {

//		TeacherCreditManager creditManager = new TeacherCreditManager();
//		System.out.println(creditManager.hesapla(10000)+ " TL");

	BaseCreditManager[] creditManager1 = new BaseCreditManager[] {new TeacherCreditManager(),new TarımCreditManager(), new StudentCreditManager()};
	
	for (BaseCreditManager baseCreditManager : creditManager1) {
		System.out.println(baseCreditManager.hesapla(1000));
	}
	
	}
}
