package com.basicprograms;

import java.util.Scanner;

public class CountNo {
	public static void main(String []args) {
		int count=0;
		System.out.println("Enter any no:");
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		while(no>0) {
			no=no/10;
			++count;
		}
		System.out.println("number of digits present:"+ count);
	}
}
