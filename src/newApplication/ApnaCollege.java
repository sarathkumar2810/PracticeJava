package newApplication;

import java.util.Arrays;
import java.util.Scanner;

public class ApnaCollege {
	
	int n = 4;
	int m = 5;
	
	    public void solidRectangle() {
	    	// Print a Solid rectangle
	    	for (int i = 1; i <= n; i++) {
				//inner loop
				for (int j = 1; j <= m; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	    }
	    
	    public void hollowRectangle() {
	    	// Print a Hollow rectangle
			for (int i = 1; i <= n; i++) {
			//inner loop
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {				
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	    }
	    
	    public void halfPyramid() {
			// Print a Half Permid
			for (int i = 1; i <= n; i++) {
			//inner loop
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
	    }
	    
	    public void reverseHalfPyramid1() {
			// Print a reverse Half Permid(1 approach)
			for (int i = n; i >= 1; i--) {
			//inner loop
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
				}
	    }
	    
	    public void reverseHalfPyramid2() {
			// Print a reverse Half Permid(2 approach)
			for (int i = 1; i <= n; i++) {
			//inner loop
				for (int j = m; j > i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
	    }
	    
	    public void InvertedHalfPyramid() {
			//Print a Inverted Half Permid
			for(int i = 1; i <= n; i++) {
				//inner loop
				for(int j = 1; j <= n-i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	    }
	    
	    public void halfPyramidnumber() {
			// Print a Half Permid with number
			for (int i = 1; i <= m; i++) {
			//inner loop
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
	    }
	    
	    public void invertedHalfPyramidnumber1() {
			// Print a inverted Half Permid with number(1 approach)
			for (int i = m; i >= 1; i--) {
			//inner loop
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
				}
	    }
	    
	    public void invertedHalfPyramidnumber2() {
			// Print a inverted Half Permid with number(2 approach)
			for (int i = 1; i <= m; i++) {
				//inner loop
				for(int j = 1; j<=m-i+1; j++) {
					System.out.print(j+ " ");	
				}
				System.out.println();
			}
	    }
	    
	    public void  floydsTriangle() {
			// Print a floyds Triangle
	    	int number = 1;
			for (int i = 1; i <= m; i++) {
				//inner loop
				for (int j = 1; j <= i; j++) {			
					System.out.print(number + " ");
					number++;
				}
				System.out.println();
			}
	    }
	    
	    public void  onezeroTriangle() {
			// Print a 0, 1 Triangle
			for (int i = 1; i <= m; i++) {
				//inner loop
				for (int j = 1; j <= i; j++) {	
					int sum = i + j;
					if (sum %2 == 0) {  // Even print 1
						System.out.print("1" + " ");	
					} else {			// Odd print 0
						System.out.print("0"+ " ");
					}
				}
				System.out.println();
			}
	    }
	    
	    public void  solidRhombus() {  
	    	//Print a solid rhombus
	    	for (int i = 1; i <= n; i++) {	
	    		//inner loop print space
				 for (int j = 1; j <= n - i; j++) {
					 System.out.print(" " + " ");
				 }
				//inner loop print *
				 for (int j = 1; j <= n; j++) {
					 System.out.print("*" + " ");
				 }
				 System.out.println(); 
			}
	    }
	    
	    public void  numberPyramid() { 
	    	//Print a number Prymid
			for (int i = 1; i <= n; i++) {	
			//inner loop print space
			for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
			//inner loop print j
			 for (int j=1; j<=i; j++)
	            {
	                System.out.print(i + " ");
	            }
			 System.out.println(); 
		}
	    }
	    
	    public void  palandromicNumberPyramid() {
			for (int i = 1; i <= n; i++) {	
			//this lopp is for the space
            for(int j = i; j <= n-i; j++)
                System.out.print(" "+ " ");
            //this loop is for first 
            for(int j = i; j >= 1; j--)
                System.out.print(j+" ");
            //this loop is for the number in reverse order
            for(int j = 2; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
		}
	    } 
	    
	    public void  butterflyPattern() {
			//upper half
			for (int i = 0; i <= n; i++) {
				//stars
				for (int j= 1; j <= i; j++) {
					 System.out.print("*");	
				}
				//Spaces
				int spaces = 2* (n-i);
				for (int j= 1; j <= spaces; j++) {
					 System.out.print(" ");	
				}
				//stars
				for (int j= 1; j <= i; j++) {
					 System.out.print("*");	
				}
				System.out.println();
			}
			
			//lower half
			for (int i = n; i >= 1; i--) {
				//stars
				for (int j= 1; j <= i; j++) {
					 System.out.print("*");	
				}
				//Spaces
				int spaces = 2* (n-i);
				for (int j= 1; j <= spaces; j++) {
					 System.out.print(" ");	
				}
				//stars
				for (int j= 1; j <= i; j++) {
					 System.out.print("*");	
				}
				System.out.println();
			}
	    }
	    
	    public void  diamondPattern1() {
	    	for (int i= 1; i<=n; i++) {
	    		for (int j = 1; j<=n-i; j++) {
	    			System.out.print(" ");
	    		}
	    		for (int j = 1; j <= 2*i-1; j++) {
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    	for (int i= n; i>=1; i--) {
	    		for (int j = 1; j<=n-i; j++) {
	    			System.out.print(" ");
	    		}
	    		for (int j = 1; j <= 2*i-1; j++) {
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    public void  diamondPattern2() {
	    	for (int i= 1; i<=n; i++) {
	    		for (int j = 1; j<=n-i; j++) {
	    			System.out.print(" ");
	    		}
	    		for (int j = 1; j <= i; j++) {
	    			System.out.print("*");
	    		}
	    		for (int j = 2; j <= i; j++) {
	    			System.out.print("*");
	    		}
	    		
	    		System.out.println();
	    	}
	    	for (int i= n; i>=1; i--) {
	    		for (int j = 1; j<=n-i; j++) {
	    			System.out.print(" ");
	    		}
	    		for (int j = 1; j <= i; j++) {
	    			System.out.print("*");
	    		}
	    		for (int j = 2; j <= i; j++) {
	    			System.out.print("*");
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    //--------------------------------------------  FUNCTIONS AND METHODS ---------------------------------------------------------------------------//
	    
	    public void factorial(int n) {
			if (n < 0) {
				System.out.println("Invalid Number");
				return;
			}
			int factorial = 1;
			for(int i = n; i>=1; i--) {
				factorial = factorial *i;
			}
			System.out.println(factorial);
		 }
	    
	    public boolean primeNumber(int n) {
	    	if (n <= 1) {
	    		return false;
	    	}
	    	// Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                return false;
	        return true;	
	    }
	    
	    public void evenOddNumber(int n) {
	    	if (n % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
	    }
		
	    public void tableNumber(int n) {
	    	for (int i = 1; i <= 10 ; i++) {
	    		System.out.println(n*i);
	    	}
	    }
	    
	    public int recurssion(int n) {
	    	if (n == 1) 
	    		return 1;
	    	else 
	    		return n * recurssion(n-1);
	    			
	    }
	    
	    public void printAverage(int n1, int n2, int n3) {
	    	int avg = ((n1 + n2 + n3) / 3);
	    	System.out.println("The Average of 3 input is " + avg);
	    }
	    
	    public void printOddNumber(int n) {
	    	int sum = 0;
	    	for (int i = 1; i <= n; i++) {
	    		if (i % 2 != 0) {
	    			sum = sum + i;
	    			System.out.println(sum);
		    	} 
	    	}
	    }
	    
	    public void greatestNumber(int n1, int n2) {
	    	
	    	if (n1 < n2) 
	    		System.out.println(n2);
	    	else 
	    		System.out.println(n1);
	    }
	    
	    public void circumferenceCircle(int r) {
	    	double pi = 3.14;
	    	double res = 2*pi*r;
	    	System.out.println(res);
	    }
	    
	    public void votingAge(int age) {
	    	if (age > 18) 
	    		System.out.println("Voting age");
	    	else 
	    		System.out.println("Not Voting age");
	    }
	    
	    public void lopping() {
	    	do {
	    		System.out.println("Infinite lopping");
	    	} while (true);
	    }
	    
	    public void power(int x, int n) {
	    	System.out.println(Math.pow(x, n));
	    }
	    
	    public int greatestCommonDivisor(int n1, int n2) {
	    	
	    	//Approach 1
//	    	int i;
//	        if (n1 < n2)
//	            i = n1;
//	        else
//	            i = n2;
//	        for (int j = i; j > 1; j--) {
//	        	if (n1 % j == 0 && n2 % j == 0) 
//	        		return j;
//	        	}
//	        return 1;
	        
	      //Approach 2
//	        if (n2 == 0)
//	        	return n1;
//	        else
//	            return greatestCommonDivisor(n2, n1 % n2);
	        
	        //Approach 3
	        while(n1 != n2) {
	        	if (n1 > n2)
	        		n1 = n1 - n2;
	        	else 
	        		n2 = n2 - n1;
	        	System.out.println(n2);
	        }
	       return n2;
	        }
	    	
	    public void fibnochiSeries(int count) {
	    	
	    	int n1=0,n2=1,n3,i;    
	    	 System.out.print(n1+" "+n2);//printing 0 and 1    
	    	    
	    	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	    	 {    
	    	  n3=n1+n2;    
	    	  System.out.print(" "+n3);    
	    	  n1=n2;    
	    	  n2=n3;    
	    	 }  	 
	    }
	    
	    
//	    -------------------------- Arrays ------------------------------------
	    
	    public void printNames() {
	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter Size of an Array");
	    	int size = sc.nextInt();
	    	
	    	System.out.println("Enter the Names of an Array");
			String names[] = new String[size]; 
			for (int i = 0; i < size; i++) {
				names[i] = sc.next();
			}
			
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
	    }
	    
	    public void minmaxNumbers() {
	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter Size of an Array");    	
			int size = sc.nextInt();
			
			System.out.println("Enter the Numbers of an Array");
			int numbers[] = new int[size];
			for (int i = 0; i < size; i++) {
				numbers[i] = sc.nextInt();
			}
			
			Arrays.sort(numbers);
			System.out.println("min-"+numbers[0]+" max-"+numbers[numbers.length-1]);		
			}
	    
	    public boolean sortedNumbers() {
	    	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter Size of an Array");    	
			int size = sc.nextInt();
			
			System.out.println("Enter the Numbers of an Array");
			int numbers[] = new int[size];
			for (int i = 0; i < size; i++) {
				numbers[i] = sc.nextInt();
			}
			
			boolean isSorted = false;
			for (int i = 0; i < numbers.length-1; i++) {
				if (numbers[i] < numbers[i+1]) 
					isSorted = true;
				else 
					isSorted = false;
			}
			return isSorted;
	    }
	    
	    public void StringBuilderFind() {
	    	StringBuilder sb = new StringBuilder("Sarath@gmail.com");
			String user = "";
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) == '@')
					break;
				else 
					user += sb.charAt(i);
			}
			System.out.println(user);
	    }
	    
	   
	    
	    

}
