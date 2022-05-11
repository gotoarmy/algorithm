import java.util.ArrayList;

class 점수구하기 {
    public void solu(int N, ArrayList<Integer> e)
    {
        //요소 접근 1이면 count+
        //0이면 count 0으로 초기화
        // count만큼 결과값에 추가함.
        int score =0;
        int count =0;
        for (int z : e)
        {
            if (1 == z)
            {
                count++;
                score += count;
            }
            else if(0 == z)
            {
                count =0;
            }
        }
        System.out.print(score);
    }
}
