package replit;

import java.util.Scanner;

public class S13 {
    public static void main(String[] args) {
        //Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
        //Input :
        //John White
        //151231251251
        //Output : Name :
        //J* W**
        //CCN : ** ** **** 1478
        //Ilk Harfler Buyuk harf ile baslamalidir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adıniz, Soyadıniz ve kredi kartı numaranizi giriniz");
        String adi = scanner.next();
        String soyad=scanner.next();
        String krediKarti="1234567890121478";

        String adi1=adi.substring(0,1).toUpperCase()+adi.substring(1).replaceAll("\\S","*");
        String soyad2=soyad.substring(0,1).toUpperCase()+soyad.substring(1).replaceAll("\\S","*");
        String krediKarti2="************"+ krediKarti.substring(12);


        System.out.println("adi - soyadi :"+adi1+"  "+soyad2+"\n kart no :"+krediKarti2);



    }
}
