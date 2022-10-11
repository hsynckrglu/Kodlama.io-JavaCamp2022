package interfaceDemo.worker;

import interfaceDemo.business.IWorkable;

public class OutsourceWorker implements IWorkable {

	@Override
	public void work() {
		System.out.println("çalışıyor..");
		
	}

}
