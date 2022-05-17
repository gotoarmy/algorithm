package 스택큐;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String Bracket  = in.next();
            올바른괄호 all = new 올바른괄호();
            String answer = all.solution(Bracket);
            System.out.print(answer);


        }
        }

