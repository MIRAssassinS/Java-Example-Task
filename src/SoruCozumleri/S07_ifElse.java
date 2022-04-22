package SoruCozumleri;

import java.util.Scanner;

public class S07_ifElse {
    public static void main(String[] args) {
        	/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.

        	 */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu girin");
        double kilo=scan.nextDouble();
        System.out.println("lutfen boyunuzu girin");
        double boy=scan.nextDouble();
        double BMI=kilo/(boy*boy);

        if (BMI<=20){
            System.out.println("oldukca zayifsiniz");
        //}else if (20=<BMI=<25) {

        }

    }
}
