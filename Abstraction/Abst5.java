/*Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.*/
abstract class Animals  
{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats meow");
    }
    void dogs(){}
}
class Dogs extends Animals
{
    void dogs()
    {
        System.out.println( "Dogs bark");
    }
    void cats(){}
}
class Abst5
{
    public static void main(String args[])
    {
        Animals a1 = new Cats();
        a1.cats();

        Animals a2 = new Dogs();
        a2.dogs();
    }
}