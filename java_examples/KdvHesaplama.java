package kdvhesaplama;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Ürün maaliyetini giriniz: ");
        float maaliyet=input.nextFloat();
        double kdvTutari= maaliyet * 0.18;
        double satisFiyati= kdvTutari+maaliyet;
        System.out.println("Ürünün satış fiyati: "+satisFiyati);
    }
    
}
