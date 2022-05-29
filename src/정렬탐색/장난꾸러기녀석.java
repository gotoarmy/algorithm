package 정렬탐색;

public class 장난꾸러기녀석 {
    public void solu(int[] arrs, int size) {

        int answersecond=0;
        int answerfirst =0;
        int mate =0;
        for(int j=size-1; j>0;j--) {

            if (arrs[j] < arrs[j - 1]) {
                answersecond = j + 1;
                mate =arrs[j];
                break;
            }
        }
        for(int r=answersecond-2;r>=0;r--)
        {
            if(mate>arrs[r])
            {
                int i=r;
                while(arrs[i]<=mate)i++;
                answerfirst=i+1;
                break;
            }

        }


        System.out.print(answerfirst+" "+answersecond);
    }
}
