package ProjectDemo;

public class FinallyConcept {

	public static void main(String[] args) {
		
		try{
	         int a = 10;
	         int b = 0;
	         int result = a/b;
	      }catch(Exception e){
	         System.out.println("Error: "+ e.getMessage());
	      }
	      finally{
	         System.out.println("Finally Keyword concept.");
	      }
	}

}
//The finally keyword is used to create a block of code that follows a try block. 
//A finally block of code always executes, whether or not an exception has occurred. 
//Using a finally block allows you to run any cleanup-type statements that you just wish to execute despite what happens within the protected code.