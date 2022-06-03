package 재귀DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class 피보나치 {
    int previous=1;
    int previousprev=1;
    int i=0;
    Queue<Integer> queue = new LinkedList<>();
    static class Aain {
        static int[] fibo;
        public int DFS(int n){
            if(fibo[n]>0) return fibo[n];
            if(n==1) return fibo[n]=1;
            else if(n==2) return fibo[n]=1;
            else return fibo[n]=DFS(n-2)+DFS(n-1);
        }
        public static void main(String[] args){
            Aain T = new Aain();
            int n=45;
            fibo=new int[n+1];
            T.DFS(n);
            for(int i=1; i<=n; i++) System.out.print(fibo[i]+" ");
        }
    } //위 강사코드 -메모이제이션 코드 값을 기억해놓고 호출하면 시간을 줄일수 있다.
    public void solu(int num) {
        if(0==num){
            int loop= queue.size();// 복사해놓으면 변하지 않을수있다.
            for(int i=0; i< loop;i++){
                System.out.print(queue.poll()+" ");
            }
            return;
        }
        if(0==i || 1==i){
            queue.offer(1);
        }
        else {
            int now =previous+previousprev;
            queue.offer(now);
            previousprev=previous;
            previous=now;
        }
        i++;
        solu(num-1);
    }
}
