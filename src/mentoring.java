import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;

class mentoring {
    public void solu(int[][] arr,int row,int col)
    {
        int mentor_count=0;
        boolean[] game =new boolean[col];
        Arrays.fill(game,false);
//        4 3
//        3 4 1 2
//        4 3 2 1
//        3 1 4 2
        ArrayList<Integer> mentipossible =new ArrayList<Integer>();
        ArrayList<Integer> frontofindex =new ArrayList<Integer>();

        for(int i=0; i<col; i++) { //첫번째 값을 넣는 반복문
            // 3 4 1 2 가 차례대로 들어감
            int men_index=i+1;
            int index0fvalue=0;
            if (i != col - 1)
            {   //i값의 벨류를 받음
                int value = arr[0][i];
                //해당 값의 뒤값을 멘티posiible로 넣음  arraylist
                while(men_index <col)
                {
                 mentipossible.add(arr[0][men_index]); //루프를돌고 리무브해야함
                 men_index++;
                }
                //각행마다 value 인덱스 앞값을 저장하는 배열 arraylist 만듦
                for(int j=1; j<row; j++)
                {
                    int in =0;
                    //index of value를 구함

                    while(in<col)
                    {
                        if(value==arr[j][in])
                        {
                            index0fvalue=in;
                            break;
                        }
                        in++;
                    }
                    //
                    int in2 =0;
                    if(0!=index0fvalue)
                    {
                        int an=0;
                        while(in2 <index0fvalue)
                        {
                            frontofindex.add(arr[j][in2]); //쓸모없어지면 지움
                            an =arr[j][in2];
                            //menti에서 an인덱스값을 구해서 지워야함;

                            for (int a =0;a<mentipossible.size();a++)
                            {
                                if( an == mentipossible.get(a))
                                {
                                    mentipossible.set(a,0);
                                }
                            }
                            in2++;
                        }
                        //멘티파시블에 있는 0이 아닌 값을 셈
                    }
                    frontofindex.clear();//비워야 다음걸받음
                }
                //앞의 인덱스를 제거한 상태 ,mentiposible만큼 맨토카운트 추가
                for(int s : mentipossible)
                {
                    if(0 != s)
                    {
                        mentor_count++;
                    }
                }

            }
            mentipossible.clear();

        }
        System.out.print(mentor_count);
    }




}

