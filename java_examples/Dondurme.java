package dondurme;
import java.util.Random;
public class Dondurme {
    static int x = 4;
    public static void main(String args[]) {
        int i,j;
        int[][] matris = new int[x][x];
        for (i = 0; i < x; i++) {
            for (j = 0; j < x; j++) {
                Random sayi = new Random();
                matris[i][j] = sayi.nextInt(5);
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Döndürüldü\n");
        dondur(matris);
    }
    static void dondur(int[][]matris) {
        int[][] dondMatris = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                dondMatris[i][j] = matris[x - j - 1][i];
                System.out.print(dondMatris[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
