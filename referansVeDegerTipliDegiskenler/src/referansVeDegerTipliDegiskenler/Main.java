package referansVeDegerTipliDegiskenler;

public class Main {

	public static void main(String[] args) {


		//referans tipli
		int[] sayilar1 = {1,2,3};
		int[] sayilar2=	{10,20,30};	
		
		sayilar1=sayilar2;
		
		sayilar1[0]=1000;
		System.out.println(sayilar2[0]);
		
		//değer tipli
		int sayi1=10;
		int sayi2=20;
		sayi1=sayi2;
		System.out.println(sayi1);
		
	}

}