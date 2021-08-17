package ProjectDemo;

public class Call_by_value_refernce {
	
	int main()
	{
	    int a = 10, b = 20;

	    // Pass by Values
	    swapx(a, b);
	    // Pass reference
//	    swapx(&a, &b);
	    ("a=%d b=%d\n", a, b);
	    

	    return 0;
	}

	// Swap functions that swaps
	// two values
	void swapx(int x, int y)
	{
	    int t;

	    t = x;
	    x = y;
	    y = t;

	    printf("x=%d y=%d\n", x, y);
	}


	Output:
	x=20 y=10
	a=10 b=20

}
//Call by Value
//While calling a function, we pass values of variables to it. Such functions are known as “Call By Values”.
//objects values cannot modified.

//Call By Refernce

//While calling a function, instead of passing the values of variables, we pass address of variables
//(location of variables) to the function known as “Call By References.
//Original value is modified
