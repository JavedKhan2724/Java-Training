//Wrie a program to display a number in roman from (1 to 9999)

package com.infinite.sup;

import java.util.Scanner;

public class task3 {

	public static String StoR(int x){
		String[] th=new String[]{"","M","MM","MMM"};
		String[] h=new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String[] t=new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String[] unit=new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
		
		return th[x/1000]+h[(x%1000)/100]+t[(x%100)/10]+unit[x%10];
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(StoR(num));
	}	
}