/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass. */

abstract class Parent
{
    abstract void Message();
}
class Child1 extends Parent
{
    void Message()
    {
        System.out.println("This is first Subclass");
    }
}
class Child2 extends Parent
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
        Parent p1 =new Child1();
        p1.Message();
        Parent p2 =new Child2();
        p2.Message();

    }
}