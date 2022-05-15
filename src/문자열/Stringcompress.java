package 문자열;

import java.util.Scanner;


class 문자열압축 {


	public int countreturn(int[] save)
	{ 
		int icount =0;
		for(int i :save )
		{
			if(i >0)
				icount++;
		}
		return icount;
	}
	public void solu(String a)
	{
	   char[] save =a.toCharArray();
	   int count=0;
	   char[] savealpha = new char[save.length];
	   int[] savecount = new int[save.length];
	   char something =save[0];
	   int index=0;
	   for (char x :save)
	   {
		   if(x != something)
		   {
			   savealpha[index] =something;
			   savecount[index++] =count;
			   something = x;
			   count =1;
		   }
		   else
		   {
			   count++;
		   }
	   }
	   savealpha[index]=something;
	   int realcount =this.countreturn(savecount);
	   for (int i =0;i<realcount+1;i++)
	   {
		   if('0'!=savealpha[i])
		   {
			   System.out.print(savealpha[i]);
		   }
		   if(savecount[i] > 1)
		   {
			   System.out.print(savecount[i]);
		   }
	   }	
	   
	}
}
  
