package 재귀DFSBFS;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        송아지찾기 송아지찾기 = new 송아지찾기();
        송아지찾기.setMyposition(in.nextInt());
        송아지찾기.setSongazipo(in.nextInt());
        tree tree = new tree();
        while (송아지찾기.getMyposition() != 송아지찾기.getSongazipo()) {
            int i = 송아지찾기.movecalcul(송아지찾기.getSongazipo(), 송아지찾기.getMyposition());
            송아지찾기.push(tree,i);
        }
        System.out.print(tree.jumpcount);

    }
}
