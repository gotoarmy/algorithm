package 정렬탐색;

public class 이분검색 {
    public void solu(int[] arr, int num) {
        int start =0;
        int end =arr.length-1;
        int half =(end-start)/2;

        //
        while(arr[start]!=num)
        {
            if(num>arr[start])//오른쪽에존재
            {
                if (half < 10)
                {
                    while(arr[start]!=num){
                        start++;
                        if(start==1000)break;
                    }
                    break;

                }
                    start = start+half;
                    half = (end - start) / 2;

            }
            else if(num<arr[end])//딱찾음
            {
                if (half < 10)
                {
                    while(arr[end]!=num){
                        end--;
                    }
                    start=end;
                    break;
                }
                end =end-half;
                half =(end-start)/2;

            }

        }
        System.out.print(start+1);

    }
}
