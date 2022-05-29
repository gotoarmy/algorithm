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
        장난꾸러기녀석 장난꾸러기녀석 = new 장난꾸러기녀석();
        장난꾸러기녀석.solu(arrs,size);

    }
}


