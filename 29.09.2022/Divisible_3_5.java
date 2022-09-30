/*Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by
both.*/
package com.cognizant.shapes;

public class Divisible_3_5 {

	public static void main(String[] args) {
		int i;
		System.out.println("Numbers divisible by 3 are:- ");
		for(i=1;i<=100;i++)
		{
			if(i%3==0)
			{
				System.out.println(" "+i);
			}
		}
		System.out.println("Numbers divisible by 5 are:-");
			for(i=1;i<=100;i++)
			{
				if(i%5==0)
				{
					System.out.println(" "+i);
				}
			}
			System.out.println("Number divisible by 3 and 5 are:-");
				for(i=1;i<=100;i++)
				{
					if(i%3==0 && i%5==0)
					{
						System.out.println(" "+i);
					}
				}
		}
	}


