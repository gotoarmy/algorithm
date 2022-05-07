import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        mentoring game =new mentoring();
        int n = in.nextInt();  //컬럼
        int m = in.nextInt(); //로우
        int[][] table =new int[m][n];
        for(int i=0;i<m;i++)
        {
            for (int j =0;j<n;j++)
            {
                table[i][j] =in.nextInt();
            }
        }
        game.solu(table,m,n);

    }
}