package 투포인터슬라이딩;

public class 연속된수열의합투포인터 {
    public void solu(int N)
    {
         int p1=0;    //start pointer
         int p2=0;     //end pointer
         int sum=0;
         int count=0;
        //1 2 3 4 5 6 7 9 10 11 12 13 14 15  두개이상 합이어야함
        while(p2!=N)
        {
            if(sum < N)
            {
                 sum+=p2++;
            }
            else if (sum > N)
            {
                   sum -=p1++;
            }
            else
            {
                 count++;
                 sum +=p2++;
            }

        }
        System.out.print(count);

    }
}
