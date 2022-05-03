import java.lang.Object;
import java.util.Arrays;

public class peak4D {
    public boolean ispeak(int[][] a, int i,int j)
    {
        boolean b_peak= false;
        boolean[] check =new boolean[4];
        Arrays.fill(check,Boolean.FALSE);
        //동
        if(a[i][j+1] < a[i][j] ) check[0] =true;
        //서
        if(a[i][j-1] < a[i][j] ) check[1] =true;
        //남
        if(a[i+1][j] < a[i][j])  check[2] =true;
        //북
        if(a[i-1][j] < a[i][j])  check[3] =true;

        int count =0;
        for(boolean z : check)  //  모든 방향이 true인지 확인
        {
            if (true ==z)
            {
                count++;
            }
        }
        if(count == check.length)  b_peak=true;
        else  b_peak=false;

        return b_peak;
    }
    public void solu(int n, int[][] a)
    {
        int peakcount=0;
        for (int i=1; i<n+1; i++)
        {
            for (int j =1; j<n+1; j++)
            {
               if(this.ispeak(a,i,j))
               {
                   peakcount++;
               }
            }
        }

        System.out.print(peakcount);
    }
}
