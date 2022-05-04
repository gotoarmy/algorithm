import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        leader sixgrade =new leader();
        int[][] table =new int[n][5];
        for (int i=0; i<n; i++)
        {
            for (int j =0; j<5; j++)
            {

                    table[i][j] =in.nextInt();

            }
        }

        sixgrade.solu(n,table);
    }
}