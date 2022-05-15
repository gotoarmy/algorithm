package 문자열;

class 펠린드롬세기 {

	int pellcount =0; // ��ȿ�� �Ӹ������ ������ ��
	
	
	public String reversestr(String input)
	{
	 
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
		  String reverse = new String(save);// ��Ʈ�� �����ϰ� �����ڿ� ���ڿ��� �������
		   return reverse;
	}
    public boolean isalpha(char c)
    {
    	if(c >64 && c <91)
    		return true;
    	else
    		return false;
    }
	public String toupper(String input) //�빮�ڷ� ����
	   {
		char[]save =input.toCharArray();
		  int i = 0;
		  for(char x :save)
		  {
			  if(x >96 && x <123)
			  {
				  x -=32;
				  save[i] = x; 
			  }
			  i++;
		  }
		  String str =new String(save);
		   return (str);
	   }
	public void isalphasame(String _front, String _back)
	{
		char[] front = _front.toCharArray();
		char[] back = _back.toCharArray();
		  
		int iloopcount = front.length;
		int samecount =0;
		
		  for (int i =0; i < iloopcount; i++)
		  {
			//���Ĺ����� üũ - �����̸� ���ϰ� �ƴϸ� �Ѿ��  
				if(this.isalpha(front[i]) && this.isalpha(back[i]))  //�ΰ� �� �����ϰ��
				{
				   if(front[i]==back[i])
					   samecount++;				   
				}
				  
				
		  }
		 if (samecount == iloopcount)
		 {
			 this.pellcount++;
		 }
		  
		
	}
	public String alphaonly (String _front)
	{
	  StringBuilder strbuil = new StringBuilder();
	  String return_Str =null;
	  char[]save =_front.toCharArray();
	  int i = 0;
	  for(char x :save)
	  {
		  if(x >64 && x <91)
		  {
			 strbuil.append(x);
		  }
		  i++;
	  }
	  return_Str =strbuil.toString();
	  return return_Str;
	}
	public String solu(String input1) {
		// TODO Auto-generated method stub
		String answer=null;
		int i = 0;
		int j;
		String[] arr1 =input1.split(" ");
		j = (arr1.length);
		j -=1;
		int loopcount = arr1.length/2;		
	    for(int k =0; k<loopcount; k++)
	    {
		    	//�ܾ�� �и��� ��Ʈ�� �迭�� ���Ѵ� ó���� �� ��
	    	    String front = arr1[i];
	    	    String back =  arr1[j];		
	    	    //�޹��� ������ ����� back�� ����
	    	    back = this.reversestr(back);
	    	    // �� ��Ʈ���� �빮�ڷ�
	    	front = this.toupper(front);
	    	back = this.toupper(back);
	    	//������ Ȯ���ϱ����� ���Ĺ ������
	    	front = this.alphaonly(front);
	    	back =this.alphaonly(back);
	    	this.isalphasame(front, back);	    		    	    	    	   
	    	i++;
	    	j--;
	    }
	    
       if(this.pellcount == loopcount )
       {
    	   answer = "YES";
       }
       else
       {
    	   answer = "NO";
       }
		
		return answer;
	}

}
