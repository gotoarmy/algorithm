import java.util.ArrayList;
import java.util.List;

public class 최대길이수열 {

    int max_length=0;  // local과 비교하여 최대길이를 출력한다.
    int local_zerocount =0;
    int p1 =0; //첫번재포인터, 더하기의 시작점
    int p2 =0;
    //두번째포인터,
    //1. 0을찾는포인터찾으면 카운트하겠음 ,change카운트만큼 0을찾음,카운트만큼추가함
    //2. 추가한후 zerochange =true 시킴
    //3. 이 이후로 0이나오면 지역합을 구해서 max_length보다 더크면 max에 넣음
    //4. loop는 p2가<n보다 작을때까지 반복
    boolean zerochange=false;  //zero가 1로 바뀐것
    boolean lastzero =false; //last제로로 부터 1이 몇개인지 세서 local_length에 넣어주어야함
    boolean findend=false; //true와 false일 경우 조작을 해주어야함
    public void solu(int[] arr, int n, int changecount) {
        //14 2
        //1 1 0 0 1 1 0 1 1 0 1 1 0 1
        int local_length =0;
        int lastzerosave=0;
        while(p2 < n)
        {

          if(!findend)
          {
              if(0==arr[p2]) //0을만날 경우
              {
                if(zerochange) //zerochange를 만족
                {
                  lastzero=true;
                  if(lastzero)
                  {
                      findend=true;
                      
                  }
                } 
                else
                {
                    if(changecount!=local_zerocount)
                    {
                        local_zerocount++;
                        p2++;
                    }
                    else if(changecount ==local_zerocount)
                    {
                        local_length +=local_zerocount;
                        p2++;
                        
                        zerochange=true;
                    }
                }
              }
              else if(1==arr[p2]) //1을만날경우
              {
                  if(lastzero)
                  {
                      lastzerosave++;
                      local_length++;
                      p2++;
                  }
                  else
                  {
                      local_length++;
                      p2++;
                  }
              }
          }
            if(findend) //비교후 초기화
            {
                if(max_length<local_length) //비교해 넣고
                {
                    max_length= local_length;
                }//초기화
                zerochange=false;
                lastzero=false;
                local_zerocount=0;
                local_length=lastzerosave; //마지막 0이상의 수를 세이브해서 뒤쪽단계에 전해준다.
                lastzerosave=0; //전해주고 초기화
                p1=p2;
                findend=false;

            }
        }
        //maxlength를 출력
        System.out.print(max_length);


    }
}
