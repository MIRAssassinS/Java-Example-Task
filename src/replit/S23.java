package replit;

import java.util.Scanner;

public class S23 {
    public static void main(String[] args) {

        //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //Input : 6
        //Output: 6!=65432*1=720

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int input =scanner.nextInt();
        int faktoriyel = 1;
        String farktoriyelAcikyazim = "";

        for (int i = input; i >= 1; i--) {
            faktoriyel *= i;
            if (i == input) {
                farktoriyelAcikyazim += i;

            } else
                farktoriyelAcikyazim += "*" + i;


        }
        System.out.println(input+"! ="+farktoriyelAcikyazim+ "="+faktoriyel);
    }
}

