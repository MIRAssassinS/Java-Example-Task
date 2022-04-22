package replit;

import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        //Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
        //INPUT:
        //Ay Numarasi:
        //2
        //Yil :
        //2016
        //OUTPUT :
        //Subat 2016 29 Gundur.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir ay giriniz");
        int ayNumarasi = scanner.nextInt();
        int yil = scanner.nextInt();
        int gun = 0;

        switch (ayNumarasi) {
            case 1:
                System.out.print("Ocak ");
                gun = 31;
                break;
            case 3:
                System.out.print("Mart ");
                gun = 31;
                break;
            case 5:
                System.out.print("Mayis ");
                gun = 31;
                break;
            case 7:
                System.out.print("Temmuz ");
                gun = 31;
                break;
            case 8:
                System.out.print("Agustos ");
                gun = 31;
                break;
            case 10:
                System.out.print("Ekim ");
                gun = 31;
                break;
            case 12:
                System.out.print("Aralik ");
                gun = 31;
                break;
            case 4:
                System.out.print("Nisan ");
            case 6:
                System.out.print("Haziran ");
            case 9:
                System.out.print("Eylul ");
            case 11:
                System.out.print("Kasim ");
                gun = 30;
                break;
            case 2:
                System.out.print("Subat  ");
                if (yil % 4 == 0 && !(yil % 100 == 0) || yil % 400 == 0) {
                    gun = 29;
                } else {
                    gun = 28;
                    break;
                }





        }
        System.out.print("yil :"+yil+" gun sayisi : "+gun);

    }
}
