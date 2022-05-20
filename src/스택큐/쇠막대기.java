package 스택큐;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class 쇠막대기 {

    public void solution(String a) {
        Stack<Character> stack = new Stack<>();
        int piece=0;
        int stick=0;
        char previous=0;
        boolean razer=false;
        boolean afterpop=false;
        boolean open=true;

        for(char s :a.toCharArray())
        {
            if('('==s)
            {
                stack.push(s);
                if(open)
                {
                    previous=s;
                    open=false;
                    continue;
                }
                stick++;
                piece++;

            }
            else
            {
                if(')'==previous)
                {
                    stick--;
                }
                else {
                    stack.pop();
                    piece += stick;
                    open=true;
                }

            }
            previous=s;
        }
        System.out.print(piece);
    }
}
