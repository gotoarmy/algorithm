package 스택큐;

import java.util.List;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String Bracket  = in.next();
            괄호문자제거 ALL=new 괄호문자제거();
            List<Character> answer = ALL.solution(Bracket);
                for (char s : answer)
                {
                    System.out.print(s);
                }
        }
}

