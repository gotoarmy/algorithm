package 문자열;

 class 문자열팰린드롬 {

	 public String onlyalpha(String input)
	 {
		 StringBuilder strbuil = new StringBuilder();
		 char[] save = input.toCharArray();
		 
		 for (char c : save)
		 {
			 if(c > 64 && c <91) //�빮���ΰ��;
			 {
				 strbuil.append(c);
			 }
			 if(c > 96 && c <123)
			 {
				 c -=32;
				 strbuil.append(c);
			 }
		 }
		 String re_str =strbuil.toString();
		 return re_str;
	 }
	   public boolean isalphasame(String a)  
	   {
		   char[] save =a.toCharArray();
		   int loopcount = save.length;	
			int count =0;
		    int i =0;
			int j=0;
			j = (save.length);
			j -=1;
			
		    for(int k =0; k<loopcount; k++)
		    {	        
			    if(save[i]==save[j]) 
			      {count++;}		    
			    i++;
			    j--;		    	
		    }   
		    
		    if (count == loopcount) 
		       { return true; }	
		    else 
		     { return false; }     
	   }
	 public String solu(String input)
	 {
		 String answer = null;
		 
		 // 1. ���ڿ��� ���Ĺ��� ���� �ϰ� �پ��ֱ� ,�빮��ȭ ok;
		 String alpha =this.onlyalpha(input);		 
		 // 2.front back ���� �ϳ��ϳ���Ȯ��
	     boolean same =this.isalphasame(alpha);	  
		 if (same)
		 {
			 answer ="YES";					
		 }
		 else
		 {
			 answer ="NO";
		 }
		 
		 return answer;
	 }
}
