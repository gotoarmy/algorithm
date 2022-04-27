import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> inte = new ArrayList<Integer>();
        //
        //
        int index =0;
        while(index < n)
        {
            inte.add(in.nextInt());
            index++;
        }
        //자신의 앞수보다 작으면  출력
        int prev_num =0;
        index =0;
        boolean isnew =true;
        for (int z :inte)
        {
            if (isnew)
            {
                prev_num=z;
                isnew=false;
                System.out.print(z+" ");
                continue;
            }
            if(isnew==false && z>prev_num)
            {
                System.out.print(z+" ");
            }
            prev_num=z;

        }

        return ;
    }
}