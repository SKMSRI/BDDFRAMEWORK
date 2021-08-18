package ProjectDemo;
//Extract digits from String in Java
//or 
//Remove digits and print only alphabet

public class String_AlphaNumeric {
	
	public static void main(String[] args) {

	String a="Page Not found 404";
	String b="Internal Error 500 Server";
	System.out.println("Word character is : " + a.replaceAll("[0-9]", ""));
	System.out.println("Numberic is : " + b.replaceAll("[^0-9]", ""));
	}
}
