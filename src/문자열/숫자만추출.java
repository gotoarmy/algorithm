package 문자열;

class 숫자만추출 {

	public String deletefrontzero(StringBuilder str)
	{ 
		String str2 =str.toString();
		char[] save = str2.toCharArray();
		int index=0;
		int i =0;
		while('0' == save[i])
		{			
			if('0' != save[i])
			{
				index =i;
				
			}
			else
			{
				i++;
				index++;
			}
		}
		str2 = str2.substring(index);
		return str2;
		
	}
    public String OnlyNum(String input)
    {
    	String re_str=null;
    	StringBuilder strbuild =new StringBuilder();
    	// ���ڹ迭�� ��ȯ
    	char[] save =input.toCharArray();
    	//��ȸ�ؼ� ���ڸ� ��Ʈ��������append��
    	for(char c : save)
    	{
    	    if(c > 47 && c < 58)
    	    {
    	    	strbuild.append(c);
    	    }
    	}
    	//�������
    	//0�̾ƴ��ε�����ȯ
    	re_str = this.deletefrontzero(strbuild);             	 
    	return re_str;
    			
    }
	public String solu(String input)
	{
		String answer =null;
		//1.���ڷθ� �����.
		answer =this.OnlyNum(input);	
		
		return answer;
	}
}
