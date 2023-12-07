package Basics;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int prod=1,i;
		for(i=1;i<=10;i++) {
			 prod=num*i;
			 System.out.println(num+"*"+i+"="+prod);
		}
		sc.close();
	}

}
