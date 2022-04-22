package SoruCozumleri;

public class S13_IfElse {
    public static void main(String[] args) {

       /*
            TASK :
            45 değerinde bir double oluşturun.
            Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdırınız.

            Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
        */

        double number = 45;
        if (number % 5 == 0 && number%8==0){
            System.out.println("5 ve 8 ile bölünebilir");
        }else if (number%10==5 && number%9==0){
            System.out.println("9'a bölünür ve 10'a bölünür kalan 5");
        }else{
            System.out.println("Nothing");
        }

    }
}
