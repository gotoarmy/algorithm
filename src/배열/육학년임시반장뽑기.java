package 배열;

import java.util.Arrays;

class 육학년임시반장뽑기 {

    public void solu(int n, int[][] table)
    {
       int[] friendcount =new int[n]; //1번학생~n번학생까지
       boolean[] friendcheck =new boolean[n];
        Arrays.fill(friendcheck,false);
        for (int i=0; i<n; i++) // 학번
       {
           for (int j =0; j<5; j++) //학년
           {
               for (int z =0; z<n; z++)
               {
                   if (z == i) continue;
                  else if(table[i][j] ==table[z][j])
                   {
                       if(false==friendcheck[z])
                       {
                           friendcount[i]++;
                           friendcheck[z] = true;
                       }
                   }
               }
           }
           Arrays.fill(friendcheck,false);
       }
        int save=0;
        int index =0;
        int maxin= 0;
        for (int z:friendcount)
        {
            if(z>save)
            {
                save =z;
                maxin =index;
            }
            index++;
        }
        System.out.print(maxin+1);
    }
}
