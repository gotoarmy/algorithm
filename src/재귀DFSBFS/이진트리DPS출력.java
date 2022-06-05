package 재귀DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

//class Node{
//    Node left;
//    Node right;
//    int value;
//
//    public Node(int value) {
//
//        this.value = value;
//        left=null;
//        right=null;
//    }
//}
//class bitree{
//    Node head;
//
//    int size=0;
//    public void push(Node nd) {
//        if (size == 0) {
//            Node node = nd;
//            head = node;
//
//        }
//        else {
//            Node node = head;
//
//            Queue<Node> q = new LinkedList<Node>();
//            q.add(node);
//
//            while (!q.isEmpty()) {
//                Node temp = q.poll();
//
//                if (temp.left == null) {
//                    temp.left = nd;
//                    break;
//                }
//                else {
//                    q.add(temp.left);
//                }
//
//                if (temp.right == null) {
//                    temp.right = nd;
//                    break;
//                }
//                else {
//                    q.add(temp.right);
//                }
//            }
//        }
//        size++;
//    }
//
//    public void print(Node node){
//        if(null==node)
//        {
//
//        }
//        else {
//            //전위 후위 중위 스택을 그려보자
//            System.out.print(node.value);
//            print(node.left);
//            print(node.right);
//        }
//    }
//
//
//    public void printBFS(Node node) {
//
//        Queue<Node> queue = new LinkedList<Node>();
//        queue.add(node);
//
//        while (!queue.isEmpty()) { //첫번째 노드를 출력하고 양옆에 를 큐에추가해서 계속 탬프에넣고 양옆에 큐를 추가해준다.
//            Node temp = queue.poll();
//            System.out.println(temp.value);
//
//            if (temp.left != null) {
//                queue.add(temp.left);
//            }
//
//            if (temp.right != null) {
//                queue.add(temp.right);
//            }
//        }
//    }
//}
//class 이진트리DPSbps출력 {
//
//    public static void main(String[] args) {
//        bitree bt = new bitree();
//
//        Node node = new Node(3);
//        Node node1 = new Node(5);
//        Node node2 = new Node(7);
//        Node node3 = new Node(4);
//        Node node4 = new Node(2);
//
//        bt.push(node);
//        bt.push(node1);
//        bt.push(node2);
//        bt.push(node3);
//        bt.push(node4);
//        System.out.println("BFS로 탐색합니다");
//        bt.printBFS(node);
//        bt.print(node);
//    }
//    public void solu(bitree bit) {
//
//
//    }
//}
