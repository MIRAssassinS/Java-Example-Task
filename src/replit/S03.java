package replit;

import java.util.Arrays;
import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        //Verilen 5 sayinin ortalamasiniz hesaplayan java kodunu yaziniz.
        //Ortalamasi alinacak Sayilar : 22, 20, 30, 28, 50
        //Ornek Cikti:
        //Sayilarin Ortalamasi : 30


        int sayilarArr[] = {22, 20, 30, 28, 50};
        int toplam = 0;
        int ortalama=0;
        for (int i = 0; i < sayilarArr.length; i++) {
            toplam += sayilarArr[i];
            ortalama=toplam/ sayilarArr.length;


        }
        System.out.println(toplam);
        System.out.println(ortalama);//30



    }


    }




