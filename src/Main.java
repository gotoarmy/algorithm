import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        comele com =new comele();
        int n = in.nextInt();
        int[] one =new int[n];
        int index =0;
        while(index <n)
        {
            one[index] =in.nextInt();
            index++;
        }
        int m = in.nextInt();
        int[] two =new int[m];
        index =0;
        while(index <m)
        {
            two[index] = in.nextInt();
            index++;
        }
        com.solu(one,two);



    }
}