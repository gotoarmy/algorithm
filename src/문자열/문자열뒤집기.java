package 문자열;



class 문자열뒤집기 {
	public void reversestr(String input)
	{
//		Scanner in =new Scanner(System.in);
//		 int i_input = in.nextInt();
//		 rever rever =new rever(); 
//		 for(int j = 0; j < i_input; j++)
//		 { 
//		 String input1 = in.next();
//		 rever.reversestr(input1);
//		 
//		 }
		 //����
		int i=0;
		int j=0;
		char[] save =input.toCharArray();
		j = (save.length);
		j -=1;
		int loopcount = save.length/2;		
	    for(int k =0; k<loopcount; k++)
	    {
		    	char temp= 0;
		    	temp = save[i];
			    save[i] =save[j];
			    save[j] =temp;
			    i++;
			    j--;
	    }   
		
		System.out.println(save);
	}
}
