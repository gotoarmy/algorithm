package 재귀DFSBFS;

public class 팩토리얼 {
    int answer=1;
    public void solu(int num) {
        if(num ==1) {
            System.out.print(answer);
            return;
        }
        answer*=num;
        solu(num-1);
     }
}
