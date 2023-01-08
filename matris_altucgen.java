
import java.util.Scanner;
//8.18
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gizee
 */
public class matris_altucgen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("nxn için n değeri:");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + ". satır ve " + j + ". sütun: ");
                A[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    B[i][j] = 0;

                } else {
                    B[i][j] = A[i][j];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
