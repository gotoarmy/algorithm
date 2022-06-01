package 재귀DFSBFS;

public class 재귀함수 {
    int i=1;
    public void solu(int size) {
       print(size);
    }
    public void print(int size)
    { // 1 2 3 4 5
        if(i==size+1) return;
        System.out.print(i+" ");
        i++;
         print(size);
    }
}
