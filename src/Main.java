import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        bingosum bin =new bingosum();
        ArrayList<Integer> A = new ArrayList<>();
        int index =0;
        while(index <n*n)
        {
            A.add(in.nextInt());
            index++;
        }
        bin.solu(n,A);
    }
}