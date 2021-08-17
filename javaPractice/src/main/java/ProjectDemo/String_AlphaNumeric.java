package ProjectDemo;
//Extract digits from String in Java
//or 
//Remove digits and print nlyalphabet

public class String_AlphaNumeric {
	
	public static void main(String[] args) {

	String a="Page Not found 404";
	String b="Internal Error 500 Server";
	System.out.println("Number part is" + a.replaceAll("[0-9]", ""));
	System.out.println("Number part is" + b.replaceAll("[^0-9]", ""));
	}
}
