package dairealanivecevresi;

import java.util.Scanner;

public class DaireAlaniveCevresi {
    static final double PI= 3.14;
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin çapını giriniz: ");
        int cap=input.nextInt();
        double cevre=(2*PI*cap);
        double alan= (PI*cap*cap);
        System.out.println("Dairenin çevresi: "+cevre);
        System.out.println("Dairenin alani: "+alan);
    }
    
}
