package interfaceDemo.worker;

import interfaceDemo.business.IMaintenance;
import interfaceDemo.business.IWorkable;

public class RobotWorker implements IMaintenance, IWorkable{

	@Override
	public void maintenance() {


		System.out.println("Robotun bakımı yapıldı...");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

}
