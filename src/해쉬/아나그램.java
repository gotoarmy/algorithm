package 해쉬;

import java.util.HashMap;

class 아나그램 {

    public void solu(String first, String second) {
        String answer="YES";
        HashMap<Character, Integer> map=new HashMap<>();
        char[] str =first.toCharArray();
        char[] str2 =second.toCharArray();
        for(char z: str)
        {
            map.put(z,map.getOrDefault(z,0)+1);
        }
        int alphacount=0;
        for(char s :str2)
        {
            if(!map.containsKey(s))
            {
                answer="NO";
                break;
            }
            int in=0;
            int localcount=0;
            alphacount =map.get(s);
            while(in<str2.length)
            {
                if(s==str2[in])
                {
                    localcount++;
                }
                in++;
            }
            if(localcount !=alphacount)
            {
                answer ="NO";
            }
        }
        System.out.print(answer);
    }
}
