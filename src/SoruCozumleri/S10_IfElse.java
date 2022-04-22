package SoruCozumleri;

import java.util.Scanner;

public class S10_IfElse {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("X ve Y degerlerini giriniz");
        int x=scan.nextInt();
        int y=scan.nextInt();

        if (x>0 && y<0){
            System.out.println("girdiginiz degerler 1.bolgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiginiz degerler 2.bolgeye ait");
        }else if (x>0 && y>0){
            System.out.println("girdiginiz degerler 3.bolgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiginiz degerler 4.bolgeye ait");
        }else if (x!=0 && y==0) {
            System.out.println("girdiginiz degerler x. bolgeye ait");
        }else if (x==0 && y!=0){
            System.out.println("girdiginiz degerler y.bolgeye ait");
        }else System.out.println("girdiginiz degerler yanlis");
    }
}
