import java.util.Arrays;

class 배열합치기투포인터 {
    public void solu(int[] a,int[] b)
    {
        int n = a.length;
        int m = b.length;
        int lesscount =0; //작은쪽의 예외처리 뜨는 거 방지를 위함
        int lesssize = n > m ? m:n; //작은쪽의 사이즈
        int status=0; //0이면 위가 더 작음, 1이면 아래가 더 작음
        if(n ==lesssize)
        {
            status =0;
        }
        else
        {
            status =1;
        }

        int[] g =new int[n+m];
        int i=0;
        while(lesscount != lesssize)
        {
            if (0 == status) //앞이더작음
            {
                g[i]=a[i++];
                lesscount++;
            }
            else  //뒤가더 작아요
            {
                g[i]=b[i++];
                lesscount++;

            }
        }
        //큰쪽을 넣는다.
        int index =0;
        if(0==status) //앞이 더작음 -->뒤쪽을 넣는다
        {
            while(i<m+n)
            {
                g[i]=b[index++];
                i++;
            }
        }
        else //뒤가 더작음 --> 앞쪽을 넣는다.
        {
            while (i<m+n)
            {
                g[i] =a[index++];
                i++;
            }
        }
        Arrays.sort(g);
        //소트 시킴
        for (int x : g)
        {
            System.out.print(x+" ");
        }

    }
}
