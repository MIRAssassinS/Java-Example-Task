package SoruCozumleri;

import java.util.Scanner;

public class S14_IfElse {
    public static void main(String[] args) {
        
        /* TASK :
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
        54 hız sınırıdır.
        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

                -----------------------------------------
                Örn;

        currentSpeed(Hızınız) 87
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

        sonuç 320 olmalıdır.

                currentSpeed(Hızınız) 65
        ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

        sonuç 300 olmalıdır.
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("ehliyetniz var ise -->1 yoksa --->0 yaziniz");
        int ehliyet = scan.nextInt();
        if (ehliyet == 0 || ehliyet == 1) {
            if (ehliyet == 0) {
                System.out.println("Hiz siniri sorulmadan 200$ ");
            }
            System.out.println("hizinizi giriniz :");
            int hiz = scan.nextInt();
            if (ehliyet == 1) {
                if (hiz < 0) {
                    System.out.println("negatif hiz olmaz hatali veri girdiniz");
                } else if (hiz >= 55 && hiz < 74) {
                    System.out.println("Cezaniz 100$");
                } else if (hiz >= 75 && hiz < 84) {
                    System.out.println("Cezaniz 150 $");
                } else if (hiz >= 85 && hiz < 94) {
                    System.out.println("Cezaniz 320 $");
                } else if (hiz > 94) {
                    System.out.println("Cezaniz 500 $");
                } else System.out.println("Hiz sinirinda seyeat ediyorsunuz hayirli yolculuklar");

            } else if (ehliyet == 0) {
                if (hiz < 0) {
                    System.out.println("negatif hiz olmaz hatali veri girdiniz ");
                } else if (hiz >= 55 && hiz < 74) {

                    System.out.println("Cezaniz 300$");
                } else if (hiz >= 75 && hiz < 84) {
                    System.out.println("Cezaniz 350 $");
                } else if (hiz >= 85 && hiz <= 94) {
                    System.out.println("Cezaniz 520 $");
                } else if (hiz > 94) {
                    System.out.println("Cezaniz 700 $");
                } else {
                    System.out.println("Hiz sinirinda seyehat ediyorsunuz ama ehliyetiniz olmdagi icin 200$");

                }
            }else System.out.println("ehliyetiniz varmi yokmu");

        }else System.out.println("ehliyet yoksa arabada yok");
    }
    }


