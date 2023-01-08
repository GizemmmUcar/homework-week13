
import java.util.Scanner;
//8.16
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class matris_satırsutuntoplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("NxN için N değeri:");
        int N = input.nextInt();
        int[][] A = new int[N][N];
        System.out.println("A matrisi:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(i + ".satır ve " + j + ".sütun ");
                A[i][j] = input.nextInt();

            }

        }
        int toplam = 0;
        int sonuc = 0;
        for (int i = 0; i < N - 1; i++) {
            toplam += A[i][N - 2] + A[N - 2][i];
            sonuc = toplam - A[N - 2][N - 2];

        }

        System.out.print("Sondan bir önceki satır ve sütundaki elemanların toplamı:" + sonuc);

    }

}
