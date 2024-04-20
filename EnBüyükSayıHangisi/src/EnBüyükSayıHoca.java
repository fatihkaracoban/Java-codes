
public class EnBüyükSayıHoca {

	public static void main(String[] args) {
		int sayı1 = 20;
		int sayı2 = 25;
		int sayı3 = 3;
		
		int EnBüyükSayı = sayı1;
		
		if(EnBüyükSayı < sayı2) {
			EnBüyükSayı = sayı2;
			
		}
		
		if(EnBüyükSayı < sayı3) {
			EnBüyükSayı = sayı3;
			
		}
		
		System.out.println("En Büyük Sayı:" + EnBüyükSayı);
		
	}

}
