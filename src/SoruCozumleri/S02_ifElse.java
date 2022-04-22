package SoruCozumleri;

import java.util.Scanner;

public class S02_ifElse {
    public static void main(String[] args) {
        //giriş yılının artık olup olmadığını kontrol edin

            int year;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter any Year:");
            year = scan.nextInt();
            scan.close();
            boolean isLeap = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    isLeap = year % 400 == 0;
                } else
                    isLeap = true;
            } else {
                isLeap = false;
            }
            if (isLeap == true)
                System.out.println(year + " artik yildir");
            else
                System.out.println(year + " artik yil degildir ");
        }
    }

