package 재귀DFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class header{
ArrayList<Integer> possible=new ArrayList<>();
}
public class graph {
    int count=0;
    node head;
    LinkedList<header> list=new LinkedList<header>();
    LinkedList<node> nodelist =new LinkedList<>();


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
}
