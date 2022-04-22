package SoruCozumleri;

import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.Scanner;

public class S08_ifElse {
    /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
        String meslek = input.next();

        String qa = "Qualty Analyst";
        String dev = "Developer";
        String ba = "Business Analyst";
        String pm = "Project Manager";


        if (meslek.equalsIgnoreCase("qa")){
            System.out.println("meselginiz :"+qa);

        }else if (meslek.equalsIgnoreCase("dev")){
            System.out.println("meslegininiz :"+dev);

        }else if (meslek.equalsIgnoreCase("ba")){
            System.out.println("mesleginiz :"+ba);
        }else if (meslek.equalsIgnoreCase("pm")){
            System.out.println("mesleginiz :"+pm);
        }else{
            System.out.println("Hatali giris yapitiniz");
        }



    }
}
