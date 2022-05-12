import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        최대길이수열2 T =new 최대길이수열2();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n, k, arr));


    }
}