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
