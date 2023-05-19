package orthesaplama;
import java.util.Scanner;
public class OrtHesaplama {
    public static void main(String[] args) {
        int vize,finals,odev;
        float ortalama;
        Scanner input= new Scanner(System.in);
        System.out.print("Ortalaması hesaplanacak dersin adını giriniz:");
        String ders=input.nextLine();
        System.out.print("Vize notunu giriniz:");
        vize=input.nextInt();
        System.out.print("Ödev notunu giriniz:");
        odev=input.nextInt();
        System.out.print("Final notunu giriniz:");
        finals=input.nextInt();
        ortalama=(((vize * 40)+(finals * 50)+(odev * 10))/100);
        System.out.println(ders + " ortalamaniz:" + ortalama);
        String basariDurumu=(ortalama>=50)? "Tebrikler,dersi geçtiniz":"Kaldınız";
        System.out.println(basariDurumu);
    }
    
}
