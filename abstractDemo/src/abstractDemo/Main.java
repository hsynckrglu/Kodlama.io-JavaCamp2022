package abstractDemo;

public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager = new CustomerManager();
//		customerManager.databaseManager = new MySqlDatabaseManager();
//		customerManager.getCustomer();

		BaseDatabaseManager baseDatabaseManager= new MySqlDatabaseManager();
		baseDatabaseManager.getData();
		
	}

}
