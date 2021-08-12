package ProjectDemo;

public class Overloading {

	public static void main(String[] args) {
	
		Overloading obj1 =new Overloading();
		obj1.add(3, 2);
		obj1.add(3, 2, 5);
				}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Sum of number is"+c);
	}
	public void add(int a,int b,int d)
	{
		int c=a+b+d;
		System.out.println("Sum of number is"+c);
	}
}
//Method can be overloading if the method has the same name but with different signature.
//Signature means
//Number of arguments(like a, b)
//Type of agruments(like int, )
		