package 스택큐;

import java.nio.charset.StandardCharsets;

public class 올바른괄호 {
    String answer="";
    int leftcount=0;
    int rightcount=0;
    public String solution(String bracket) {
        int index=0;
        char[] a = bracket.toCharArray();
        for(char c :bracket.toCharArray())
        {
            if(0==index) {
                if (c == ')') {
                    answer = "NO";
                    return answer;
                }
            }
            if(a.length-1==index)
            {
                if(c=='(') {
                    answer = "NO";
                    return answer;
                }
            }

            if(c =='(') leftcount++;
            if(c ==')') rightcount++;
            index++;
        }
        if(leftcount==rightcount)
        {
            answer="YES";
        }
        else
        {
            answer="NO";
        }
        return answer;

    }
}
