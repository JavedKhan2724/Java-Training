package com.infinite.ex;

import java.util.Scanner;

public class Voting {

	public void check(int age) throws VotingException {
		if(age<18){
			throw new VotingException("You are not Eligible for Voting...");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur Age ");
		int age = sc.nextInt();
		Voting obj = new Voting();
		try {
			obj.check(age);
		} catch (VotingException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
