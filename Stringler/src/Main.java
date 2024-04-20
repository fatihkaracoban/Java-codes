
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		System.out.println(mesaj);
		
		//Uzunluğunu söyler.
		System.out.println("Mesaj uzunluğu: " + mesaj.length());
		
		//İndexteki elemanı yazdırır.
		System.out.println("5. Eleman: " + mesaj.charAt(4));
		
		//Stringe ekleme yapar.
		System.out.println(mesaj.concat(" Yaşasın!"));
		
		//Seçtiğimiz karakter ile başlıyorsa True başlamıyorsa False döndürür.
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("A"));
		
		//Seçtiğimiz karakter ile bitiyorsa True bitmiyorsa False döndürür.
		System.out.println(mesaj.endsWith("."));
		System.out.println(mesaj.endsWith("s"));
		
		//Alttaki örnekte 0'dan başlayarak ilk 5 indexteki elemanları karakter değişkenine atadı.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		//İlki baştan arayarak o karakterin metinde kaçıncı indexte olduğunu söyler
		//İkinci de ise o karakterin kaçıncı indexte olduğunu söyler lakin aramaya soldan değil sağdan başlar.
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('e'));
		
		
	}

}
