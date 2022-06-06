package 재귀DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
    node head;
    int size;
    int jumcount;
    public void push(node nd) {
        if (size == 0) {
            node node = nd;
            head = node;

        }
        else {
            node node = head;

            Queue<node> q = new LinkedList<node>();
            q.add(node);

            while (!q.isEmpty()) {
                node temp = q.poll();

                if (temp.left == null) {
                    temp.left = nd;
                    break;
                }
                else {
                    q.add(temp.left);
                }

                if (temp.right == null) {
                    temp.right = nd;
                    break;
                }
                else {
                    q.add(temp.right);
                }
            }
        }
        size++;
    }
}
