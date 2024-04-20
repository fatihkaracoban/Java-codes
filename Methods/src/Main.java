
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		String yenimesaj = şehirVer();
		System.out.println(yenimesaj);
		
		int sayı = topla(5,7);
		System.out.println(sayı);
		
		int sayı2 = topla2(1,2,3,4,5,6,7,8,9);
		System.out.println(sayı2);
		
	}
	
	public static void ekle() {
		
	}
	
	public static void sil() {
		
	}
	
	public static void güncelle() {
		
	}
	
	public static int topla(int sayı1, int sayı2) {
		return sayı1 + sayı2;
	}
	
	public static int topla2(int... sayılar) {
		int toplam = 0;
		for(int sayı: sayılar) {
			toplam += sayı;
		}
		return toplam;
	}
	
	public static String şehirVer() {
		return "Ankara";
	}
	

}
