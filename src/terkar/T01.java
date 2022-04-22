package terkar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        //Bir tamsayı dizisindeki en büyük ve en küçük değerler arasındaki farkı bulan bir Java programı yazın.
        // Dizinin uzunluğu 1 ve üzeri olmalıdır

        Scanner scan = new Scanner(System.in);

        System.out.println("dizenin uzunlugunu giriniz");
        int uzunluk = scan.nextInt();
        List<Integer> rakam = new ArrayList<>();
        /*if (uzunluk < 1) {
            System.out.println("yanlis giris");
        } else {

         */

            while (uzunluk != rakam.size()) {
                System.out.println("rakam giriniz");
                int sayi = scan.nextInt();
                rakam.add(sayi);
            }



        int kucukSayi = 0;
        int buyukSayi = 0;
        for (int i = 0; i < rakam.size(); i++) {
            if (rakam.get(i) > buyukSayi)
                buyukSayi = rakam.get(i);
            else if (rakam.get(i) < kucukSayi)
                kucukSayi = rakam.get(i);


        }
        //System.out.println("kucuk sayi = " + kucukSayi + "buyuk sayi =" + buyukSayi);
        System.out.println(buyukSayi-kucukSayi);
    }


}



