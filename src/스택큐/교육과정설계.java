package 스택큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계 {
    public void solu(String a, String b) {
        String answer1="";
        ArrayList<Character> 필수과목 = new ArrayList<>();
        for(char s :a.toCharArray()) 필수과목.add(s);
        ArrayList<Character> answer =new ArrayList<>();
        Queue<Character> queue = new LinkedList<>();
        for(char w :b.toCharArray()){
            queue.offer(w);
        }
        int queuesize= queue.size();
       for(int y=0; y< queuesize;y++)
       {
           char w=queue.poll();
           for(char u:필수과목)
           {
               if(u==w) answer.add(w);
           }
       }
        if(필수과목.equals(answer))
        {
            answer1="YES";
        }
        else {
            answer1="NO";
        }
        System.out.print(answer1);
    }
}
