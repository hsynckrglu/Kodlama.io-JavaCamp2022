package sayıBulma;

public class Main {

	public static void main(String[] args) {
		
		int [] sayilar = new int [] {1,2,3,5,9,8,4,0,4,6};
		
		int aranacak = 5;
		boolean varMı=false;
		
		for(int sayi: sayilar){
			if(sayi==aranacak) {
				varMı=true;
				break;
			}
		}
		if(varMı) {
			System.out.println("sayı mevcuttur");
		}
		else {
			System.out.println("sayı mevcut değildir");
		}
	

	}

}
