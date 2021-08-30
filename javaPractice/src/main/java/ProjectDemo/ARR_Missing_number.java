package ProjectDemo;

//Find missing number from 1  to 10
public class ARR_Missing_number {

	public static void main(String args[]) {

		int a[] = {0, 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
			System.out.println("Total number is " + sum);
			
			int sum1=0;
			for(int j=1;j<=10; j++) {
			sum1=sum1 + j;
	}
	System.out.println("Toatal Number is " +  sum1);
	System.out.println("Missing number is " + (sum1-sum));
		}
}