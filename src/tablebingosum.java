import java.util.ArrayList;

public class tablebingosum {
    public void solu(int n,int[][] arr)
    {
        ArrayList<Integer> suma = new ArrayList<>();
        int maxsum =0;
        int row_sum, col_sum;
        for(int row =0; row <n; row++)
        {
            row_sum=0; col_sum=0;
            for (int col =0; col<n; col++)
            {
                row_sum += arr[row][col];
                col_sum += arr[col][row];
            }
            suma.add(row_sum);
            suma.add(col_sum);
        }
        row_sum =0;
        col_sum =0;
        for (int i =0; i<n; i++)
        {
            row_sum +=arr[i][i];
            col_sum +=arr[i][n-i-1];
        }
        suma.add(row_sum);
        suma.add(col_sum);
        int prev =0;

       for(int z : suma)
       {
           maxsum= Math.max(prev,z);
           prev = maxsum;
       }
       System.out.print(maxsum);

    }
}
