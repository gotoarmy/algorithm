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
        //1.다섯개의 해더와 노드를 만든다.
        for(int i=0;i<n; i++){
            graph.addheader();
            graph.addnode(i);
        }

        for(int j=0;j<connectcount; j++){
            int a =kb.nextInt();
            int b =kb.nextInt();
            graph.connect(a,b);//a
        }
        int i=0;


    }
}
