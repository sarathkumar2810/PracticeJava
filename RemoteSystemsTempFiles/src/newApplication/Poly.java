package newApplication;

 class Poly {
	public void animalSound() {
		System.out.println("The animal makes a Sound");
	}

}

 class Dog extends Poly {
	public void animalSound() {
		System.out.println("The Dog makes a Bow Bow");
	}
}

 class Horse extends Poly {
	public void animalSound() {
		System.out.println("The Horse makes a Hee Hee");
	}
}
