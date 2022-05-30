package 정렬탐색;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class cordinate{
    public cordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int size = kb.nextInt();
        좌표정렬 좌표정렬 = new 좌표정렬();
        List<cordinate> cordinate= new ArrayList<>();
        for(int i=0; i<size;i++){
            cordinate.add(new cordinate(kb.nextInt(),kb.nextInt()));
        }
        좌표정렬.solu(cordinate,size);

    }
}



