package 배열;
import java.util.ArrayList;

class 격자판최대합1차배열 {

    public void solu(int input, ArrayList<Integer> A)
    {
        ArrayList<Integer> suma = new ArrayList<>();
        int loop =0;
        int maxsum =0;
        int sum =0;
        int count =0;
        int index =0;
        //1. row  ,loop =input*input, index 1씩증가 ,합중 큰값을 sum에 넣음
        loop=input*input;
            while(index <loop)
            {

                if (input == count)
                {

                    //초기화
                    //비교 prev_sum이랑 sum의 비교
                    if (maxsum < sum)
                    {
                        maxsum =sum;
                    }
                    sum =0;
                    count=0;


                }
                sum+= A.get(index);

                count++;
                index++;
                if(index ==loop)
                {
                    if(maxsum <sum)
                    {
                        maxsum=sum;

                    }
                    index =0;
                    count=0;
                    sum =0;
                    break;

                }
            }
            //2. collum , loop =input*input ,합중 큰값을 sum에 넣음

        while (index <loop)
            {
                if (input == count)
                {

                    //초기화
                    //비교 prev_sum이랑 sum의 비교
                    if (maxsum < sum)
                    {
                        maxsum =sum;

                    }
                    count=0;
                    sum =0;


                }
                sum+= A.get(index);
                count++;
                index= index+input;
                if(index ==loop)
                {
                    if(maxsum <sum)
                    {
                        maxsum=sum;

                    }
                    index =0;
                    count=0;
                    sum =0;
                    break;
                }
            }
            //3. diagonal,right ;합중 큰 값을 sum에 넣음
           int i=0;
        while(i < input+1) //마지막에 합과 비교하기 위해서 한개 더 실행
        {
            if(input ==i)  //초기화 비교
            {
                if(maxsum <sum)
                {
                    maxsum=sum;

                }
                index =0;
                count=0;
                sum =0;
                break;
            }
            sum +=A.get(index);
            index +=input+1;
            i++;

        }
            //4. diagonal,left
        i= 0;
        index =input-1;
        while (i <input+1)
        {
            if(input ==i)  //초기화 비교
            {
                if(maxsum <sum)
                {
                    maxsum=sum;

                }
                index =0;
                count=0;
                sum =0;
                break;
            }
            sum +=A.get(index);
            index +=input-1;
            i++;
        }



        System.out.print(maxsum);
    }
}
