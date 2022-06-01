package 재귀DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class 피보나치 {
    int previous=1;
    int previousprev=1;
    int i=0;
    Queue<Integer> queue = new LinkedList<>();

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
