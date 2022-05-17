package 스택큐;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 괄호문자제거 {
    public List<Character> solution(String bracket) {
        Stack<Character> stack = new Stack<>();
        List<Character> Answer =new ArrayList<>();
        for(char s:bracket.toCharArray())
        {
            if(stack.empty())
            {
                if('('!=s &&')'!=s)
                {
                    Answer.add(s);
                }
            }
            if('('==s) stack.push(s);
            if(')'==s) stack.pop();

        }

        return Answer;
    }
}
