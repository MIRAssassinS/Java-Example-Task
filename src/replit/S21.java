package replit;

import java.util.Scanner;

public class S21 {
    public static void main(String[] args) {
        //Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        //Input :
        //30
        //40
        //Beklenen Cikti:
        //Beklenen Cikti:
        //30 ve 40 icin GCD = 10
        //30 ve 40 icin LCM = 120

        Scanner scanner = new Scanner(System.in);
        System.out.println("birinci tam sayiyi giriniz");
        int num1=scanner.nextInt();
        System.out.println("ikinci tam sayiyi giriniz");
        int num2=scanner.nextInt();
        int gcd=0;

        for (int i = 1; i <=num1 && i <=num2 ; i++) {

            if (num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("30 ve 40 icin GCD ="+gcd);
        int lmc=(num1*num2)/gcd;
        System.out.println("30 ve 40 icin LCM ="+lmc);


    }
}