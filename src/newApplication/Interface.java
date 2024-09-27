package newApplication;

interface FirstInterface {
	 public void printOutput(); // interface method (does not have a body)
	 public int showOutput(); // interface method (does not have a body) 
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

public class Interface implements FirstInterface, SecondInterface  {
	
	public void printOutput() {
		System.out.println("This is FirstInterface in printOutput");
	}
	
	public int showOutput() {
		return 20 + 20;
	}

	@Override
	public void myOtherMethod() {
		System.out.println("This is SecondInterface in myOtherMethod");	
	}
 
}
