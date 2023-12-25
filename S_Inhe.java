//Write a java program to create a class Animal with a method called makesound().create a subclass called cat that overrides the makesound() method to bark.

class Animal
{
	void makesound()
	{
		System.out.println("Animals Makes a Sound");
	}
}
class Cat extends Animal
{
	void makesound()
	{
		System.out.println("Animals Makes a Meow Sound");
	}
}
class S_Inhe
{
public static void main(String args[])
{
	Cat c =new Cat();
	c.makesound();
	Animal a =new Animal();
	a.makesound();
}
}			