package 재귀DFSBFS;

import java.util.LinkedList;
import java.util.Queue;


class node{
    node back;
    node front;
    node five_walk;
    int value;

    public node(int value) {
        this.value = value;
    }
}
class tree{
    node head;
    int size;
    int jumpcount;

}

class 송아지찾기 {
    public int getMyposition() {
        return myposition;
    }

    public void setMyposition(int myposition) {
        this.myposition = myposition;
    }

    public int getSongazipo() {
        return songazipo;
    }

    public void setSongazipo(int songazipo) {
        this.songazipo = songazipo;
    }

    int myposition=0;
    int songazipo=0;

    public static int movecalcul(int songaziposi, int myposition){
        int[] move ={1,-1,5};
        int go =0;
        if((myposition+5-songaziposi)<=2){
            go=move[2];
        }else if (songaziposi-myposition<0){
            go=move[1];
        }
        else{
            go=move[0];
        }
        return go;
    }
    public void push(tree tree, int i) {
        node anode =new node(i);
        if(0==tree.size){
            node nod=anode;
            tree.head=nod;
            this.myposition+=i;
            tree.jumpcount++;
        }
        else{
            Queue<node> q = new LinkedList<>();
            node nwode =tree.head;
            q.offer(nwode);
            while(!q.isEmpty())
            {
                node temp =q.poll();
                if(5==i){
                   if( temp.five_walk==null)
                   {
                       temp.five_walk=anode;
                       myposition+=i;
                       tree.jumpcount++;

                   }
                   else{
                       q.offer(temp.five_walk);
                   }
                }
                else if(-1==i){
                    if(temp.back==null){
                        temp.back=anode;
                        myposition+=i;
                        tree.jumpcount++;

                    }
                    else{
                        q.offer(temp.back);
                    }
                }
                else if(1==i){
                    if(temp.front==null){
                        temp.front=anode;
                        myposition+=i;
                        tree.jumpcount++;
                    }
                    else{
                        q.offer(temp.front);
                    }
                }
                //종료조건
                if(myposition ==songazipo){
                    tree.head=nwode;
                    break;
                }
            }
        }
       tree.size++;
    }

}


