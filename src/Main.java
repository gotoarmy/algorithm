import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        모든아나그램찾기 anagram =new 모든아나그램찾기();
        String first= in.next();
        String second =in.next();
        anagram.solu(first,second);
    }
}