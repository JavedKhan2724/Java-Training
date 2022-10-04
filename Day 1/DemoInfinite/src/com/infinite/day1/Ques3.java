//Write a Program to implement sample current bill, as take no.of units 
//first 90 units 1rs
//91 to 150 units 1.5 rs
//151 to 200 units 2 rs
//201 to 240 units 2.5 rs
//240 units after 3 rs
//means if you enter units as 180 means 
//(90*1) +  (60*1.5) + (30*2)

package com.infinite.day1;

public class Ques3 {

	public void check(Double unit){
		double bill = 0;
		double rate;
		if(unit<=90){
			rate = 1;
			bill = unit * rate;
		}
		
		if(unit>90){
			rate = 1;
			bill=90*rate;
			if(unit-150>0){
				rate =1.5;
				bill=bill+(60*rate);
			}
			else{
				rate =1.5;
				bill= bill+((unit-90)*rate);
			}
		}
		if(unit>150){
			if(unit-200>0){
				rate =2;
				bill=bill+(50*rate);
			}
			else{
				rate =2;
				bill= bill+((unit-150)*rate);
			}
		}
		if(unit>200){
			if(unit-240>0){
				rate =2.5;
				bill=bill+(40*rate);
			}
			else{
				rate =2.5;
				bill= bill+((unit-200)*rate);
			}
		}
		System.out.println("Total Ruppee : "+bill);
	}
	public static void main(String[] args) {
		double unit=200;
		Ques3 obj = new Ques3();
		obj.check(unit);
	}
}
