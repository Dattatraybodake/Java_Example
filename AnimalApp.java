package abstraction_demo;

abstract class Animal
{
	abstract void makeSound();
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog is Barking");
	}
}

class Cat extends Animal
{

	void makeSound()
	{
		System.out.println("Cat is Meowing");
	}
}

public class AnimalApp {
	public static void main(String[] args) {
		Dog dg=new Dog();
		dg.makeSound();

		Cat ct=new Cat();
		ct.makeSound();
	}
}

/*
Algorithm/Steps to Create This Program:

Define an Abstract Class:
Create an abstract class (e.g., Animal).
Declare an abstract method (e.g., makeSound()), which should not have a body but must be implemented by subclasses.

Extend the Abstract Class:
Create concrete classes (e.g., Dog and Cat) that extend the abstract class Animal.
In each subclass, implement the abstract method (makeSound()).

Implement the Method:
For each subclass (e.g., Dog, Cat), provide the specific behavior for the makeSound() method.
In Dog, print "Dog is Barking".
In Cat, print "Cat is Meowing".

Create Objects and Call Methods:
In the main method, create instances of Dog and Cat.
Call the makeSound() method on each object to demonstrate polymorphism and output their respective sounds.
*/