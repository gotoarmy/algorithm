package 재귀DFSBFS;
import java.util.*;

public class 부분집합합실패 {
    ArrayList<Integer> arraylist1 = new ArrayList<>();
     int n;
    boolean[] tr;
    int sum = 0;
    public 부분집합합실패(int n){
        this.n=n;
        tr =new boolean[n+1];
        Arrays.fill(tr,false);
    }
    public void DFS(int L, int[] arr, int n) {


        if (L == n + 1) {
            for(int i=0;i<tr.length;i++){
                if(tr[i]==true){
                    sum+=arr[i-1];
                }
            }
            arraylist1.add(sum);
            sum=0;
        } else {

                tr[L] = true;
                DFS(L + 1, arr, n);
                tr[L] = false;
                DFS(L + 1, arr, n);


        }
    }
    public String same(){
        String Answer="NO";
        for(int i :arraylist1){
            if(arraylist1.contains(i)){
                Answer="YES";
            }
        }
        return Answer;
    }
}




