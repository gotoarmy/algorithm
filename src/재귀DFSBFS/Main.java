package 재귀DFSBFS;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[][] computers = new int[n][n];
        for (int i=0; i<n;i++)
        {
            for(int j=0; j<n;j++){
                computers[i][j]= kb.nextInt();
            }
        }
        네트워크 네트워크 = new 네트워크();
        int solu = 네트워크.solu(n, computers);
        System.out.println(solu);

    }
}
