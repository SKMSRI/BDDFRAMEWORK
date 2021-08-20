package ProjectDemo;

import java.util.Arrays;

public class ARR_Largest_smallest_number {
	
	public static void main(String args[]) {

	    // Given Array
	    int[] inputArr = {-10,43,27,-98,75,59,191};
    
	    int largest = inputArr[0]; // Setting largest value
	    int smallest = inputArr[0];// Setting smallest value

	    // Iterate through the Given Array
	    for( int i=1; i<inputArr.length; i++) {
	        if(inputArr[i] > largest) {
	            largest = inputArr[i];
	        }
	        else if (inputArr[i] <smallest) {
	            smallest = inputArr[i];
	        }
	    }
	    System.out.println("\n Given Array is ::"+ Arrays.toString(inputArr));
	    System.out.println("Largest numbers is :: " + largest);
	    System.out.println("Smallest numbers is :: " +smallest);
	    }
	}

