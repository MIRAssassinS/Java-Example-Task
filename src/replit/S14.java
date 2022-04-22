package replit;

public class S14 {
    public static void main(String[] args) {
        //Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        //Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.
        //Ornek:
        //INPUT :25 46
        //OUTPUT :
        //Numaralarin Toplami:71

        int sayi = 25;
        int sayi2 = 46;
        int toplam = sayi + sayi2;
        if (sayi >= 0 && sayi2 >= 0) {
            System.out.println("sayilarin toplami : " + toplam);
        }else if (sayi % 10 == 0 || sayi2 % 10 == 0) {
                System.out.println("OverFlow");
            } else {
                System.out.println("hatali giris yaptiiz");
            }


        }


    }


