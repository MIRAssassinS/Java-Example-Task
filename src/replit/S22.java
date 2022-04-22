package replit;



public class S22 {
    public static void main(String[] args) {
//Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
//Input
//String str=“Javaisalsoeasy”
//Output: a s

        String str = "Javaisalsoeasy";
        System.out.println(str);
        String[] arr = str.split("");
        String strYeni = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && ((!strYeni.contains(str.charAt(i) + "")))) {
                    strYeni += str.charAt(i) + " ";
                }
            }
        }
        System.out.println(strYeni);
        System.out.println();

    }
}
