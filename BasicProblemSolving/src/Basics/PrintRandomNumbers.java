package Basics;

import java.util.Random;

public class PrintRandomNumbers {

	public static void main(String[] args) {
		Random random=new Random();
		int rand_int=random.nextInt(100);
		System.out.println(rand_int);
	}

}
