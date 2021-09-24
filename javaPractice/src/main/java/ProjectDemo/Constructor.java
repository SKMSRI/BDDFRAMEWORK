package ProjectDemo;

//example of Default constructor
public class Constructor {

	int id;
	String name;

	// method to display the value of id and name
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects
		Constructor s1 = new Constructor();
		Constructor s2 = new Constructor();
		// displaying values of the object
		s1.display();
		s2.display();
	}
}

//Output: 0 ,null

//Java Program to demonstrate the use of the parameterized constructor.  
class Student4 {
	int id;
	String name;

	// creating a parameterized constructor
	Student4(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		Student4 s1 = new Student4(111, "Karan");
		Student4 s2 = new Student4(222, "Aryan");
		// calling method to display the values of object
		s1.display();
		s2.display();
	}
} // output: 111, Karan & 222, Aryan

/*
 It is a special type of method which is used to initialize the object.
•	Constructor name must be the same as its class name.
•	A Constructor must have no return type(void)
•	A Java constructor cannot be abstract, static, final, and synchronized
•	Every time an object is created using the new() keyword, at least one constructor is called.
•	There are two type of constructors 1. Default 2. Parametrized
		o A constructor is called "Default Constructor" when it doesn't have any parameter.
		o default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
		o A constructor which has a specific number of parameters is called a parameterized constructor.
		o It is used to provide different values to distinct objects. However, you can provide the same values also.
 * 
 */