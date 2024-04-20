
public class Main {

	public static void main(String[] args) {
		int number = 0;
		int remainder = number % 2;
		System.out.println(remainder);
		
		System.out.println(" ");
		
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println(number + " sayısı asal değildir.");
			return;
		}
		
		if(number<1) {
			System.out.println(number + " sayısı geçersiz bir sayıdır 2 veya 2'den büyük bir sayı giriniz.");
			return;
		}
		
		for(int i = 2; i<number; i++) {
			if(number % i == 0) {
				isPrime = false;
			}
			
		}
		if(isPrime == true) {
			System.out.println(number + " sayısı bir asal sayıdır.");
		}
		else{
			System.out.println(number + " sayısı  bir asal sayı değildir.");
		}

	}

}
