package 정렬탐색;

import java.util.ArrayList;

public class 마구간정하기실패 {
    public void solu(int[] arr, int magu, int horse) {
        // 1 2 4 8 9
        //가장 가까운말의 거리가 최대값
        //rt =8; 9-1
        //lt =1; 2-1
        int rt=arr[magu-1]-arr[0];
        int lt=arr[1]-arr[0];
        int mid;
        while(lt<=rt)
        {
            mid =(rt+lt)/2;

        }






    }
    public int maxdist(int[] arr,int horse,int distance)
    {
        ArrayList<Integer> distnc=new ArrayList<>();
        boolean answer=false;
        int max=0;
        int[] maguindex = new int[horse];
        //포인터들을 만든다.
        for(int i=0;i<horse;i++){
            maguindex[i]=i;
        }
        //포인트들을 늘려가며 거리를 구한다.
        int lastpointer=maguindex[horse-1];
        while(lastpointer< arr.length){
                for(int i=0; i< maguindex.length-1;i++){//포인터들의 차이를 넣는다
                   int distan=0;
                   int p1=arr[maguindex[i]];
                   int p2=arr[maguindex[i+1]];
                   distan=p1-p2;
                   distnc.add(distan);
                }
                for(int j=0;j<maguindex.length;j++){

                }
        }

        return max;
    }
}
