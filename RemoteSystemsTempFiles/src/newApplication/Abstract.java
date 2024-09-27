package newApplication;

 abstract class Animal {
	public abstract void animalSound();
	  public void sleep() {
	    System.out.println("Zzz");
	  }
}

public class Abstract extends Animal {
	
	public void animalSound() {
		System.out.println("The animal makes a sound method");
	}

}
