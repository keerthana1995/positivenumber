package cse2;

import java.util.Scanner;

class Test {

	public static void main(String a[]) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		number=s.nextInt();
		if(number<0)
		{
			System.out.println("the number is negative");
			
		}
		else
		{
			System.out.println("the number is positive");
		}
	}
}