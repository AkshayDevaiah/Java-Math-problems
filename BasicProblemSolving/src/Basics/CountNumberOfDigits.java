package Basics;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int count=0;
		while(number>0) {
			number/=10;
			count++;
		}
		System.out.println("Number of Digits "+count);
		sc.close();
	}
}
