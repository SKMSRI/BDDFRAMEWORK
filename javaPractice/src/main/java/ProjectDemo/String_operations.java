package ProjectDemo;

/*1. length()
2. charAt()
3. indexOf()
4. SubString()
5. equal/equalsIgnoreCase() - String Comparison 
6. trim()
7. replace()
8. split()
9. concat()
10. String Concatenation using + operator*/

class String_operations {

//1. Get length of the string

	public static void main(String[] args) {

		// create a string
		String greet = "Hello! World";
		System.out.println("String: " + greet);

		// get the length of greet
		int length = greet.length();
		System.out.println("Length: " + length);
		System.out.println("<<==================>>");
	}
}

//2.Join Two Strings(We can join two strings in Java using the concat() method.)
class Main {
	public static void main(String[] args) {

		// create first string
		String first = "Java ";
		System.out.println("First String: " + first);

		// create second
		String second = "Programming";
		System.out.println("Second String: " + second);

		// join two strings
		String joinedString = first.concat(second);
		System.out.println("Joined String: " + joinedString);
	}
}

//Compare two Strings
//In Java, we can make comparisons between two strings using the equals() method. For example,

class Main3 {
	public static void main(String[] args) {

		// create 3 strings
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";

		// compare first and second strings
		boolean result1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + result1);

		// compare first and third strings
		boolean result2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + result2);
	}
}

//SwapWithoutTemp in string
class SwapWithoutTemp {
	public static void main(String args[]) {
		String a = "Love";
		String b = "You";
		System.out.println("Before swap: " + a + " " + b);
		// 1. append a and b
		a = a + b;// Love you
		// 2.store initial value of string a in string b
		b = a.substring(0, a.length() - b.length());
		// 3.store initial value of string a in string b
		a = a.substring(b.length());
		System.out.println("After : " + a + " " + b);
	}
}
///Swap two integers without using temp/third variable

//Class Main4 extends Duplicate_characters_string{
// Find duplicate character in string(Check program DuplicateElements.java)
