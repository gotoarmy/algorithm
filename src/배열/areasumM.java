package 배열;

class areasumM {
    public void solu(int[] arr, int sum)
    {
     int p1 =0; //합의 첫번째 요소를 가리키는 포인터
     int p2 =0; //합의 마지막 인덱스를 가리키는 포인터
     int sumcount =0;
     int temp=0;
        while (p2 <arr.length)
        {
            if(temp == sum)
            {
                sumcount++;
                temp +=arr[p2++];
            }
            else if(temp <sum)
            {
                temp +=arr[p2++];

            }
            else if(temp >sum)
            {
                temp -=arr[p1++];

            }

        }
        if (sum == temp) sumcount++;

        System.out.print(sumcount);
    }
}
