package com.infinite.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivEx {
	public static void main(String[] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Dividion "+c);
		} catch (ArithmeticException e){
			System.out.println("Division by zero impossible");	
		} 
		catch(InputMismatchException e) {
			System.out.println("String can't be converted as integer...");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("Program from Infinite Training..");
		}
	}
	
}
