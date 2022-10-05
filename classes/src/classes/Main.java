package classes;

public class Main {

	public static void main(String[] args) {
		
		//reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Updade();
		
		//value Type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2); //sayi2= 10

		System.out.println("***************");
		
		//diziler referans tiplidir
		int[] sayilar1= new int[] {1,2,3};
		int[] sayilar2= new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
	
	   for(int i=0;i<sayilar1.length;i++) {
		   System.out.println(sayilar1[i]);
	   }
	   
	   System.out.println("***************");
	   
	   for(int i=0;i<sayilar2.length;i++) {
		   System.out.println(sayilar2[i]);
	   }
	
		
	}

}
