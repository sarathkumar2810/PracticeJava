package newApplication;

import java.util.HashSet;

public class Recursion2 {
	
	//stringOccurance
	public static int first = -1;
	public static int last  = -1;
	
	//removeDuplicate
	public static boolean[] map = new boolean[26];
	
	//KeypadCombination
	public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	public void towerOfHanoi(int n, String src, String help, String dest) {
		
		if (n == 1) {
			System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
			return;
		}
		towerOfHanoi(n-1, src, dest, help);
		System.out.println("Transfer disk " + n + " form " + src + " to " + dest);
		towerOfHanoi(n-1, help, src, dest);
	}
	
	public void stringReverse(String str, int idx) {
	
		if (idx == 0) {
			System.out.print(str.charAt(idx));
			return;
		}
		System.out.print(str.charAt(idx));
		stringReverse(str, idx-1);
	}
	
	public void findOccurance(String str, int idx, char element) {
		
		if (idx == str.length()) {
			System.out.println("first index is " + first);
			System.out.println("last index is " + last);
			return;
		}
		
		char currChar = str.charAt(idx);
		if (currChar == element) {
			if (first == -1) 			
				first = idx;
			else 		
				last = idx;
			
		}
		findOccurance(str, idx+1, element);
	}
	
	public boolean checkSorted(int arr[], int idx) {
		
		if (idx == arr.length-1) {
			return true;
		}
		
		if (arr[idx] < arr[idx + 1]) 			//if (arr[idx] >= arr[idx + 1]) ---> return false else checkSorted(arr, idx+1); 
			// array is Sorted
			return checkSorted(arr, idx+1);
		else			
			return false;			
	}
	
	public void moveElement(String str, int idx, int count, String newString) {
		
		if (idx == str.length()) {
			for (int i = 0; i < count; i++) {	
				newString += "x";
			}
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);
		if (currChar == 'x') {
			count ++;
			moveElement(str, idx+1, count, newString);
		} else {
			newString += currChar;
			moveElement(str, idx+1, count, newString);	
		}	
	}
	
	public void removeDuplicate(String str, int idx, String newString) {
		
		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}
		
		char currChar = str.charAt(idx);		
		if (map[currChar - 'a']) {
			removeDuplicate(str, idx+1, newString);	
		} else {
			newString += currChar;
			map[currChar - 'a'] = true;
			removeDuplicate(str, idx+1, newString);	
		}	
	}
	
	public void subSequence(String str, int idx, String newString) {
		
		if(idx == str.length()) {
			System.out.println(newString);
			return;	
		}
		
		char currChar = str.charAt(idx);
		//The String to come we add currChar
		subSequence(str, idx+1, newString+currChar);
		//The String not come
		subSequence(str, idx+1, newString);	
	}
	
	public void subSequenceSame(String str, int idx, String newString, HashSet<String> set) {
		
		if(idx == str.length()) {
			if (set.contains(newString)) {
				return;
			} else {
				System.out.println(newString);
				set.add(newString);
				return;
			}		
		}
		
		char currChar = str.charAt(idx);
		//The String to come we add currChar
		subSequenceSame(str, idx+1, newString+currChar, set);
		//The String not come
		subSequenceSame(str, idx+1, newString, set);	
	}	
	
	public void KeypadCombination(String str, int idx, String combination) {
		
		if(idx == str.length()) {
			System.out.println(combination);
			return;
		}
		
		char currChar = str.charAt(idx);
		String mapping = keypad[currChar - '0'];
		
		for(int i=0; i<mapping.length(); i++) {
			KeypadCombination(str, idx+1, combination+mapping.charAt(i));
		}
		
	}
		
}
