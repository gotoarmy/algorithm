package 정렬탐색;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int[] arrs = new int[size];
        for (int i = 0; i < size; i++){
            arrs[i]=kb.nextInt();
        }
        중복확인 중복확인 = new 중복확인();
        중복확인.solu(arrs,size);

    }
}


