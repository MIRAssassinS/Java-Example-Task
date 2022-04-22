package BasicSoru;

import java.util.Scanner;

public class S02_StringManipulation {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String str = scanner.next();
        boolean xyzIceriyormu = false;

        if (str.contains("xyz")) {
            xyzIceriyormu = true;
            System.out.println(xyzIceriyormu);
        } else {
            xyzIceriyormu = false;
            System.out.println(xyzIceriyormu);
        }
    }
    }