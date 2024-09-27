package newApplication;

public class Printer<T> {
	T thingtoPrint;
	
	Printer(T i) {
		this.thingtoPrint = i;
	}
	
	public void print() {
		 System.out.println(thingtoPrint.getClass().getName()
                 + " = " + thingtoPrint);
	}

}
