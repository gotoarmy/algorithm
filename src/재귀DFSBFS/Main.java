package 재귀DFSBFS;


import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] ints = new int[n];
        for(int i=0; i<n; i++){
            ints[i]=kb.nextInt();
        }
        부분집합합실패 T = new 부분집합합실패(n);
        T.DFS(1,ints,n);
        Collections.sort(T.arraylist1);
        System.out.println(T.same());
    }
}
