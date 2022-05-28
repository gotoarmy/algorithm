package 정렬탐색;

import java.util.LinkedList;


public class 캐시매모리 {
    LinkedList<Integer> answer = new LinkedList<>();
    public void cacheMiss(int offer,int cachesize) {
         if(answer.size()==cachesize) {
             answer.remove(answer.size()-1); //마지막인덱스삭제
         }
        answer.add(0,offer);

    }
    public void cacheHit(int offer,int size){
        //1.offer을 찾음
        answer.removeFirstOccurrence(offer);
        answer.add(0,offer);
    }

    public void solu(LinkedList<Integer> workorder, int cachesize) {
        for(int i=0; i<workorder.size();i++){
            if(answer.contains(workorder.get(i))) {
                this.cacheHit(workorder.get(i),cachesize);
            }
            else {
                this.cacheMiss(workorder.get(i),cachesize);
            }
        }
        for(int a: answer) {
            System.out.print(a+" ");
        }
        int a =0;
    }
}

