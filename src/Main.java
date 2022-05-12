import java.util.Scanner;
import java.util.ArrayList;





public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int student_num = in.nextInt();
        해쉬[] arr=new 해쉬[5];
        int sequence=0;
        char alpha=65;
        while(sequence<5) //후보등록 A B C D E
        {
            해쉬 some=new 해쉬();
            arr[sequence] =some;
            some.setKey(alpha++);
            sequence++;
        }
        char[] vote_result=new char[student_num]; //표입력받기
        String vote = in.next();
        vote_result=vote.toCharArray();
        for(char z : vote_result)// 표확인
        {
            sequence=0;
            while(true)
            {
                if(z==arr[sequence].key)
                {
                    arr[sequence].counting();
                    break;
                }

                sequence++;
            }


        }
        //당첨자 확인
        int maxcount=0;
        int i=0;
        while (i < arr.length)
        {
           if(maxcount<arr[i].getCount())
           {
              maxcount =arr[i].getCount();
           }
            i++;
        }
        int j=0;
        while(j <arr.length)
        {
            if(maxcount==arr[j].getCount())
                System.out.print(arr[j].getKey());

            j++;

        }




    }
}