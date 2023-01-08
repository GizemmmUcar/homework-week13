/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
//8.14
/**
 *
 * @author gizee
 */
public class matris_yedekkosegen {

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
                System.out.print(i + ". satır ve " + j + ".sütun:");
                A[i][j] = input.nextInt();

            }

        }
        int T = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) <(N-1)) {
                    T += A[i][j];

                }

            }
        
        }
        System.out.println("Yedek köşegenin üstünde kalan elemanların toplamı:" + T);
    }

}
