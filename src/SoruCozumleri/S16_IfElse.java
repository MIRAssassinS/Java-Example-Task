package SoruCozumleri;

import java.util.Scanner;

public class S16_IfElse {
    public static void main(String[] args) {

         /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("vize notu");
        int vize = scan.nextInt();
        System.out.println("final notu");
        int final1=scan.nextInt();
        System.out.println("vize not ortalamasi");
        double vizeOrt= scan.nextDouble();
        System.out.println("final not ortalamasi");
        double fin_ort= scan.nextDouble();
        double ortalama=(double)(vize*vizeOrt/100)+(double)(final1*fin_ort/100);
        if (ortalama<50){
            System.out.println("malesef dersten kaldiniz");
        }else {
            System.out.println("tebrikler dersi gectiniz");
        }






    }
}
