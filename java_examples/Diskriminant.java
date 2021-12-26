package diskriminant;
import java.util.Scanner;
public class Diskriminant {
    //ax^2+bx+c=0
    public static void main(String[] args) {
        int a,b,c;       
        Scanner input=new Scanner(System.in);
        System.out.println("A B ve C degerlerini sırası ile giriniz: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt(); 
        kokler(a, b, c);
    }
    static void kokler(int a,int b,int c){
        double delta=(b*b)-(4*a*c);
        double kok1;
        double kok2;
        if(delta>0){
            kok1=((-b +Math.sqrt(delta))/(2*a));
            System.out.println("Kök 1:"+kok1);
            kok2=((-b -Math.sqrt(delta))/(2*a));
            System.out.println("Kök 2:"+kok2);
        }else if(delta==0){
            kok1=kok2=(-b/(2*a));
            System.out.println("Kökler eşittir: "+kok1+kok2);
        }else{
            System.out.println("Gerçel kök yok");
        }        
    }   
}
