package ProjectDemo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Physics Marks:");
		int Physics = sc.nextInt();
		System.out.println("Enter Cheymistry Marks:");
		int Cheymistry = sc.nextInt();
		System.out.println("Enter English Marks:");
		int English = sc.nextInt();
		System.out.println("Enter Maths Marks:");
		int Maths = sc.nextInt();
		System.out.println("Enter Science Marks:");
		int Science = sc.nextInt();
		float percentage = ((Physics + Cheymistry + English + Maths + Science) / 500.0f) * 100;
		System.out.println("percentage is:");
		System.out.print(percentage);
	}

}
