package ProjectDemo;

import java.util.Scanner;

/*A palindrome is a string, which, when read in both forward and backward ways is the same.
Example: abba, radar*/

public class PalindromeString {
	
	public static void main(String args[])
	   {
	      String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println(str+" is a palindrome");
	      else
	         System.out.println(str+" is not a palindrome");
	 
	   }

	}


