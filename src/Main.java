import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        reverseprime prime =new reverseprime();
        ArrayList<Integer> A = new ArrayList<>();
        int index =0;
        while (index < n)
        {
            A.add(in.nextInt());
            index++;
        }
        prime.solu(n,A);
    }
}