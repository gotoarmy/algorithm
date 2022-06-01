package 재귀DFSBFS;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num= kb.nextInt();
        int size=1;
        size=size*num-1;
        int[] binartree = new int[size];
        for(int i=0; i<size; i++){
            binartree[i]=i;
        }
        이진트리DPS출력 이진트리DPS출력 = new 이진트리DPS출력();
        이진트리DPS출력.solu(binartree);


    }
}
