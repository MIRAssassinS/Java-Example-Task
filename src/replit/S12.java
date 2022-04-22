package replit;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        //Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        //IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        //BMI 18,5'in altındaysa zayıfsınız
        //BMI 18,5 ile 25 arasında ise kilonuz idealdir
        //BMI 25-30 arasındaysa şişmansınız
        //BMI 30'dan büyük veya eşitse, obez
        //Input:
        //Output:
        //Agirlik : 71
        //Boy : 1,72
        //BMI : 23.99945916711736
        //Zayifsiniz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kilonuzu ve boyunuzu giriniz");
        double kilo= scanner.nextDouble();
        double boy= scanner.nextDouble();
        double BMI=kilo/(boy*boy);
        if (BMI<18.5){
            System.out.println("zayifsiniz");
        }else if (BMI>18.5 && BMI<25){
            System.out.println("kilonuz idealdir");
        }else if (BMI>25 && BMI<30){
            System.out.println("sismansiniz");
        }else if (BMI>=30){
            System.out.println("obez'siniz");
        }else{
            System.out.println("hatali giris yaptiniz");
        }

        System.out.println("BMI :"+BMI);
    }
}
