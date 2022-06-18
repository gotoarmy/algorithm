package 재귀DFSBFS;


import java.util.LinkedList;
import java.util.Queue;

public class 네트워크{
    LinkedList<LinkedList<Integer>> list =new LinkedList<>(); //해더 like모음
    int answer=0;
    boolean[] visiteda;
    public int solu(int n,int[][] computers) {
        boolean[] visiteda =new boolean[n];
        for (int i=0; i<n; i++)
        {
            list.add(new LinkedList<>());
            for (int j=0; j<n;j++) //인접리스트변환
            {
                  if(i==j) continue;
                  else {
                     if(computers[i][j]==1) {
                             list.get(i).add(j);
                         }

                     }
                  }
            }

        for (int a =0;a<n;a++)
        {
            if(false==visiteda[a]){
                BFS(a,list,visiteda);
                visiteda[a]=true;
            }

        }
        return answer;
    }
    public void BFS(int startnode, LinkedList<LinkedList<Integer>> list, boolean[] visiteda){
        boolean[] visiteda1 = visiteda;
        Queue<Integer> queue =new LinkedList<>();
        LinkedList<Integer> temp = list.get(startnode);
        for (int a : temp)
        {
             queue.offer(a);
        }
        while(!queue.isEmpty()){
            Integer poll = queue.poll();
            visiteda[poll]=true;
            LinkedList<Integer> temps = list.get(poll);
            if(0==temps.size()) continue;
            for(int h: temps)
            {
                if(false==visiteda[h])
                {
                    queue.offer(h);
                }
            }
        }
        answer++;
    }








}
