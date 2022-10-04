package com.infinite.cols;

import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter two numbers   ");
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextInt();
		y=scanner.nextInt();
		z=x+y;
		System.out.println("Sum is  "+z);
	}
}
