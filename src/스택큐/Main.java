package 스택큐;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String a = in.next();
            후위식연산 postfix=new 후위식연산();
            postfix.solution(a);
        }
}

