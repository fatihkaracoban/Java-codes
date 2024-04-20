
public class Main {

	public static void main(String[] args) {
		int sayı1 = 220;
		int sayı2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i = 1; i<sayı1; i++) {
			if(sayı1 % i == 0) {
				toplam1 = toplam1 + i;
				
			}
		}
		for(int i = 1; i<sayı2; i++) {
			if(sayı2 % i == 0) {
				toplam2 = toplam2 + i;
			}
			
		}
		if(sayı1 == toplam2 && sayı2 == toplam1) {
			System.out.println(sayı1 + " ve " + sayı2 + " arkadaş sayılardır.");
			
		}else {
			System.out.println(sayı1 + " ve " + sayı2 + " arkadaş sayı değildirler.");
			
		}
		
	}

}
