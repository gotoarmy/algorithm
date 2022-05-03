import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        peak4D peak=new peak4D();
        int[][] table =new int[n+2][n+2];
        for (int i=0; i<n+2; i++)
        {
            for (int j =0; j<n+2; j++)
            {
                if(0==i || 0==j ||  n+1 ==i || n+1 ==j)
                {
                    table[i][j] =0;
                }
                else
                {
                    table[i][j] =in.nextInt();
                }
            }
        }

        peak.solu(n,table);
    }
}