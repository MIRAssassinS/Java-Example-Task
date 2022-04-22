package SoruCozumleri;

import java.util.Scanner;

public class S09_ifElse {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas = scanner.nextInt();
        System.out.println("kilonuzu giriniz");
        int kilo = scanner.nextInt();


        if (yas > 0 && yas < 18) {
            System.out.println(" yasinizi 18 den kucuk kan bagisi yapmazssiniz");
        } else if (yas >= 18) {

            if (kilo >= 0 && kilo < 50) {
                System.out.print("Yasiniz yeterli am kilo yetersiz kan bagisi yapamasiniz :");
            } else if (kilo >= 50) {
                System.out.println("Sartlara uygunsunuz kan bagisi yapabilirisiniz");
            } else System.out.println("kilonuzu hatali girdiniz");
        } else System.out.println("yasinizi hatali girdiniz");
    }
}






