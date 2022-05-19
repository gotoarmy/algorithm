package 스택큐;

import java.util.Stack;

public class 후위식연산 {
    public int 계산 (Stack stack,char s)
    {
         int num = (int) stack.pop();
         int num2 = (int) stack.pop();
        if(42==s) {   // *
                 return num*num2;
        }
        else if(43==s){  //+
                 return num+num2;
        }
        else if(47==s){  //  나누기
                 return  num/num2;
        }
        else if(45==s){   // -
                 return  num2-num;
        }
        return 0;
    }

    public void solution(String a) {
        Stack<Integer> stack = new Stack<>();
        for(char s :a.toCharArray())
        {
            if(42==s) {   // *
                    int i =this.계산(stack,s);
                    stack.push(i);
            }
            else if(43==s){  //+
                int i =this.계산(stack,s);
                stack.push(i);
            }
            else if(47==s){  //  나누기
                int i =this.계산(stack,s);
                stack.push(i);
            }
            else if(45==s){   // -
                int i =this.계산(stack,s);
                stack.push(i);
            }else {   //숫자가들어올때
                int numericValue = Character.getNumericValue(s);
                stack.push(numericValue);
            }
        }
        int result =stack.pop();
        System.out.print(result);
    }
}
