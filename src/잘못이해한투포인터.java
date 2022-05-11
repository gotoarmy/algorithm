import java.util.ArrayList;
import java.util.Collections;

class 잘못이해한투포인터 {
    public void solu(int[] a, int[] b) {
        ArrayList<Integer> same = new ArrayList<>();

        for (int f : a) {
            int middle = b.length / 2;
            int start = 0;
            int middle_left = middle - 1;
            int end = b.length - 1;

            if (f == b[start] || f == b[end]) {
                same.add(f);
                continue;
            }
            while (true) {
                if (start == middle_left) break;
                if (end == middle) break;
                if (f == b[middle_left] || f == b[middle]) {
                    same.add(f);
                    break;
                }
                middle_left--;
                middle++;
            }

        }
        Collections.sort(same);
        for (int t : same) {
            System.out.print(t + " ");
        }
    }
}