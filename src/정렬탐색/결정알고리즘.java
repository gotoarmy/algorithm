package 정렬탐색;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static java.util.Comparator.*;

public class 결정알고리즘 {
    public void solu(int[] arr, int size, int record_num) {
        int line=size/record_num;
        ArrayList<Integer> pointers = new ArrayList<>();
        for(int i=0; i<record_num-1;i++){
            pointers.add(line*(i+1));
        }
        ArrayList<Integer> sum =new ArrayList<>();
        ArrayList<Optional<Integer>> answer=new ArrayList<>();
        while(true)
        {
            int localsum=0;
            for (int i =0;i<arr.length;i++){
                int j=sum.size();
                if(j== pointers.size()) //마지막포인터
                {

                    while(i<arr.length) {
                        localsum += arr[i];
                        if (i == arr.length - 1) {
                            sum.add(localsum);
                            localsum = 0;
                            break;
                        }
                        i++;
                    }
                    break;
                }
                if(j > pointers.size()) break;
                if(i<pointers.get(j)){ // Pointer 0 전까지
                    localsum+=arr[i];
                }
                if(i==(pointers.get(j)-1))//localsum을 어떻게 초기화?
                {
                    sum.add(localsum);
                    localsum=0;

                }

            }
            //여기서 localsum이 다 구해졌으면 복사소트해서 제일 작은 값을 answer에 저장
            Optional<Integer> min = sum.stream().max(comparing(m->m));
            answer.add(min);
            boolean islast=false;
            for(int z=0; z<sum.size()-1;z++){ //문제
                if(sum.get(z)<sum.get(z+1)) { //포인터체크하는 불리언함수를 만들자.
                    pointers.set(z,pointers.get(z)+1);
                    sum.clear();
                    break;
                }
                if(sum.get(sum.size()-1)<=sum.get(sum.size()-2))
                {
                    islast=true;
                    break;
                }
            }
            if(islast)
            {
                break;
            }
        }
        Optional<Integer> min=answer.get(0);
        for(Optional<Integer> a :answer){
                if(a.get()<min.get()) {
                    min=a;
                }
        }
        System.out.print(min.get());

    }
}
