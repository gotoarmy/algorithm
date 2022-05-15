package 문자열;

class 펠린드롬 {
	

   public void toupper(char[] save)
   {
	   int i = 0;
	  for(char x :save)
	  {
		  if(x >96)
		  {
			  x -=32;
			  save[i] = x; 
		  }
		  i++;
	  }
	   
   }
   public boolean isalphasame(char[] save)  
   {
	   int loopcount = save.length/2;	
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
	 char[] save = input.toCharArray();
	 this.toupper(save);
	 if(this.isalphasame(save))
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
