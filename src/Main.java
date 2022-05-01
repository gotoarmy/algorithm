import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        score core =new score();
        ArrayList<Integer> A = new ArrayList<>();
        int index =0;
        while (index < n)
        {
            A.add(in.nextInt());
            index++;
        }
        core.solu(n,A);
    }
}