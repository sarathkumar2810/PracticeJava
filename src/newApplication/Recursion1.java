package newApplication;

public class Recursion1 {
	
public void printNumAsc(int n) {
		
		if(n == 6) {
			return;
		}
		System.out.println(n);
		printNumAsc(n+1);
	}
	
	public void printNumDes(int n) {
		
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printNumDes(n-1);
	}
	
public void printSum(int n, int sum) {
		
		if(n == 0) {
			System.out.println("The Sum is " + sum);
			return;
		}
		sum += n;
		printSum(n-1, sum);
	}

public void printSumFor(int n, int sum) {
	
	for (int i=0; i <= n; i++)
	sum += i;
	System.out.println(sum);
}

public int printFactorial(int n) {
	
	if (n <= 0) {
		return 1;
	}	
	return n * printFactorial (n-1);
}

public int printFactorialFor(int n) {
	int val = 1;
	for (int i=1; i <= n; i++) {		
		val = i * printFactorial (n-1);
	}
	return val;
}

public void printFib(int a, int b, int n) {
	
	if (n == 0) {		
		return;
	}
	System.out.println(a);
	printFib(b, a+b, n-1);
}

public void printFibo(int a, int b, int n) {
	
	if (n == 0)
		return;
	
	int c = a+b;
	System.out.println(c);
	printFibo(b , c, n-1);
}

public int calcPower(int x, int n) {					//X^n = X * (X^n-1)
	
	if (n == 0) {	// base case 1									
		return 1;
	}
	
	if (x == 0) {	// base case 1
		return 0;
	}
	
	int val = calcPower(x, n-1);	// work
	int xn = x * val ;
	return xn;
 	
}	

public int calcLogPower(int x, int n) {					//X^n = (X^n/2) * (X^n/2) 		-------> even
														//X^n = (X^n/2) * (X^n/2) * X   -------> odd
	if (n == 0) {	// base case 1									
		return 1;
	}
	
	if (x == 0) {	// base case 1
		return 0;
	}
	
	if (n % 2 == 0) {	// if n is even
		int val = calcLogPower(x, n/2) * calcLogPower(x, n/2);
		return val;
	} else {			// if n is odd
		int val = calcLogPower(x, n/2) * calcLogPower(x, n/2) * x;
		return val ;
	}
	
}
 
}
