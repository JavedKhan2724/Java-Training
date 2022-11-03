package infinite.JDK;

interface ICalc{
	int calc(int a,int b);
}
public class LambdaCalc {
     public static void main(String[] args) {
		ICalc obj=(a,b) ->{
			return a+b;
		};
		System.out.println("Sum is "+obj.calc(12, 4));
		ICalc obj2=(a,b) ->{
			return a-b;
		};
		System.out.println("Sub is "+obj2.calc(15, 3));
		ICalc obj3=(a,b) ->{
			return a*b;
		};
		System.out.println("Mult is "+obj3.calc(5, 3));
	}
}
