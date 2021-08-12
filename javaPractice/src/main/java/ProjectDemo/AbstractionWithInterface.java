package ProjectDemo;

public class AbstractionWithInterface {

		   public static void main(String args[]) {
		      Animal tiger = new Tiger();
		      tiger.eat();
		      Cat lion = new Lion();
		      lion.eat();
		   }
		}
		interface Animal {
		   public void eat();
		}
		class Tiger implements Animal {
		   public void eat(){
		      System.out.println("Tiger eats");
		   }
		}
		abstract class Cat {
		   abstract public void eat();
		}
		class Lion extends Cat{
		   public void eat(){
		      System.out.println("Lion eats");
		   }
		}
		
//Abstract class can have abstract and non-abstract methods.
//doesn't support multiple inheritance.
//	can have final, non-final, static and non-static variables.
//	An abstract class can be extended using keyword "extends".
//	abstract class can have class members like private, protected, etc.
		
//----Interface----

//an have only abstract methods. Since Java 8, it can have default and static methods also.
//supports multiple inheritance
//only static and final variables.
//can't provide the implementation of abstract class.
//interface can be implemented using keyword "implements".

