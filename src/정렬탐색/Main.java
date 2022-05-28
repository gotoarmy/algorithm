package 정렬탐색;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int worknum = kb.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < worknum; i++){
            arr.add(i,kb.nextInt());
        }
        캐시매모리 캐시메모리 = new 캐시매모리();
        캐시메모리.solu(arr,size);


    }
}


