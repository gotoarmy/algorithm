package 재귀DFSBFS;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class header{
ArrayList<Integer> possible=new ArrayList<>();
}
public class graph {
    int answer=0;
    int count=0;
    node head;
    LinkedList<header> list=new LinkedList<header>();
    LinkedList<node> nodelist =new LinkedList<>();
    boolean[] visitied;

    public graph(int n) {
        visitied=new boolean[n];
        Arrays.fill(visitied,false);
    }


    public void connect(int value1,int value2) {
        header header = list.get(value1 - 1); //헤더를 뽑음
        header.possible.add(value2);

    }

    public void addheader() {
        header head = new header();
        list.add(head);

    }
    public void addnode(int i){
        node node = new node(i + 1);
        nodelist.add(node);
        count++;
    }

    public void solu(int n) {
        //header
        //0헤더를 훑는다 가능성배열을 추가한다


    }
    public void DFS(header header,int n)
    {
        header local=header;
        visitied[0]=true;
        for (int i : local.possible)
        {
            if(i == n){
                answer++;
                return;
            }
            else {
                if(visitied[i-1]==false){
                    visitied[i-1]=true;
                    DFS(list.get(i-1),n);
                    visitied[i-1]=false;
                }

            }
        }

    }
}
