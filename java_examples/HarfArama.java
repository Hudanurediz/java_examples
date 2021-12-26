package harfarama;
import java.util.Scanner;
public class HarfArama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Arama yapılacak metni giriniz: ");
        String metin=input.nextLine();
        System.out.print("Aramanacak harfi giriniz: ");
        char harf=input.next().charAt(0);
        harfiBul(metin,harf);
    }
    static void harfiBul(String metin,char harf){
        int sayac=0;
        char[] array = new char[metin.length()];
        for (int i = 0; i < metin.length(); i++) {
            array[i] = metin.charAt(i);
            if(array[i]==harf){
                sayac++;
            }
        }
        System.out.println(sayac+" tane aranan harf bulundu");       
    }    
}
