class maxprofit {
    public void solu(int[] profit_record, int day, int iConsecutive_day)
    {
        int p1 =0;
        int p2 =iConsecutive_day-1;
        int max =0;
        int local_max =0;
        boolean isfirst =true;
        for(int k=iConsecutive_day; k<day+1; k++)
        {
            int q =p1;
            int i_index=0;

            while(i_index<iConsecutive_day)
            {
                if(isfirst)
                {
                    local_max += profit_record[q];
                    q++;
                }
                else
                {
                    local_max-=profit_record[p1++];
                    local_max+=profit_record[++p2];
                    break;
                }
                 i_index++;
            }
            isfirst= false;
            if(max <local_max)
            {
                max =local_max;
            }
        }
        System.out.print(max);

    }
}
