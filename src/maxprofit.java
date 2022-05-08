public class maxprofit {
    public void solu(int[] profit_record, int day, int iConsecutive_day)
    {
        int p1 =0;
        int p2 =iConsecutive_day-1;
        int max =0;
        for(int k=iConsecutive_day; k<day+1; k++)
        {
            int local_max =0;
            int q =p1;
            int i_index=0;
            while(i_index<iConsecutive_day)
            {
                 local_max += profit_record[q];
                 q++;
                 i_index++;

            }
            p1++;
            if(max <local_max)
            {
                max =local_max;
            }
        }
        System.out.print(max);

    }
}
