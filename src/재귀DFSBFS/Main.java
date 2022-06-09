package 재귀DFSBFS;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int connectcount =kb.nextInt();
        graph graph = new graph();
        //1.다섯개의 해더노드를 만든다.
        for(int i=0;i<5; i++){
            graph.addheader();
        }
        //방향을 만들어준다,포인터가 몇개인지 어캐아냐? 런타임중에 생긴다.
        for(int j=0;j<connectcount; j++){
            int a =kb.nextInt();
            int b =kb.nextInt();
            graph.connect(a,b);
        }
        int i=0;


    }
}
