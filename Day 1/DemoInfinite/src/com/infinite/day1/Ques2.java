//Write a Program accept 5 subjects marks and display total and avegage,
//If all subjects he crosses 35 marks then only show the score else print as failed 
package com.infinite.day1;

public class Ques2 {
	
	public void calc(int a,int b,int c,int d,int e){
		if(a>=35||b>=35||c>=35||d>=35||e>=35){
			double total = a+b+c+d+e;
			double avg = total/5;
			System.out.println("Total Marks = "+total);
			System.out.println("Average of Marks = "+avg);
		}
		else{
			System.out.println("Failed");
		}
	}

	public static void main(String[] args) {
		int a,b,c,d,e,total,avg;
		a=45;
		b=56;
		c=67;
		d=78;
		e=89;
		Ques2 obj = new Ques2();
		obj.calc(a, b, c, d, e);
	}
}
