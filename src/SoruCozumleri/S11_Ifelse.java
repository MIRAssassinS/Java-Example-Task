package SoruCozumleri;

import java.util.Scanner;

public class S11_Ifelse {
    /* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char  harf=scanner.next().charAt(0);

        if (harf>='a'&& harf<='z'){
            System.out.println("Kucuk harf");
        }else if (harf>= 'A'&& harf<='Z'){
            System.out.println("Buyuk harf");
        }else{
            System.out.println("hatali giris yaptiniz");
        }











    }



}
