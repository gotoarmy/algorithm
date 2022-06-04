package 해쉬;
import java.util.*;

public class k번째로큰수실패 {
    public int solu(int[] arr, int k, int n) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        //Tset.remove(143);
        //System.out.println(Tset.size());
        //System.out.println("first : "+ Tset.first());
        //System.out.println("last : "+ Tset.last());

        for (int x : Tset) {
            //System.out.println(x);
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }
}

