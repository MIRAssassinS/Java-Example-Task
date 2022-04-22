package replit;

import java.util.Scanner;

public class S06 {
    public static void main(String[] args) {
        //Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        // Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        //1 şeker = 1.7 gr
        //Örnek Çıktı:
        //Yılda 12.41 kg şeker kullanıyor.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz");
        int yil=365;
        double cay = scanner.nextDouble();
        System.out.println("kac seker atiyorsunuz");
        double seker1=scanner.nextDouble();
        double seker=1.7;
        double sonuc=(cay*seker)*yil;
        System.out.println(sonuc/100);

    }
}
