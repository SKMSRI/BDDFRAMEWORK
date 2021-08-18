package ProjectDemo;

public class String_Duplicate_characters {
	
	public static void main(String[] args) {
		String string1 = "Great responsibility";
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}

}

/*
 * Example: Input: str = “geeksforgeeks” Output: s : 2 e : 4 g : 2 k : 2
 * 
 * Input: str = “java” Output: a : 2
 */

/*
 * 1. Create a hashMap of type {char, int}. 2. Traverse the string, check if the
 * hashMap already contains the traversed character or not. 3. If it is present,
 * * then increment the count or else insert the character in the hashmap with
 * frequency = 1. 4. Now traverse through the hashmap and look for the
 * characters with frequency more than 1. 5.Print these characters with their
 * respective frequencies
 */


