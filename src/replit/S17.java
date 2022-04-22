package replit;

import java.util.Locale;
import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
        //Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
        //Eger aynı karakterlere sahipse
        //"isim ayni karakterlere sahiptir." yazdirin.
        //Eger ayni kaakterlere sahip degilse
        //"Dizenin benzersiz karakterleri var" yazdirin.
        //Ternary kullanin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String isim = scanner.next().toLowerCase();
        String yeniIsim = "";
        int uzunluk = 3;
        if (isim.length() > 3) {
            System.out.println("isminiz uc harften uzundur");
        } else if (isim.length() <= 3) {
            System.out.println(isim.charAt(0) == isim.charAt(1) || isim.charAt(0) == isim.charAt(2) ||
            isim.charAt(1) == isim.charAt(2) ? "isim ayni karakterlere sahiptir" : "Dizenin benzersiz karakterleri var");


        }
    }
    }
