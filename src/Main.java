import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        maxprofit max = new maxprofit();
        int day=0;
        int iConsecutive_day= 0;
        day = in.nextInt();
        iConsecutive_day =in.nextInt();
        int[] profit_record =new int[day];
        int i =0;
        while(i<day)
        {
            profit_record[i++]= in.nextInt();
        }
        max.solu(profit_record,day,iConsecutive_day);
    }
}