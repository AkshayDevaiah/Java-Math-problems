package Basics;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number a");
		int a=sc.nextInt();
		System.out.println("Enter the number b");
		int b=sc.nextInt();
		int gcd=0;
		System.out.println("highest common factor of the number are ");
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd=i;
				System.out.print(gcd+" ");
			}
		}
		sc.close();
	}

	}


