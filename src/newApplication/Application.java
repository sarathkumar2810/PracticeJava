package newApplication;

//import java.util.List;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//importing packages in Java
//import package.name.Class;   // Import a single class
//import package.name.*;   // Import the whole package

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.time.LocalDate;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;

class Outer {
	 int x = 10;
	 
	 // Note : If you try to access a private inner class from an outside class, an error occurs
	 class Inner {
		 int y = 5;
	 }	 
	 
	 // Static Inner Class
	 static class Last {
		 int z = 3;
	 }
	 
	 // Inner Method returns value of x
	 class InnerMethod {
		    public int myInnerMethod() {
		      return x;
		    }
		  }
	 
}

	// Java enum
enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}


public class Application {
	
	 // Java Create an Object
	 
	 int x;
	 final int y = 10;
	 
	 static String fname = "Sarath";
	 String lname = "Kumar";
	 int age = 27;
	
	// Java constructor Method
	 Application() {
		x = 5;
	}
	
	// Java methods passing parameter and values and if else statement in methods 
	
	 static void callFunction(String name, int age, double percent) {
		 if(age <= 30) 
		System.out.println("Hello " + name + " Your age is " + age + " and cgpa " + percent + " Pass");
		 else 
		System.out.println("Hello " + name + " Your age is " + age + " and cgpa " + percent + " Fail");
	}
	 
	 // Java methods return value 
	 
	 static int addCalculate(int x, int y) {
		 return x + y;
	 }
	 
	  // Java Method Overloading
	 
	 static int addValues(int a, int b) {
		 return a + b;
	 }
	 
	 static float addValues(float a, float b) {
		 return a + b;
	 }
	 
	 // Java Recursion  if input is (10) ----> output = 10+9+8+7+6+5+4+3+2+1+0 = 55 
	 
	 static int sum(int k) {
		 if (k > 0) {
		    return k + sum(k - 1);
		 } else {
		    return 0;
		 }
	 }
	 
	// Java Recursion if input is (5, 10) ----> output = 10+9+8+7+6+5 = 45
	 
	 static int sum(int start, int end) {
		 if (end > start) 
			 return end + sum(start, end - 1);
		 else 
			 return end;
	 }
	 
 // Java Recursion  if input is (5) ----> output = 5*4*3*2*1 = 55 
	 
	 static int fact(int n) {
	     if (n <= 1) // base case
	         return 1;
	     else    
	         return n * fact(n-1);    
	 }
	 
	 // Java Static vs Public method
	 
	 static void myStaticMethod() {
		 System.out.println("myStaticMethod");
	 }
	 
	 public void myPublicMethod() {
		 System.out.println("myPublicMethod");
	 }
	 
	 // Java The throw keyword Exception
	 static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
	 }
	 
	 static boolean isPrime(int n) {
         //since 0 and 1 is not prime return false.
         if(n==1||n==0)return false;
  
         //Run a loop from 2 to n-1
         for(int i=2; i<n; i++){
           // if the number is divisible by i, then n is not a prime number.
               if(n%i==0)return false;
         }
         //otherwise, n is prime number.
         return true;
   }
	 
	 static List<String> fizzBuzz(int num) {
		 List<String> res = new ArrayList<>();
//		 ArrayList<String> result = new ArrayList<>();
		 for (int i = 1; i <= num; i++) {
			 if (i % 3 == 0 && i % 5 == 0) {
				 res.add("FizzBuzz");
			 } else if (i % 3 == 0) {
				 res.add("Fizz"); 
			 } else if (i % 3 == 5) {
				 res.add("Buzz");  
			 } else {
				 res.add(String.valueOf(i)); 
			 }
		}
		return res;	 
	 }
	 
	 static String reverseWords (String val) {
		 String newStr = "";
		 for (int i = val.length()-1 ; i >= 0; i--) {
			 char chr = val.charAt(i);
			 newStr += chr;
		 }
		return newStr; 
	 }
	 
	 static boolean palendrom() {
		 String org = "aaa";
		StringBuilder sb = new StringBuilder();
		 for (int i = org.length()-1; i >= 0; i--) {
			 sb = sb.append(org.charAt(i)); 
		 }
		 System.out.println(sb);
		 if (org.equals(sb.toString()))  return true;
		 return false;
	 }
	 
	
	public static void main(String[] args) {	
//		 TODO Auto-generated method stub
//		System.out.println("Hello Java");
//		
		//Genrics topics
		 
//		Printer<Interger> obj = new Printer<> (56);
//		obj.print();
//		Printer<String> obj1 = new Printer<> ("Genrics");
//		obj1.print();
//		Printer<Double> obj2 = new Printer<> (56.553);
//		obj2.print();
//		Printer<Boolean> obj3 = new Printer<> (false);
//		obj3.print();
//		Printer<Float> obj4 = new Printer<> (56.53);
//		obj4.print();
		
		//Arrays topic
		
//		int[] rollNo = {2,3,4,5,6,7};
//		for(int i = 0; i < rollNo.length; i++) {	
//			System.out.println(rollNo[i]);
//		}	
		
//		for(int rol : rollNo) {
//			if (rol % 2 == 0) {
//				int newrol = rol;
//				System.out.println(newrol);
//			}
//		}
		
		// two dimensional array
		
//		int[][] ids = new int[3][4];
//		
//		for(int i = 0; i < ids.length; i++) {
//			for (int j = 0; j < ids[i].length; j++) {
//				ids[i][j] = (int)(Math.random()*10);
//				System.out.println(ids[i][j] + " ");
//			}
//			System.out.println();
//		}
		
//		for(int d[] : ids) {
//			for (int m: d) {
//				System.out.println(m + " ");
//			}
//			System.out.println();
//			}
			
		
//		int[][] nums= new int[3][];
//		
//		nums[0] = new int[4];
//		nums[1] = new int[3];
//		nums[2] = new int[1];
//		
//		for(int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				nums[i][j] = (int)(Math.random()*10);
//				System.out.println(nums[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// three dimensional array
		
//		
//		int[][][] matric = new int[3][3][3];
//		System.out.println(matric.length);
		
//		//ArraysList topic
//		
//		ArrayList<String> names = new ArrayList<>();
//		names.add("sarath");
//		names.add("xavi");
//		names.add("arun");
//		names.add("raj");
//		System.out.println(names.toString());
//		
//		names.sort(null);
//		System.out.println(names);
//		Collections.sort(names);
//		names.set(2, "rahul");
//		System.out.println(names.toString());
//		
//		System.out.println(names.contains("sarath"));
//		
//		System.out.println(names.indexOf("xavi"));
//		
//		// Get the iterator
//	    Iterator<String> it = names.iterator();
//
//	    // Print the first item
//	    System.out.println(it.next());
//	    
//	 // Loop through a collection
//	    while(it.hasNext()) {
//	    	String st= it.next();
//	        if(st =="arun") {
//	          it.remove();
//	        }
//	    }
//	    
//	    System.out.println(names);
		
		// Java LinkedList
		
//		LinkedList<String> villages = new LinkedList<> ();
//		villages.add("Chennai");
//		villages.add("Banglore");
//		villages.add("Vellore");
//		villages.add("Trichy");
//		villages.add("Pondy");
//		villages.addFirst("Kerala");
//		villages.addLast("Goa");
//		
//		System.out.println(villages.toString());
//		System.out.println(villages.getFirst());
//		System.out.println(villages.getLast());
//		System.out.println(villages.isEmpty());
//		System.out.println(villages.equals("Pondy"));
		
		// Java HashSet
		
//		HashMap<String, Integer> mark = new HashMap<>();
//		mark.put("English", 68);
//		mark.put("Tamil", 75);
//		mark.put("Maths", 87);
//		mark.put("Science", 50);
//		mark.put("Social", 98);
//		
//		System.out.println(mark);
//		mark.remove("Social");
//		System.out.println(mark);
//		System.out.println(mark.size());
//		System.out.println(mark.get("Maths"));      // note to get key(Type) --------> values();	
//		
//		for(String st : mark.keySet()) {			// note to get key(Type) --------> keySet();
//			System.out.println("key: " + st + " value: " + mark.get(st));  
//		}
		
		
		// Java HashSet
		
//		HashSet<String> cars = new HashSet<String>();
//		 cars.add("Volvo");
//		 cars.add("BMW");	// BMW is added twice it only appears once because every item in a set has to be unique
//		 cars.add("");
//		 cars.add("BMW");
//		 cars.add("Mazda");
//		 
//		 System.out.println(cars.contains("Mazda"));
//		 
//		 System.out.println(cars);
//		 
//		 for (String i : cars) {
//			  System.out.println(i.isEmpty());
//			}
		
		
//		callFunction("Sarath", 27, 77.44);
//		callFunction("Deva", 30, 86.75);
//		callFunction("Arun", 56, 65.22);
	
//		System.out.println(addCalculate(4, 4));
	
//		System.out.println(addValues(5, 5));
//		System.out.println(addValues(4.5f, 5.5f));
		
//		int result = sum(10);
//		System.out.println(result);
//		
//		int result1 = sum(5, 10);
//		System.out.println(result1);
//	
//		int facResult = fact(5);
//		System.out.println(facResult);
		
		 // Java Create an Object or multiple object
		
//		Application obj = new Application();	
//		Application obj1 = new Application();
//		System.out.println(obj.x);    // Object 1
//		System.out.println(obj1.x);   // Object 2
//		
//		obj.x = 15;
//		System.out.println(obj.x);    // Object 1 Modify Attributes
//		
//		obj.y = 20;					  //if you dont want to Modify Object 1 use final keyword
//		System.out.println(obj.y);    
		
		
//		System.out.println("Your name is " + fname + obj.lname);  // Multiple Attributes
//		System.out.println("Your age is " + obj.age);			  // Multiple Attributes
	
//		myStaticMethod();
//		obj.myPublicMethod();
		
		// Java Inheritance method
//		Student myObj = new Student();
//		System.out.println("Name: " + myObj.fname + " Age: " + myObj.age + " Graduation Year: " + myObj.graduationYear);
//		myObj.study();
		
//		// Java Get and Set value using Encapsulation
//		Person perObj = new Person();
//		System.out.println(perObj.getName());
//		perObj.setName("name value is passed in getter and setter");
//		System.out.println(perObj.getName());
		
//		// Java Packages with Scanner
//		@SuppressWarnings("resource")
//		Scanner scanObj1 = new Scanner(System.in);
//		@SuppressWarnings("resource")
//		Scanner scanObj2 = new Scanner(System.in);
//		@SuppressWarnings("resource")
//		Scanner scanObj3 = new Scanner(System.in);
//		System.out.println("Enter username age and degree");
//		
//		String userName = scanObj1.nextLine();
//	    System.out.println("Your name is : " + userName);
//	    
//	    int age = scanObj2.nextInt();
//	    System.out.println("Your age is : " + age);
//		
//		Boolean degree = scanObj3.nextBoolean();
//	    System.out.println("You completed your degree: " + degree);
		
//		//Java Polymorphism it extendes from main class poly to subclass dog and horse
//		Poly newPoly1 = new Poly();
//		newPoly1.animalSound();
//		
//		Poly newPoly2 = new Dog();
//		newPoly2.animalSound();
//		
//		Poly newPoly3 = new Horse();
//		newPoly3.animalSound();	
		
//		//Java Inner Classes
//		Outer out = new Outer();
//		Outer.Inner in =  out.new Inner(); // Inner Class you can't access it without creating an Outer object
//		Outer.Last lt = new Outer.Last();  // Static Inner Class you can access it without creating an Outer object
//		Outer.InnerMethod myInner = out.new InnerMethod(); // Access Outer Class From Inner Method
//	    System.out.println(myInner.myInnerMethod());
//		System.out.println(out.x + in.y + lt.z);
		
//		// Java Abstraction Method
//		Abstract newAbs = new Abstract();
//		newAbs.animalSound();
//		newAbs.sleep();
		
//		// Java Interface Method
//		Interface newInter = new Interface();
//		newInter.printOutput();
//		System.out.println("Output value is " + newInter.showOutput());
//		newInter.myOtherMethod();
		
//		Level lowLevel = Level.LOW;
//		Level mediumLevel = Level.MEDIUM;
//		Level highLevel = Level.HIGH;
//		System.out.println(lowLevel);
//		System.out.println(mediumLevel);
//		System.out.println(highLevel);
//		
//		switch(highLevel) {
//		case LOW: 
//			System.out.println("This is lowLevel");
//			break;
//		case MEDIUM: 
//			System.out.println("This is mediumLevel");
//			break;
//		case HIGH: 
//			System.out.println("This is highLevel");
//			break;	
//		}
//	
//		for (Level myVar : Level.values()) {
//			  System.out.println(myVar);
//			}
		
//		//Java Date and Time
//		 LocalDate myDat = LocalDate.now(); // Create a date object
//		 System.out.println(myDat); // Display the current date
//		    
//		 LocalTime myTim = LocalTime.now();  // Create a Time object
//		 System.out.println(myTim);			 // Display the current Time
//		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss"); // Create formattedTime
//		 String formattedTime = myTim.format(myFormatObj);						  // formattedTime Convert
//		 System.out.println(formattedTime);  									  // Display formattedTime
		    
		// Java Exceptions using try and catch
		
//		try {
//		      int[] myNumbers = {1, 2, 3};
//		      System.out.println(myNumbers[5]);
//		    } catch (Exception e) {
//		      System.out.println("Exceptin is " + e);
//		    } finally {		//The finally statement lets you execute code, after try...catch, regardless of the result:
//		        System.out.println("The 'try catch' is finished.");
//		    }
		  
//		//The throw keyword Exception
//		checkAge(16);   
		    
//		 //Java Regular Expressions
//		 Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
//		    Matcher matcher = pattern.matcher("Visit W3Schools!");
//		    boolean matchFound = matcher.find();
//		    if(matchFound) {
//		      System.out.println("Match found");
//		    } else {
//		      System.out.println("Match not found");
//		    }
		 
//		//Java Threads
//		Thread1 obj1 = new Thread1();
//		obj1.start();
//		try {
//			obj1.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		    
//		Runnable obj2 = new Thread2();
//		Thread t2 = new Thread(obj2);
//		t2.start();
		
		//Java Files
//		try {
//		 FileWriter myWriter = new FileWriter("filename.txt");
//	      myWriter.write("Files in Java might be tricky, but it is fun enough!");
//	      myWriter.close();
//	      System.out.println("Successfully wrote to the file.");
//	    } catch (IOException e) {
//	      System.out.println("An error occurred.");
//	      e.printStackTrace();
//	    }
		
		//Add two numbers
		
//		@SuppressWarnings("resource")
//		Scanner obj = new Scanner(System.in);
//		System.out.println("please enter x");
//		int x = obj.nextInt(); 
//		
//		System.out.println("please enter y");
//		int y = obj.nextInt(); 
//		
//		int sum = x + y;
//		System.out.println("please output is " + sum);
		
		// Count Number of Words in a String
		
//		String words = "One Two Three Four";
//		System.out.println(words.split("\\s").length);

		// Java How To Reverse a String
//		String originalStr = "Hello";
//		String reversedStr = "";
//
//		for (int i = 0; i < originalStr.length(); i++) {
//		  reversedStr = originalStr.charAt(i) + reversedStr;
//		}
//		System.out.println("Reversed string: "+ reversedStr);
		
		//Calculate the Sum of an Array
//		int[] myArray = {1, 5, 10, 25};
//		int sum = 0;
//		for (int i = 0; i < myArray.length; i++) {
////			sum = sum + myArray[i];
//			sum += myArray[i];
//		}
//		System.out.println(sum);
		
		//How To Sort an Array
//		String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
//		Arrays.sort(cars);
//		System.out.println(cars.length);
//		for (String i : cars) {
//			System.out.println(i);
//		}
		
//		//How To Find the Smallest Element in an Array
//		int ages[] = {20, 22, 18, 35, 48, 16, 87, 10};
//		int small = ages[0];
//		for (int i : ages) {
//			if(small > i)
//				small = i;	
//		}
//		System.out.println(small);
		
		
//		// Print the * system
//		System.out.println("*\n**\n***\n****");	
		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please Enter Number1");
//		int num1 = sc.nextInt();
//		System.out.println("Please Enter Number2");
//		int num2 = sc.nextInt();
//		if (num1 == num2) {
//			System.out.println("Equal");
//		} else if (num1 < num2) {
//			System.out.println("num1 is Lesser");
//		} else {
//			System.out.println("num1 is Greater");
//		}
		
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int button = sc.nextInt();
//		if(button == 1) {
//			System.out.println("Hello");
//		} else if (button == 2) {
//			System.out.println("Namaste");
//		} else if (button == 3){
//			System.out.println("Bonjour");
//		}
		
//		switch(button) {
//		case 1: System.out.println("Hello");
//		break;
//		case 2: System.out.println("Namaste");
//		break;
//		case 3: System.out.println("Bonjour");
//		break;
//		default: System.out.println("Invalid Button");
//		}	
		
//		// Print the Prime numbers
//		int N = 100;
//		for(int i=1; i<=N; i++){
//            //check if current number is prime
//            if(isPrime(i)) {
//                System.out.print(i + " ");
//            }
//		}
			
//		ApnaCollege obj = new ApnaCollege();
//		obj.solidRectangle();
//		obj.hollowRectangle();	
//		obj.halfPyramid();
//		obj.reverseHalfPyramid1();
//		obj.reverseHalfPyramid2();
//		obj.InvertedHalfPyramid();
//		obj.halfPyramidnumber();
//		obj.invertedHalfPyramidnumber1();
//		obj.invertedHalfPyramidnumber2();
//		obj.floydsTriangle();
//		obj.onezeroTriangle();	
//		obj.solidRhombus();
//		obj.numberPyramid();
//		obj.palandromicNumberPyramid();
//		obj.butterflyPattern();
//		obj.diamondPattern1();
//		obj.diamondPattern2();
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		int r = sc.nextInt();
	
//		obj.factorial(num);
		
//		boolean val = obj.primeNumber(num);
//		if (val) {
//			System.out.println("The number is a prime number");
//		} else {
//			System.out.println("The number is not a prime number");
//		}	
		
//		obj.tableNumber(num);
//		int res = obj.recurssion(num);
//		System.out.println(res);
//		obj.printAverage(num1, num2, num3);
//		obj.printOddNumber(num);
//		obj.greatestNumber(num1, num2);
//		obj.circumferenceCircle(r);
//		obj.votingAge(num);
//		obj.lopping();
//		obj.power(num, num1);
//		int GCD = obj.greatestCommonDivisor(num, num1);
//		System.out.println("GCD = " + GCD);		
//		obj.fibnochiSeries(num);		
//		obj.printNames();
//		obj.minmaxNumbers();
//		boolean value = obj.sortedNumbers();
//		if(value)
//			System.out.println("The Array is Sorted");
//		else 
//			System.out.println("The Array is not Sorted");
//		obj.StringBuilderFind();
		
// ---------------------------------------   Bit Manipulation    --------------------------------
		
//		//get Bit
//		int n = 5;
//		int pos = 2;
//		int bitmask = 1 << pos;
//		
//		if ((bitmask & n) == 0) 
//			System.out.println("The Bit was Zero");
//		else 
//			System.out.println("The Bit was 0ne");
		
//		//set Bit
//		int n = 5;
//		int pos = 1;
//		int bitmask = 1 << pos;
//		int newNumber = bitmask | n;
//		System.out.println(newNumber);
		
//		//clear Bit
//		int n = 5;
//		int pos = 2;
//		int bitmask = 1 << pos;
//		int notBitmask = ~ bitmask;
//		int newvalue = notBitmask & n;
//		System.out.println(newvalue);
		
//		//update Bit for 1
//		int oper = sc.nextInt();		
//		// oper = 1 : set Bit oper = 0 : clear Bit
//		int n = 5;
//		int pos = 1;
//		int bitmask = 1 << pos;
//		//set Bit Operation
//		if(oper == 1) {
//			//set Bit
//			int newNumber = bitmask | n;
//			System.out.println(newNumber);
//		} else {
//			//clear Bit
//			int notBitmask = ~ bitmask;
//			int newvalue = notBitmask & n;
//			System.out.println(newvalue);
//		}
		
//		sortingApna obj1 = new sortingApna();
//		obj1.ascBubbleSort();
//		obj1.desBubbleSort();
//		obj1.selectionSort();
//		obj1.insertionSort();
//		//Advanced sort
//		obj1.mergeSort();
//		obj1.quickSort();
		
//		Recursion1 obj2 = new Recursion1();
//		obj2.printNumAsc(1);
//		obj2.printNumDes(5);
//		obj2.printSum(5, 0);
//		obj2.printSumFor(5, 0);
//		int res = obj2.printFactorial(5);
//		System.out.println(res);
//		int res1 = obj2.printFactorialFor(5);
//		System.out.println(res1);
//		// 1 Approach 
//		obj2.printFib(0,1,7);
//		// 2 Approach 
//		int a = 0;
//		int b = 1;
//		System.out.println(a);
//		System.out.println(b);
//		int n = 7;
//		obj2.printFibo(a, b, n-2);
//		int res2 = obj2.calcPower(2, 5);
//		System.out.println(res2);
//		int res3 = obj2.calcLogPower(2, 5);
//		System.out.println(res3);
		
//		Recursion2 obj3 = new Recursion2();
//		int n = 3;
//		obj3.towerOfHanoi(n, "S", "H", "D");
//		String str = "abcd";
//		int idx = str.length()-1;
//		obj3.stringReverse(str, idx);
		
//		String str = "abaacdaefaah";
//		int idx = 0;
//		char element = 'a';
//		obj3.findOccurance(str, idx, element);
		
//		int[] str = {2,3,4,5};
//		int idx = 0;
//		boolean res = obj3.checkSorted(str, idx);
//		System.out.println(res);
		
//		String str = "axbcxxd";
//		int idx = 0;
//		String newStr = "";
//		obj3.moveElement(str, idx, 0, newStr);
		
//		String str = "abbccda";
//		int idx = 0;
//		String newStr = "";
//		obj3.removeDuplicate(str, idx, newStr);
		
//		String str = "abc";
//		int idx = 0;
//		String newStr = "";
//		obj3.subSequence(str, idx, newStr);
		
//		String str = "aaa";
//		int idx = 0;
//		String newStr = "";
//		HashSet<String> set = new HashSet<>();
//		obj3.subSequenceSame(str, idx, newStr, set);
		
//		String str = "23";
//		int idx = 0;
//		String comb = "";
//		obj3.KeypadCombination(str, idx, comb);
		
		Recursion3 obj4 = new Recursion3();
		String str = "abc";
		String permutation = "";
		obj4.printPerumationBack(str, permutation, 0);
	
//		int n = 3, m = 3;
//		int total = obj4.totalPaths(0, 0, n, m);
//		System.out.println(total);
		
//		int n = 4, m = 2;
//		int total = obj4.placeTiles(n, m);
//		System.out.println(total);
		
//		int n = 4;
//		int total = obj4.callGuest(n);
//		System.out.println(total);
		
//		int n = 3;
//		ArrayList<Integer> subset = new ArrayList<>();
//		obj4.printSubset(n, subset);
		
//		ChessBoard obj5 = new ChessBoard();
//		List<List<String>> ans = obj5.solveQueen(4);
//		System.out.println(ans);
		
//		List<String> result = fizzBuzz(30);
//		
//		for (String s : result) { 
//            System.out.print(s + " "); 
//        } 
		
//		String val = "Faizal";
//		String Res = reverseWords(val);
//		System.out.println(Res);
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		long val = Arrays.stream(num)
		.filter(f -> f % 2 == 0)
		.sum();
		System.out.println(val);
		
		
		List<String> names = Arrays.asList("sarath", "raju", "ravi", "sarath", "sarath");
		long value = names.stream()
		.filter(f -> f == "sarath")
		.count();
		System.out.println(value);
		System.out.println(palendrom());
		ListIterator<String> lt = names.listIterator();
		while (lt.hasNext()) {
		System.out.println(lt.next());
//		if (lt.next() == "sarath") {
//			lt.set("Raju");
//		}
		}
	}
}
