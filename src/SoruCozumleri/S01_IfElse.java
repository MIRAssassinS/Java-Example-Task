package SoruCozumleri;

import java.util.Scanner;

public class S01_IfElse {
    public static void main(String[] args) {
        //Sayının tek basamaklı mı yoksa iki basamaklı mı yoksa daha fazla mı olduğunu kontrol etmek
        // ve görüntülemek için bir java programı oluşturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi> -10 && sayi<10){
            System.out.println("girdiginiz sayi tek basmakli ");
        }else if (sayi> -100 && sayi<100) {
            System.out.println("girdiginiz sayi iki baskamakli");


        }else {
            System.out.println("girdiginiz sayi cok basamakli");
        }
    }
}
