package 정렬탐색;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class cordinate{
        public cordinate(int x, int y) {
                this.x = x;
                this.y = y;
        }

        int x;

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

        int y;
}
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
