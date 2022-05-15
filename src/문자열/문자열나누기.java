package 문자열;

class 문자열나누기 {
	
	public String solution1(String input) {
		
		String answer =input;
		String[]arr = answer.split(" ");
		answer =null;
		for(int i=0; i<arr.length;i++)
		{
			if ( 0 == i)
				{answer = arr[i];}
			else
			{
			   int a = answer.length();
			   int b = arr[i].length();
			   
			   if(a<b)
			   {
				   answer = arr[i];
			   }
			   else
			   {
				   continue;
			   }
				   
			}
			
		}
		return answer;
	}

}
