package 배열;

import java.util.ArrayList;

class 등급구하기 {

    public void solu(int input, ArrayList<Integer> arr)
    { // input 만큼
        ArrayList<Integer> grade = new ArrayList<>();
        int igrade =input;
        int index =0;
        for(int z :arr)
        {
            //요소당 반복수랑, 등수를
            //등수
            int samecount =0; //반복수를 빼줘야함
            for (int w :arr)
            {
                // z랑 모든 인덱스 비교 비교후에 grade를
                if (w == z)
                {
                    samecount++;
                    if (samecount > 1)
                    {
                        igrade--;
                    }
                }
                if(z > w)
                {
                    igrade--;
                }
            }
            grade.add(igrade); //
            igrade =input; //등수초기화
            System.out.print(grade.get(index++)+" ");
        }
        //grade 배열의 등수 출력



    }

}
