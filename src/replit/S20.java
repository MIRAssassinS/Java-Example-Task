package replit;

import java.util.Scanner;

public class S20 {
    public static void main(String[] args) {
        //Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
        //char ch1= 'a' ;
        //	String name =“John came late"
        //	Expected Output:
        //Number of a = 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir isim ve bir karakter giriniz");
        String karakter = scanner.next();
        char ch1 = 'a';
        String name = "John came late";
        int toplam = 0;

        for (int i = 0; i <name.length(); i++) {
           if (ch1==name.charAt(i)) {
                toplam++;
           }
        }
        System.out.println("Number of a = :"+ch1+" "+toplam);

        }


    }





