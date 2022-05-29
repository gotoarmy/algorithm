package 정렬탐색;

import java.util.Arrays;
import java.util.Collections;

public class 중복확인{
    public void solu(int[] arr, int size) {
        Arrays.sort(arr);
        boolean isgood =false;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("D");
                isgood =true;
                break;
            }
        }
        if(!isgood) System.out.println("U");


    }
}
