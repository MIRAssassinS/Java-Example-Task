package SoruCozumleri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class S05_IfElse {

    public static void main(String[] args) throws IOException {
        //. Üç sayı ve bir karakter girmek için bir program yazın.
        // Verilen karakter 's' ise sayıların toplamını ve verilen karakter 'p' ise sayıların çarpımını bulun ve yazdırın.
        // Program 's' veya 'p' dışındaki alfabeyi görüntüler.

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a,b,c,sum=0,pr=1;
        char ch;
        System.out.println("Enter three numbers");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        System.out.println("Enter 's' for sum and p' for product of three numbere");
        ch=(char)in.read();
        if(ch=='s')
        {
            sum=a+b+c;
            System.out.println("The sum of three numbers:"+sum);
        }
        else if (ch=='p')
        {
            pr=a*b*c;
            System.out.println("The product of three numbers:"+pr);
        }
        else
            System.out.println("Entered an invalid character!!!");


    }
}




