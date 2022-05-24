package 정렬탐색;


import java.util.ArrayList;

class 선택정렬 {

    public void solu(ArrayList<Integer> arr, int n) {

        for(int i=0;i< arr.size()-1;i++)
        {       int min =arr.get(i);

            for(int j=i;j<arr.size()-1;j++){
                if(min<arr.get(j+1))
                {
                    min = min;
                }
                else if(min ==arr.get(j+1)){

                }
                else {
                    min=arr.get(j+1);
                }
            }
            int temp =arr.get(i);
            int index =i;
            boolean changed=false;
            for(int j=i;j<arr.size()-1;j++)
            {
               if(min==arr.get(j+1)){
                   index =j+1;
                   changed=true;
               }
               else {
                   changed=false;
               }
            }

                arr.set(i, min);
                arr.set(index, temp);

        }
        for (int s: arr) System.out.print(s+" ");

    }
}
