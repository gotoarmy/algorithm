import java.util.ArrayList;

public class 소수구하기직접 {
    public void solu(int N)
    {

        ArrayList<Integer> A = new ArrayList<>();
        //배열을 수로 채운다
        int index =0;
        int primenum =0;
        while(index<N)
        {
            A.add(index+1);
            index++;
        }
        int count =0;
        int num =2;
        //배열내 2의배수를 처음을 제외하고 지움
        while(num < N)
        {
            for(int x :A)
            {
                if(2 > x) continue;
                //num의 배수를 제거한다.
                if(0==x%num)
                {
                    if(0==count)
                    {
                        count++;
                        continue;

                    }
                    A.set(A.indexOf(x),0);
                    count++;
                }
            }
            num++;
            count=0;
        }
        for(int z :A)
        {
            if( 0 != z && 1 != z)
            {
                primenum++;
            }

        }
        System.out.print(primenum);



    }
 }


