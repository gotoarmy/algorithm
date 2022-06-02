package 재귀DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

class node{
    node lt;
    node rt;
    int value;

    public node(int value) {

        this.value = value;
    }
}
class bitree{
    node root;
    int count=0;

    public void print(node node){
        if(null==node)
        {
            return;
        }
        else {
            //전위 후위 중위 스택을 그려보자
            print(node.lt);
            System.out.print(node.value);
            print(node.rt);
        }
    }
}
public class 이진트리DPS출력 {

    public static void main(String[] args) {
        bitree bitree = new bitree();
        bitree.root=new node(1);
        bitree.root.lt=new node(2);
        bitree.root.rt=new node(3);
        bitree.root.lt.lt=new node(4);
        bitree.root.lt.rt=new node(5);
        bitree.root.rt.lt=new node(6);
        bitree.root.rt.rt=new node(7);
        이진트리DPS출력 이진트리DPS출력 = new 이진트리DPS출력();
        이진트리DPS출력.solu(bitree);
    }
    public void solu(bitree bit) {
      bit.print(bit.root);

    }
}
