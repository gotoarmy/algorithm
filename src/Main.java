import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        매출액의종류 매출표=new 매출액의종류();
        int day=0;
        int iConsecutive_day= 0;
        day = in.nextInt();
        iConsecutive_day =in.nextInt();
        int[] 매출전표 =new int[day];
        int i =0;
        while(i<day)
        {
            매출전표[i++]= in.nextInt();
        }
        매출표.solu(매출전표,day,iConsecutive_day);
    }
}