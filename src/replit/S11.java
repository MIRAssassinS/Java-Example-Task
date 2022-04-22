package replit;

import java.util.Scanner;

public class S11 {
    public static void main(String[] args) {
        //Kullanıcıdan dakika girmesini isteyin,
        // Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        //INPUT:Dakika sayısı: 3456789
        // OUTPUT :3456789 dakika yaklaşık 6 yıl 210 gündür

        Scanner scanner=new Scanner(System.in);
        System.out.println("dakika giriniz");
        int dakika=scanner.nextInt();
        int gun=scanner.nextInt();
        int yil=scanner.nextInt();

        int dakika1=dakika*60;
        int gun1=gun*24;
        int yil1=yil*365;
        int toplam=dakika1+gun1+yil1;

        System.out.println("dakika :"+dakika+"\n gun :"+gun+"\n yil "+yil+"\n toplam :"+toplam);



    }
}
