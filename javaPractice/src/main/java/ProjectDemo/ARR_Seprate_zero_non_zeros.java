package ProjectDemo;

public class ARR_Seprate_zero_non_zeros {
	public static void main(String args[]) {

	    // Given Array
	    int[] inputArr = {0,10,43,27,0,98,75,59,191,0};

	    int counter = 0;

	    //Iterating through the Array
	    
	    for(int i=0;i < inputArr.length;i++) {
	        if(inputArr[i] != 0) {
	            inputArr[counter] = inputArr[i];
	            counter++;
	        }
	    }

	    while (counter < inputArr.length) {
	        inputArr[counter] = 0;
	        counter++;
	    }

	    System.out.println(Arrays.toString(inputArr)); 

	    }

	}
}
