package Basics;

import java.util.Scanner;

public class EvenOddOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int rem=0;
		while(number>0) {
			rem=number%10;
			if(rem%2==0) {
				System.out.println(rem+" even");
			}
			else {
				System.out.println(rem+" odd");
			}
			number/=10;
		}
		sc.close();
	}

}
