package aynimi;
import java.util.Scanner;
//burada girilen metinin düz ve tersten okunuslarının aynı olup olmadıgını kontrol ediyoruz
public class AyniMi{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String metin = scanner.nextLine();
        System.out.println(ayniMi(metin));
    }
    static boolean ayniMi(String metin) {
        char[] array = new char[metin.length()];
        for (int i = 0; i < metin.length(); i++) {
            array[i] = metin.charAt(i);
        }
        int a = 0;
        int b = array.length - 1;
        for (; a < Math.floor(array.length / 2) ; a++, b--) {
            if (array[a] == array[b]) {//zaman yemez
            } else {
                return false;
            }
        }
        return true;        
    }
}
