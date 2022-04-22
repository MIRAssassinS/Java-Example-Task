package SoruCozumleri;

import java.util.Scanner;

public class S15_ifElse {
    public static void main(String[] args) {
        /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.



        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */

        Scanner scanner = new Scanner(System.in);

      int gun;
      int ay;
      int yil;
        System.out.println(" bir tarihi gün, ay ve yıl şeklinde giriniz...");

        System.out.println("Gun..: ");

        gun= scanner.nextInt();

        if (gun>0 && gun<31){
            System.out.print(gun);
        }else{
            System.out.println("Yanlis giris yaptiniz program sonlarniyor");
        }

        System.out.println("Ay..: ");
        ay=scanner.nextInt();

        if (ay>0 && ay<12){
            System.out.print(ay);
        }else {
                System.out.println("Yanlis giris yaptiniz program sonlarniyor");
        }

        System.out.println("yil..: ");
        yil=scanner.nextInt();

        if (yil>0){
            System.out.print(yil);
        }else{
            System.out.println("Yanlis giris yaptiniz program sonlarniyor");
        }

        System.out.println("Ay/gun/yil : "+ay+"/"+gun+"/"+yil);


        System.out.println("yil/ay/gun : "+yil+"/"+ay+"/"+gun);

    }
}
