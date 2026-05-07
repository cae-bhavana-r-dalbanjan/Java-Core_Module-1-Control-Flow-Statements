package com.java.control_transfer_statements;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		while(num <= 5)
		{
			if(num == 3)
			{
				break;
				
			}
			else
			{
				System.out.println(num);
			}
			num++;
		}

	}

}
