package 정렬탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        int num =kb.nextInt();
        이분검색 이분검색 = new 이분검색();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=kb.nextInt();
        }
        Arrays.sort(arr);
        이분검색.solu(arr,num);

    }
}



