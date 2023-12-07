package Basics;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int temp=number;
		int rem=0,sum=0;
		while(number>0) {
			rem=number%10;
			sum=(sum*10)+rem;
			number/=10;
		}
		if(temp==sum) {
		System.out.println("Palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		sc.close();

	}

}
