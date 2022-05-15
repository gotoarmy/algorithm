package 해쉬;

import java.util.HashMap;

public class 모든아나그램 {
    public void solu(String first, String second) {
        int p_erase=0;
        int ana_count =0;
        char[] set = first.toCharArray();
        char[] alpha = second.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>(); //anagram 알파를 집어넣음
        HashMap<Character, Integer> alphamap=new HashMap<>(); //anagram 알파를 집어넣음
        // alpha를 해쉬맵에 넣기
        for (int b=0;b<alpha.length;b++)
        {
            alphamap.put(alpha[b],alphamap.getOrDefault(alpha[b],0)+1);
        }
        for(int i=0; i< alpha.length-1;i++) {
            map.put(set[i],map.getOrDefault(set[i],0)+1);}
        //set을 훑어서 key값이 있으면해쉬셋에 count
        for(int j= alpha.length-1;j<first.length();j++){
            map.put(set[j],map.getOrDefault(set[j],0)+1);
            //요소가 같은지 확인
            //alphamap이랑 map이 같은지 확인
            if(map.equals(alphamap)) ana_count++;
            //이제  앞요소를 지워야함
            map.put(set[p_erase], map.getOrDefault(set[p_erase],0)-1);
            if(0==map.get(set[p_erase])) {
                map.remove(set[p_erase]);}
            p_erase++;
        }

        System.out.print(ana_count);
    }
}