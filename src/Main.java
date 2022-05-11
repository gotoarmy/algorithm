import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        최대길이수열 num =new 최대길이수열();
        int[] arr =new int[N];
        int changecount= in.nextInt();
        for(int i =0; i<N;i++)
        {
            arr[i] =in.nextInt();
        }
        num.solu(arr,N,changecount);


    }
}