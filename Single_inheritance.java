package inheritance;

//Superclass
class Animal
{
	void eat()
	{
		System.out.println("Animal is Eating");
	}
	void sleep()
	{
		System.out.println("Animal Seelping");
	}
}

// Subclass Extending a Single Superclass
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog is Barking");
	}
}
class Cat extends Animal
{
	void meow()
	{
		System.out.println("Cat is Meowing");
	}
}


public class Single_inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating Instance of subclass
		Dog myDog=new Dog();
		Cat mycat=new Cat();
		
		//Acceesiing Methods from the superclass
		
		myDog.eat();	//Inherited from Animal
		myDog.sleep();	//Inherited From Animal
		
		mycat.eat();	//Inherited From Animal
				
		mycat.sleep();	//Inherited from Animal
		
		//Accessing methods from the Superclass
		myDog.bark();	// Accessing methods from the subclass.
		mycat.meow();	// Accessing methods from the subclass.

	}

}
