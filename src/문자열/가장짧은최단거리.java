package 문자열;

import java.util.ArrayList;

public class 가장짧은최단거리 {
    
	   public void solu(String input, char c)
	   {
		   
		   char[] data =input.toCharArray();		   
		   ArrayList<Integer> num = new ArrayList<Integer>();//2,5,10
		   ArrayList<Integer> printarr = new ArrayList<Integer>();//
		   
		   int index =0;
		   for (char x : data)
		   {
			   if( x == c)
			   {
				   num.add(index);
			   }
			   index++;
		   }
		  // int breakd=00;
		   
		  
        
	      for(int i=0; i<data.length;i++)
	      {
	   	   int diff =0; //���� �ε����� ���� ��Ÿ��������
		   int min =0;
           if(num !=null)
           {
        	   int count=0;
         	  for(int z: num)
        	  {
        		    diff=i-z;
        		    if(diff <0) diff = -diff;
        		    if(0==count) min =diff;
        		    else if(min >diff) min = diff;
        		    count++;        		    		
        	  }
        	  printarr.add(min);
           }      
	      }
	      for (int z : printarr)
	      {
	    	  System.out.print(z+" ");
	      }
	   }
	   

}
