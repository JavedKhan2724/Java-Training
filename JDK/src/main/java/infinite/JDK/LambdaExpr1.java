package infinite.JDK;

interface IHello{
	void sayHello();
}
public class LambdaExpr1 {
   
	public static void main(String[] args) {
		IHello obj1 = () ->{
			System.out.println("Welcome to jdk 1.8");
		};
		obj1.sayHello();
	}
}
