package 재귀DFSBFS;

import java.util.*;

public class 네트워크{
    LinkedList<LinkedList<Integer>> list =new LinkedList<>(); //해더 like모음
    LinkedList<LinkedList<Integer>> network=new LinkedList<>(); //연결된 네트워크
    int answer=0;
    boolean[] visiteda;
    boolean[][] visited;
    public int solu(int n,int[][] computers) {
        boolean[][] visited = new boolean[n][n];
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

        answer= BFS(list);
        return answer;
    }
    public int BFS(LinkedList<LinkedList<Integer>> list){
         //network를 조회해서 해당 노드가 있으면 노드건너뜀
        visiteda=new boolean[list.size()];
        Queue<Integer> name =new LinkedList<>();

         for(int i=0; i<list.size(); i++)
         {
             LinkedList<Integer> temp = list.get(i);
             //일단 1노드 네트워크를 만들고
             //다음 노드가 1노드 네트워크에 포함되어있으면 다음노드로 넘어감
             //포함되어있지 않은 노드일 경우 그 해당 노드 값들을 모두 네트워크에 포함되는지 확인
             //안의 연결값들이 모두 포함되어있지 않다면 새로운 네트워크를 만들어서 저장
             //모든 노드를 방문할때까지 반복
         }
        //네트워크의 계수를 리턴함
        return network.size();

    }








}
