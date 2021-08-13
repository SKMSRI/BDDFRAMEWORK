package ProjectDemo;

class String_operations {

//Get length of the string

	public static void main(String[] args) {

		// create a string
		String greet = "Hello! World";
		System.out.println("String: " + greet);

		// get the length of greet
		int length = greet.length();
		System.out.println("Length: " + length);
	}
}

//Join Two Strings(We can join two strings in Java using the concat() method.)
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
Class Main4 extends DuplicateElements{
	//Find duplicate character in string(Check program DuplicateElements.java)
}