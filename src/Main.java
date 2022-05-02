import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        tablebingosum table =new tablebingosum();
        int[][] arr =new int[n][n];
        for(int row =0; row<n; row++)
        {
            for(int col =0; col<n; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }
        table.solu(n,arr);
    }
}