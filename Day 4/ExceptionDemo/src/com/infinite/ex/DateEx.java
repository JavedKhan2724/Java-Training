package com.infinite.ex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateEx {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Date (yyyy-MM-dd) format ");
		String str = sc.next();
		SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = simpleDateFormat.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}
