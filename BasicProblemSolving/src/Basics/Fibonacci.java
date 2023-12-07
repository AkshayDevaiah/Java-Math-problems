package Basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for n");
		int n=sc.nextInt();
		int num1=0;
		int num2=1;
		int sum;
		
		System.out.print(num1+" "+num2+" ");
		
		for(int i=2;i<=n;i++) {
			sum=num1+num2;
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
		sc.close();
	}

}
