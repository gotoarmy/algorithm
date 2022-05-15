package 배열;

import java.util.ArrayList;

public class 수를뒤집어소수임을확인 {

    public int getdigits(int N)
    {
        int i_return =0;

        if(N < 10)
            i_return = 1;
        else if(N <100)
            i_return =2;
        else if (N<1000)
            i_return =3;
        else if (N <10000)
            i_return =4;
        else if (N <100000)
            i_return =5;

        return i_return;
    }
    public  int reverseint(int num,int digit)
    {
        int index =0;
        int a=0;
        int result=0;
        while (index < digit)
        {
            a =num % 10;
            num =num/10;
            result = result*10 +a;
            index++;
        }

        return result;
    }
    public  boolean isprime(int reverse_num)
    {
        if(1==reverse_num )
        {
            return false;
        }
        boolean prime =true;
        for (int i =2; i<reverse_num; i++)
        {
            if(0 == reverse_num % i)
            {
                prime =false;
                break;
            }
        }

        return prime;
    }
    public void solu(int N ,ArrayList B)
    {

        // 배열에 입력 값이 다들어감
        //1. 수의 자리수를 파악한다 1~6자리
        //2. 자리수만큼 반복한다
        int index=0;
        int digitnum=0;
        int reverse_num =0;
        boolean isprime = false;
        while (index <N)
        {
            digitnum =this.getdigits((int)B.get(index));
            //자리수를 뒤집어 변수로 받음
            reverse_num = this.reverseint((int)B.get(index),digitnum);
            isprime=this.isprime(reverse_num);
            if (isprime)
            {
                System.out.print(reverse_num+" ");
            }
              index++;
        }

    }
}
