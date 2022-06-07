import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {
		// Ebob Ekok programi yapiyoruz 
		//EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne 
		//bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
		
		 int sayi1, sayi2, kucukSayi, buyukSayi;

	        Scanner inp = new Scanner(System.in);
	        System.out.print("Birinci sayıyı giriniz: ");
	        sayi1 = inp.nextInt();
	        System.out.print("İkinci sayıyı giriniz:");
	        sayi2 = inp.nextInt();

	        if (sayi1 > sayi2) {
	            kucukSayi = sayi2;
	            buyukSayi = sayi1;
	        } else {
	            kucukSayi = sayi1;
	            buyukSayi = sayi2;
	        }

	        for (int i=kucukSayi; i>= 1; i--) {
	            if (sayi1 % i == 0 && sayi2 % i == 0) {
	                System.out.println("EBOB: " + i);
	                break;
	            }
	        }

	        for (int i=buyukSayi; i <= sayi1 * sayi2; i++) {
	            if (i % sayi1 == 0 && i % sayi2 == 0) {
	                System.out.println("EKOK: " + i);
	                break;
	            }
	        }
	}

}
