import java.util.ArrayList;
import java.util.Scanner;

class fibo {
    public void solu(int num)
    {
        ArrayList<Integer> A = new ArrayList<>();
        Scanner in=new Scanner(System.in);
        int index=0;
        int prevprev_num = 1;
        int prev_num = 1;
        int now_num =0;
        while (index <num)
        {
            if(0 ==index || 1==index)
            {
                System.out.print(1+" ");
            }
            else
            {
                now_num =prev_num+prevprev_num;
                prevprev_num=prev_num;
                prev_num=now_num;
                System.out.print(now_num+" ");
            }
            index++;
        }

    }
}
