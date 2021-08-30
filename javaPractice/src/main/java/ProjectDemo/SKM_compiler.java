package ProjectDemo;

public class SKM_compiler {


		public static void main(String args[]) {

			int a[] = {0, 1, 3 };
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
				System.out.println("Total number is : " + sum);
				
				int sum1=0;
				for(int j=1;j<=3; j++) {
				sum1=sum1 + j;
		}
		System.out.println("Toatal Number is :  " +  sum1);
		
		System.out.println("Missing number is : " + (sum1-sum));
			}
	}



