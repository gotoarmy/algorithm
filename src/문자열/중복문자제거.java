package 문자열;

import java.util.ArrayList;

class 중복문자제거 {
	
	public StringBuilder returnanswer(String input)
	{
		ArrayList<String> answer = new ArrayList<>();
		StringBuilder str = new StringBuilder();
		
		int index = 0;
		char[] save =input.toCharArray();
		for (char c : save)
		{
			int indexof =input.indexOf(c);
			if (index == indexof)
			{
			  answer.add(String.valueOf(c));	
			}						
			index++;
		}
		
		for (String c : answer) {
			str.append(c);
			
		}
		
		return str;
	}

}
