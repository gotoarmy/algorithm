package 정렬탐색;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class 좌표정렬 {
        public void solu(List<cordinate> cordinate, int size) {
                Collections.sort(cordinate,((o1, o2) -> {
                        if(o1.getX()==o2.getX()) return o1.getY()-o2.getY();
                        else{
                                 return o1.getX()-o2.getX();
                        }
                }));


                for (cordinate a: cordinate)
                {
                        System.out.println(a.getX()+" "+a.getY());
                }


        }
}
