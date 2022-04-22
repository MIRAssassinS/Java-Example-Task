package replit;

import java.util.Scanner;

public class S19 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın
        //Kullanicidan alinan isim uzunluğu en az 2 olacaktır.
        //INPUT : Mustafa
        //OUTPUT : fafafa

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir isim girin");
         String isim="Mustafa";
         String str=scanner.next();
        System.out.println("2 harf giriniz");
        String str2=scanner.next();


        System.out.println(isim.substring(5)+isim.substring(5)+isim.substring(5));





    }
}
