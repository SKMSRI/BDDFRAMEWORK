package ProjectDemo;

import java.util.HashMap;
import java.util.Scanner;

public class String_countofeachcharacter {

	public static void main(String[] args) {
//		Scanner sc =new Scanner(System.in);
//		String s= sc.nextLine();
//		System.out.println(";Enter Words");

		String s = "SAURABH SRIVASTAVA";
		int Count;
		char ch;
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (hashMap.containsKey(ch)) {
				Count = hashMap.get(ch);
				Count++;
				hashMap.replace(ch, Count);
			} else {
				hashMap.put(ch, 1);
			}

		}
		for(Character Key : hashMap.keySet()) {
			System.out.println(Key+ " = "+hashMap.get(Key));	
		}
		}

	}
