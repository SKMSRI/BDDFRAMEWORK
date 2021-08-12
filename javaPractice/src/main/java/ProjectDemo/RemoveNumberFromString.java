package ProjectDemo;

import java.util.Scanner;

public class RemoveNumberFromString {

	{
		public static void main(String[] args) 
		  {
		    Scanner sc = new Scanner(System.in);
		    String inp; // Variable 'inp',for storing the input
		    System.out.println("Enter your string:");
		    inp = sc.nextLine();
		    System.out.println("After deletion of any digits,the string is:");
		    inp = inp.replaceAll("[0123456789]",""); // .replaceAll(),function used to replace. 
		    System.out.println(inp);
		}
		}
}
