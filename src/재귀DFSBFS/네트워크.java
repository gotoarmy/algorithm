package 재귀DFSBFS;

import java.util.ArrayList;

public class 네트워크{

    ArrayList<Integer> linked =new ArrayList<>();


    public int solu(int n,int[][] computers) {
        int answer;
        boolean[][] visited = new boolean[n][n];
        for (int i=0; i<n; i++)
        {

            for (int j=0; j<n;j++)
            {
                if (i==j) continue;
                else{
                    if(computers[i][j]==1)
                    {
                        if(!linked.contains(j))
                        {
                            if(false==visited[i][j]) {
                                linked.add(j);
                                visited[j][i]=true;
                            }

                        }
                    }
                }
            }

        }
        if(0==linked.size())
        {
            answer=n;
        }
        else{
              answer=1;
              answer+=(n -linked.size());
        }

        return answer;
    }


}
