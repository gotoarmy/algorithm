package 스택큐;

import java.awt.desktop.SystemSleepEvent;
import java.util.Stack;

public class 카카오인형뽑기 {
    public void solu(int[] 이동배열, int[][] 격자판,int 격자판크기) {
//        5
//        0 0 0 0 0
//        0 0 1 0 3
//        0 2 5 0 1
//        4 2 4 4 2
//        3 5 1 3 1
//        8
//        1 5 3 5 1 2 1 4 -> 4 3 1 1 3 2 4
        Stack<Integer> stack = new Stack<>();
        //카운팅수 터트려진 수
        int popingcount=0;//스택에 같은인형이 들어오면 터짐 현재인형의 번호를 기억 들어온 인형의 번호를 기억
        //popingx2가 출력값 터뜨려진 인형의 수
        int now=0;
        int comein=0;

        for(int a : 이동배열) {a--;
            int zerocount=0;
            for(int z=0;z<격자판크기;z++) {

                if(0!=격자판[z][a])
                {
                    comein=격자판[z][a];
                    격자판[z][a] =0;
                    break;
                }
                else zerocount++;
            }
            if( zerocount ==격자판크기)    continue; //인형이 그 열에하나도 없을경우

            if (stack.empty())
            {
                stack.push(comein);
                now=comein;
            }
            else
            {
                if(now ==comein)
                {

                   stack.pop();
                   //밑에있던값을 now에 넣어야함
                   now=stack.peek(); //스택피크값을넣음
                   popingcount++;

                }
                else
                {
                    stack.push(comein);
                    now=comein;
                }
            }

        }
        System.out.print(popingcount*2);



    }

}
