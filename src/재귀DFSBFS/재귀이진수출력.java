package 재귀DFSBFS;

import java.util.Stack;

public class 재귀이진수출력 {
    Stack<Integer> integers = new Stack<>();

    public void solu(int num) {
        if(num==1 || num==0) {
            if(num ==1){
                integers.push(num);
            }
            int loop =integers.size();
            for(int i=0; i<loop;i++){
                System.out.print(integers.pop());
            }
            return;
        }
         int result= num%2;
        integers.push(result);
         solu(num/2);
    }
}
