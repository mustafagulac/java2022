package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok guzel.";
		System.out.println(mesaj);
		
		/*
		System.out.println("Eleman sayisi : "+mesaj.length());
		System.out.println("5. Eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!")); //yazdığım şeyi mesajımızla birleştirir.
		System.out.println(mesaj.startsWith("B")); //B ile başlıyorsa true (BÜYÜK-KÜÇÜK HARF DUYARLI)
		System.out.println(mesaj.endsWith(".")); //. ile bitiyorsa true
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); //ilk 5 karakteri göstermek için
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av")); 
		System.out.println(mesaj.lastIndexOf("a"));
		*/
		
		String yeniMesaj = mesaj.replace(' ', '-'); //boşluk bırakılan yerleri çizgiye çevirdik.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2)); //gun hava cok guzel.
		System.out.println(mesaj.substring(2,4)); //gu
		
		for(String kelime: mesaj.split(" ")) { //her kelimeyi ayrı ayrı yazdırmaya yarıyor.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //tüm harfleri küçük harf yapar
		System.out.println(mesaj.toUpperCase()); //tüm harfleri büyük harf yapar
		System.out.println(mesaj.trim()); //metnin başındaki ve sonundaki boşlukları siler		

	}

}
