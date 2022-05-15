package 해쉬;

import java.util.ArrayList;
import java.util.HashMap;

public class 매출액의종류 {
    public void solu(int[] 매출전표, int day, int iConsecutive_day) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        int p_follower =0;//시작포인터
        int p_forward =0;//나아가는 포인터
        int count=0;
        while(count<iConsecutive_day-1)
        {
            map.put(매출전표[p_forward],map.getOrDefault(매출전표[p_forward++],0)+1);
            count++;

        }
        while(p_forward < day)
        {
            map.put(매출전표[p_forward],map.getOrDefault(매출전표[p_forward],0)+1);
            System.out.print(map.size()+" ");
            map.put(매출전표[p_follower],map.get(매출전표[p_follower])-1);
            if(0==map.get(매출전표[p_follower]))
            {
                map.remove(매출전표[p_follower]);
            }
            p_follower++;
            p_forward++;
        }

    }
}