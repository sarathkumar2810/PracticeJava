package newApplication;

import java.util.ArrayList;

public class Recursion3 {
	
	public void printperm(String str, String permutation) {
		
		if (str.length() == 0) {
			System.out.println(permutation);
			return;
		}
		
		for (int i=0; i<str.length(); i++) {
			char currChar = str.charAt(i);
			//abc ---> if a is choosen bc, if b is choosen ac, if c is choosen ab
			String newStr = str.substring(0, i) + str.substring(i+1);
			printperm(newStr, permutation + currChar);
		}	
	}	
	
	public int totalPaths(int i, int j, int n, int m) {
		
		if(i == n || j == m) {
			return 0;
		}
		
		if(i == n-1 && j == m-1) {
			return 1;
		}
		
		//move downards
		int downPaths = totalPaths(i+1, j, n, m);
		
		//move right
		int rightPaths = totalPaths(i, j+1, n, m);
		
		return downPaths + rightPaths;
		
		}
	
	public int placeTiles(int n, int m) {
		
		if(n == m) {
			return 2;
		}
		
		if(n < m) {
			return 1;
		}
		//vertical
		int vertical = placeTiles(n-m, m);
		
		//horizontal
		int horizontal = placeTiles(n-1, m);
		
		return vertical + horizontal;
	}
	
	public int callGuest(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		//single
		int ways1 = callGuest(n-1);
		
		//pair
		int ways2 = (n-1) * callGuest(n-2);
		
		return ways1 + ways2;
	}
	
	public static void printSubsetValues( ArrayList<Integer> subset) {
		
		for(int i = 0; i < subset.size(); i++) {
			System.out.print(subset.get(i));
		}
		System.out.println();
	}
	
	public void printSubset(int n, ArrayList<Integer> subset) {
		
		if(n == 0) {
			printSubsetValues(subset);
			return;
		}
		
		//add
		subset.add(n);
		printSubset(n-1, subset);
		
		//dont add
		subset.remove(subset.size()-1);
		printSubset(n-1, subset);
	}
	
	public void printPerumationBack(String str, String perum, int idx) {
		
		if (str.length() == 0) {
			System.out.println(perum);
			return;
		}
		
		for (int i = 0; i < str.length(); i++) {
			char currChar = str.charAt(i);
			String newStr = str.substring(0, i) + str.substring(i+1);
			printPerumationBack(newStr, perum+currChar, idx+1);
		}
		
	}
	
	
}
