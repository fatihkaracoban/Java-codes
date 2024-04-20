
public class EnBüyükSayı {

	public static void main(String[] args) {
		int sayı1 = 20;
		int sayı2 = 25;
		int sayı3 = 3;
		
		if(sayı1 > sayı2){
			if(sayı1 > sayı3) {
				System.out.println("En büyük sayı sayı1'dir:" + sayı1);
			}
		}else if(sayı2 > sayı3) {
			System.out.println("En büyük sayı sayı2'dir:" + sayı2);
			
		}else {
			System.out.println("En büyük sayı sayı3'tür:" + sayı3);
		}

	}
		
}
