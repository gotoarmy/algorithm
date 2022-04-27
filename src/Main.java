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
        int visiblecount =0;
        index =0;
        int prev_num =0;
        for (int z :inte)
        {
            if(prev_num < z) {
                visiblecount++;
                prev_num=z;
            }


        }
        System.out.print(visiblecount);

        return ;
    }
}