package Basics;

import java.util.Scanner;

public class PowerOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("Enter the exponent");
		int exp=sc.nextInt();
		int res=1;
		for(int i=1;i<=exp;i++) {
			res=res*number;
		}
		System.out.println(res);

	}

}
