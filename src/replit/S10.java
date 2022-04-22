package replit;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
         //Girilen zamanı saniyeye çeviren bir program yazınız.
        //Örnek Çıktı:
        //1 saat 10 dakika 50 saniye ==>4250 saniye

        Scanner scanner = new Scanner(System.in);
        System.out.println("saat giriniz");
        int saat=scanner.nextInt();
        System.out.println("dakika");
        int dakika=scanner.nextInt();
        System.out.println("saniye");
        int saniye=scanner.nextInt();

        int saniye1=saniye;
        int dakika1=dakika*60;
        int saat1=saat*60*60;
        int toplam=saniye1+dakika1+saat1;

        System.out.println("saniye : "+saniye+" dakika : "+dakika+" saat :"+saat+" toplam :"+toplam);




    }
}
