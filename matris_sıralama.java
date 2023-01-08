
import java.util.Scanner;
//8.27
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class matris_sıralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("nxn için n değeri: ");
        int n=input.nextInt();
        int[][] a=new int[n][n];
        int[][][] b=new int[n][n][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i+". satır ve "+j+". sütun");
                a[i][j]=input.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                 b[i][j][k] =input.nextInt();
                    if () {
                        
                    }
                    
                }
            }
            
        }
    }
    
}
