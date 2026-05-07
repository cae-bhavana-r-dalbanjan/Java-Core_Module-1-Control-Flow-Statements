package com.java.control_transfer_statements;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		while(num <= 5)
		{
			if(num == 3)
			{
				num++;
				continue;
				
			}
			else
			{
				System.out.println(num);
				
			}
			num++;
		}

	}

}
