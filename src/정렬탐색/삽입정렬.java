package 정렬탐색;

import java.util.ArrayList;

public class 삽입정렬 {
    public void solu(ArrayList<Integer> answer, int n) {
        for(int i=1; i<n;i++){
            for(int j=0; i-j>0;j++){
                if(answer.get(i-j)<answer.get(i-j-1))
                {
                    swap(answer,i-j,i-j-1);
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
