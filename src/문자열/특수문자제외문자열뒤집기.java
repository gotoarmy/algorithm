package 문자열;

class 특수문자제외문자열뒤집기 {
    
	public void changing( char[] save, int front,int back)
	{
		char temp = save[front];
		save[front] =save[back];
		save[back] = temp;
		
	}
	public boolean isthatalpha(char alpha)
	{
		if (alpha>64 && alpha <91)
		{
			return true;
		}
		else if(alpha>96 && alpha<123)
		{
		    return true;
		}
		else
		{
			return false;
		}
	}
	public void reverse(String input)
	{
		
		int front=0;
		int back=0;
		char[] save =input.toCharArray();
		back = (save.length);
		back -=1;
		boolean alpha = false;
		int diff =0;
		while( 1 != (back -front)) //�������� ������ ��ӹݺ�
		{
			if(front == back)
			{
				break;
			}
			char frontc = save[front];
			char backc = save [back];
			alpha =this.isthatalpha(save[front]); // �� ��Ҵ� �����ϱ�
			if(alpha) //���� ����
			{
				//�ڰ� Ư������ ���� ��������Ȯ��
				alpha =this.isthatalpha(save[back]);
				if(alpha) //�ڰ� ����
				{
				     this.changing(save, front, back);
				     back--;
				     front++;
				}
				else //�ڰ� ��� �ƴϾ�
				{
					back--; //��� ���ö����� �޿�� 1�ܰ��ϰ� 
					//front�� �״��
				}
			}
			else  //��� �ƴ�
			{
				
				alpha =this.isthatalpha(save[back]);
				if (alpha) //�޹��ڴ� �����ΰ��  
				{
				   //�Ѿ
				}
				else //�޹��ڰ� Ư�������ΰ��
				{
					back--;
				}
				
				
				front++; //��� ���ö����� 1�ܰ���
			}
		}
		// �ݺ����� �������� ������ �񱳸� ����
		alpha = this.isthatalpha(save[front]);
		if (alpha)
		{
			alpha =this.isthatalpha(save[back]);
			if  (alpha)
			{
				this.changing(save, front, back);
			}
		}
		else //���� Ư������
		{
		  //�ƹ��͵� ���� ����    	
		}				 
	    System.out.println(save);
		
	}
}
