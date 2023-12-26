/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass. */

abstract class Parent   //abstract class
{
    abstract void Message();    //abstract method
}
class Child1 extends Parent     //Inherit class
{
    void Message()
    {
        System.out.println("This is first Subclass");
    }
}
class Child2 extends Parent     //Inherit class
{
    void Message()
    {
        System.out.println("This is second Subclass");
    }
}
class Abst1
{
    public static void main(String args[])
    {
        Parent p1 =new Child1();    //(Factory method) Instance creation
        p1.Message();       //Method call
        Parent p2 =new Child2();   //Instance creation     
        p2.Message();   //Method call

    }
}