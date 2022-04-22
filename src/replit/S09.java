package replit;

import java.util.Scanner;

public class S09 {
    public static void main(String[] args) {
       //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        //Örnek Çıktı:
        //Verilen tamsayının rakamları toplamı 10'dur.

        Scanner scanner=new Scanner(System.in);
        System.out.println("uc basamakli bir sayi giriniz");
        int sayi=scanner.nextInt();
        int toplam=0;
        int adet=0;

        while (sayi !=0){
            toplam =(sayi%10)+toplam;
            sayi/=10;
            adet++;

        }
        System.out.println("Basamaklarin toplami :"+toplam);

    }
}
