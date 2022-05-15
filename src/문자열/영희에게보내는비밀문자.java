package 문자열;

class 영희에게보내는비밀문자 {

	public void solu(String input)
	{
		int count=0;
		char p =0;
		int temp =0;
		int twosquare =64;
		char[] tochar =input.toCharArray();
		int binum =0;
		for(char x : tochar)
		{
			if (7 == count)
			{ 
				if('/'== x) count++; //�������� ��Ÿ���� ���ڿ�
				p =(char)temp;
				System.out.print(p);
				temp =0;
				twosquare =64;
				count =0;				
			}
			if('#'==x) 
			{
				binum = 1;		
			}
			else
			{
				binum = 0;
			}
			temp += binum*twosquare;
			twosquare= twosquare/2;
			count++;
			
		}
		
		
	}

}
