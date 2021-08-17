package ProjectDemo;

public class SwapNumberwithoutthirdVariable {
	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		// 1.by using +operator
		x = x + y;//(10+5)=15
		y = x - y;//(15-10)= 5
		x=x-y;//15-5)=10
		System.out.println(x);
		System.out.println(y);
		
		//2. By Using * operator
		x=x*y;//(10*5)=50
		y=x/y;//(5/10)=5
		x=x/y;//(50/5)=10
		System.out.println(x);
		System.out.println(y);
	}
	
}
