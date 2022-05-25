package 정렬탐색;

import java.util.ArrayList;

public class 버블소트 {
    public void solu(ArrayList<Integer> answer, int n) {
         for(int i =0; i<answer.size()-1;i++) {
             for (int j = 0; j < answer.size()-1; j++) {
                  if(answer.get(j) > answer.get(j+1)){
                     swap(answer,j,j+1);
                  }
             }
         }
        for (int s: answer) System.out.print(s+" ");
    }
    public void swap(ArrayList<Integer> answer,int a ,int b)
    {
        int temp=answer.get(b);
        answer.set(b, answer.get(a));
        answer.set(a,temp);
    }
}
