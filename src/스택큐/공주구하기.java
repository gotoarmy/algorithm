package 스택큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 공주구하기 {
    public void solu(int princess_num, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0; i<princess_num; i++)
        {
            queue.offer(i+1);
        }
        while(1 !=queue.size())
        {
            for (int j =0; j<k-1;j++)
            {
                queue.offer(queue.poll());   // 8 7 6 5 4 3 2 1
            }
            queue.poll();
        }
        System.out.print(queue.peek());


    }
}
