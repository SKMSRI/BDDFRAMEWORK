package ProjectDemo;

public class SwapStringWithoutuseThirdVariaable {
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
