package 투포인터슬라이딩;

import java.util.ArrayList;
import java.util.Arrays;

class 공통원소구하기교집투포인터 {
    public void solu(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int n =a.length;
        int m =b.length;
        int p1=0,p2=0;
//        5
//        1 3 9 5 2
//        5
//        3 2 5 7 8
        while (p1 !=n && p2 !=m)
        {
            if(a[p1]>b[p2])
            {
                p2++;
                continue;
            }
            if(a[p1]==b[p2])
            {
                answer.add(a[p1]);
                p1++;
                p2++;
                continue;
            }
            if(a[p1]<b[p2])
            {
                p1++;
                continue;
            }

        }
        for(int s : answer)
        {
            System.out.print(s+" ");
        }
    }
}
