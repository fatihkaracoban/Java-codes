
public class Main {

	public static void main(String[] args) {
		int[] sayılar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		
		for(int i = 0; i< sayılar.length; i++) {
			if(aranacak == sayılar[i]) {
				System.out.println(aranacak + " sayısı listenin içinde var ");
				return;
			}
		}
		System.out.println(aranacak + " sayısı listede yoktur.");
	}

}
