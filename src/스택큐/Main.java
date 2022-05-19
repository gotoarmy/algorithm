package 스택큐;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


            Scanner in = new Scanner(System.in);
            int 격자판크기 =in.nextInt();
            int[][] 격자판 =new int[격자판크기][격자판크기];
            for(int i=0;i<격자판크기;i++) {
                for(int j =0;j<격자판크기;j++)
                {
                    격자판[i][j] =in.nextInt();
                }
            }
            int 이동배열크기 =in.nextInt();
            int[] 이동배열 =new int[이동배열크기];
            for(int a=0;a<이동배열크기;a++)
            {
                이동배열[a]=in.nextInt();
            }
            카카오인형뽑기 kakao=new 카카오인형뽑기();
            kakao.solu(이동배열,격자판,격자판크기);

        }
}

