package ProjectDemo;

public interface Interface {   
	public void Sound();// interface method (does not have a body)
	public void sleep();	
	
	class Dog implements Interface{ // Dog "implements" the Animal interface
		public void sound() {
		System.out.println("Dog Sound: Bark");
		}
		public void sleep() {
			System.out.println("Dog Sleep: Slient");
		}
		}
	class Main{
		public static void main(String[] args) {
			Dog MyDog = new Dog();
			MyDog.Sound();
			MyDog.sleep();
		}
	}
}

/* 
 •	An interface is an abstract "class" that is used to group related methods with "empty" bodies: 
•	To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends ).
•	It is used to achieve total abstraction
•	In Java, interfaces are declared using the interface keyword. 
•	All methods in the interface are implicitly public and abstract. 
•	To use an interface in your class, append the keyword "implements" after your class name followed by the interface name.
•	Interface Animal what is meaning of interface?
•	An interface is a programming structure/syntax that allows the computer to apply certain properties on an object (class). For example, say we have a car class and a scooter class and a truck class.
 
 * */
 */