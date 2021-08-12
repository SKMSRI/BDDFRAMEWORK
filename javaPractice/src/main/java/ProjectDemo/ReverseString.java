package ProjectDemo;

import java.util.Scanner;

class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String Name = sc.nextLine();
		
		int length = Name.length();
		String rev = "";
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + Name.charAt(i);
		}
		System.out.println("Reverse of " + Name + " is " + rev);
	}
}
