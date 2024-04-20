
public class Main {

	public static void main(String[] args) {
		String öğrenci1 = "Fatih";
		String öğrenci2 = "Mustafa";
 		String öğrenci3 = "Mehmet";
		String öğrenci4 = "Hatice";
		String öğrenci5 = "Hande";
		String öğrenci6 = "Gizem";
		String öğrenci7 = "Sıla";
		String öğrenci8 = "Sude";
		
		System.out.println(öğrenci1);
		System.out.println(öğrenci2);
		System.out.println(öğrenci3);
		System.out.println(öğrenci4);
		System.out.println(öğrenci5);
		System.out.println(öğrenci6);
		System.out.println(öğrenci7);
		System.out.println(öğrenci8);
		
		System.out.println("---------------------------------------------");
		
		String[] öğrenciler = new String[8];
		öğrenciler[0] = "Fatih";
		öğrenciler[1] = "Mustafa";
		öğrenciler[2] = "Mehmet";
		öğrenciler[3] = "Hatice";	
		öğrenciler[4] = "Hande";	
		öğrenciler[5] = "Gizem";	
		öğrenciler[6] = "Sıla";	
		öğrenciler[7] = "Sude";	
		
		for(int i=0;i<öğrenciler.length;i++) {
			
			System.out.println(öğrenciler[i]);
		}
		
		System.out.println("---------------------------------------------");
		
		for(String öğrenci:öğrenciler) {
			System.out.println(öğrenci);
			
		}
		
	}

}
