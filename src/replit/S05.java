package replit;

import java.util.Scanner;

public class S05 {
    public static void main(String[] args) {
        //Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
        //Örnek Çıktı:
        //Alan: 32
        //Çevre: 24


        Scanner scanner=new Scanner(System.in);
        System.out.println("Diktorgen'in 1. kenarini giriniz");
        int kenar = scanner.nextInt();
        System.out.println("Diktorgen'in 2. kenarini giriniz");
        int kenar2=scanner.nextInt();
        int alan=kenar*kenar2;
        int cevre=2*(kenar+kenar2);

        System.out.println("Alan :" +alan+  "Cevre :"+cevre);

    }
}
