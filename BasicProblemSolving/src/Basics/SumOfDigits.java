package Basics;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int rem=0,sum=0;
		int temp=number;
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number/=10;
		}
		System.out.println("sum of "+temp +" is "+sum);
		sc.close();
		}

}
