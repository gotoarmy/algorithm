package 배열;

public class 소수에라토네스의체 {
    public void solu(int N) {
        int answer =0;
        int[] ch =new int[N+1];
        for(int i=2; i<=N; i++)
        {
            if(0==ch[i])
            {
                answer++;
                for(int j=i; j<=N; j=j+i) ch[j] =1;

            }
        }
              System.out.print(answer);

    }
}
