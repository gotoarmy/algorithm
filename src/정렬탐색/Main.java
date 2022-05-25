package 정렬탐색;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            int n=kb.nextInt();
            ArrayList<Integer> answer = new ArrayList<>();
            for(int i=0; i<n; i++){
                answer.add(kb.nextInt());
            }
            버블소트 버블소트 = new 버블소트();
            버블소트.solu(answer,n);

        }
    }

