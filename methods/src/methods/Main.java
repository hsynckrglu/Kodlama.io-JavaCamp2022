package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(4);
		sayiBulmaca(41);
		sayiBulmaca(0);
		sayiBulmaca(3);
		sayiBulmaca(7);

	}
	
	public static void sayiBulmaca(int aranacak) {
		
	int [] sayilar = new int [] {1,2,3,5,9,8,4,0,4,6};
		
		
		boolean varMı=false;
		
		for(int sayi: sayilar){
			if(sayi==aranacak) {
				varMı=true;
				break;
			}
		}
		if(varMı) {
			System.out.println("sayı mevcuttur: "+aranacak);
		}
		else {
			System.out.println("sayı mevcut değildir: "+aranacak);
		}
	
		
		
		
		
	}

}
