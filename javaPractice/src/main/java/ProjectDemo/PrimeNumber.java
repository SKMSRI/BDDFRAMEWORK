package ProjectDemo;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" please Enter Number");
		int num=sc.nextInt();
		int count=0;
		
		if(num>1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println(" Number is prime number");
			
			}
			else {
				System.out.println(" Not a prime number");
			}
		}
		
		

	}

}
//prime numbers are two factors, it divided by itself or by 1
//2 is lowest prime number

