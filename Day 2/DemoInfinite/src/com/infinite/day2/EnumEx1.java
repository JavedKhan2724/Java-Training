package com.infinite.day2;


enum WeekDays{Sunday,Monday,Tuesday,Wednesday,Thusday,Friday,Saturday}

public class EnumEx1 {
	public static void main(String[] args) {
		WeekDays wd = WeekDays.Tuesday;
		System.out.println(wd);
		String str = "Friday";
		wd = WeekDays.valueOf(str);
		System.out.println(wd);
	}
}
