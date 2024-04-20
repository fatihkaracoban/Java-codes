
public class Main2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
		//Değiştirmek istediğin ve yerine ne koyacağını seçerek yeni string oluşturabilirsin.
		System.out.println(mesaj.replace(" ", "-"));
		
		//Seçtiğimiz indexten başlayarak yazdırır.
		//İkinci de ise istediğimiz bir index aralığını kesip yazdırabiliriz.
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		
		//Kelimeleri ayırır ve ayrı ayrı bir dizi halinde yazdırır.
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		//String ifadesinideki her şeyi küçük yapar.
		//İkinci de ise ifadeyi büyük yapar.
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		String cümle = "  Karanlıktı ama tünelin sonundaki ışığı gördüm.   ";
				
		//Mesajın başındaki ve sonundaki boşlukları var ise siler.
		System.out.println(cümle);
		System.out.println(cümle.trim());
	}

}
