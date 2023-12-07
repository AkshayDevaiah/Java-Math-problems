package Basics;

import java.util.Scanner;

public class Armstrong {
	public static int power(int x, int y) {
		int ans=1;
		for(int i=1;i<=y;i++) {
			ans=ans*x;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int temp=number;
		int len=0;
		while(number>0) {
			len++;
			number/=10;
		}
		number=temp;
		int rem=0,sum=0;
		while(number>0) {
			rem=number%10;
			sum=sum+power(rem,len);
			number/=10;
		}
		if(temp==sum) {
		System.out.println("Armstrong number");
		}
		else {
		System.out.println("not a Armstrong number");
		}
		sc.close();
	}

}
