
public class Main {
	
//boolean ifadesi bir türlü false olmuyor.
	
	
	public static void main(String[] args) {
		char harf = 'z';
		char[] sesliHarf ={'A', 'a', 'E', 'e', 'I', 'ı', 'i','O', 'o', 'ö','U', 'u', 'ü'};
		boolean seslimi = true;
		
		for(int i = 0; i<sesliHarf.length; i++) {
			
			if(harf == sesliHarf[i]) {
				seslimi = true;
				
			}
			else if(harf != sesliHarf[i]) {	
				seslimi = false;
				
			}
			else {
				System.out.println("Geçerli harf giriniz.");
				return;
			}

		}
		if (seslimi = true) {
			System.out.println(harf + " sesli harftir.");
		}
		else {
			System.out.println(harf + " sessiz harftir.");
		}

	}

}
