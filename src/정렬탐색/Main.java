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
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=kb.nextInt();
        }
        결정알고리즘 결정알고리즘 = new 결정알고리즘();
        결정알고리즘.solu(arr,size,num);


    }
}



