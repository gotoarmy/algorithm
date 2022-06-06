package 재귀DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드까지의경로 {
    int ltjump;
    int rtjump;
    public void solu() {
        tree tree = new tree();
        for(int i=1;i<6; i++){
            node node =new node(i);
            tree.push(node);
        }
        jump(tree.head);
        int count=ltjump>rtjump?rtjump:ltjump;
        System.out.print(count);
    }
    public int DFS(int L, node root){
        if(root.left==null && root.right==null) return L;
        else return Math.min(DFS(L+1, root.left), DFS(L+1, root.right));
    }//dfs 풀이
    public int BFS(node root){
        Queue<node> Q=new LinkedList<>();
        Q.offer(root);
        int L=0;
        while(!Q.isEmpty()){
            int len=Q.size();
            for(int i=0; i<len; i++){
                node cur=Q.poll();
                if(cur.left==null && cur.right==null) return L;
                if(cur.left!=null) Q.offer(cur.left);
                if(cur.right!=null) Q.offer(cur.right);
            }
            L++;
        }
        return 0;

}

    public void jump(node no){
        node node =no;
        Queue<node> q = new LinkedList<>();
        q.offer(node);
        while (!q.isEmpty())
        {
            node temp=q.poll();
            if(temp.left!=null)
            {
                ltjump++;
                q.offer(temp.left);

            }
        }
        q.offer(node);
        while(!q.isEmpty())
        {
            node temp =q.poll();
            if(temp.right!=null){
                rtjump++;
                q.offer(temp.right);
            }
        }
    }